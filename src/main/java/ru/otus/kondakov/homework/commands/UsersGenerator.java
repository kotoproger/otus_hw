package ru.otus.kondakov.homework.commands;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import ru.otus.kondakov.homework.app.CreateUser;
import ru.otus.kondakov.homework.app.domain.User;
import ru.otus.kondakov.homework.framework.storage.entity.Users;
import ru.otus.kondakov.homework.framework.storage.repository.UsersRepository;
import ru.otus.kondakov.homework.framework.utils.PasswordEncoder;

@Component
@RequiredArgsConstructor
public class UsersGenerator implements ApplicationRunner {
    private final CreateUser createUser;
    private final UsersRepository usersRepository;
    private final PasswordEncoder passwordEncoder;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        if (args.getOptionNames().contains("generate_users")) {
            System.out.println(args.getOptionValues("generate_users"));
            final int neededCount = Integer.parseInt(args.getOptionValues("generate_users").get(0));
            var faker = new Faker();
            List<Users> users = new ArrayList<>();
            int inserted = 0;
            List<Generator> generators = new ArrayList<>();
            List<Thread> threads = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                var generator = new Generator(neededCount, passwordEncoder);
                generators.add(generator);
                var thread = new Thread(generator);
                threads.add(thread);
                thread.start();
            }
            for (Thread thread : threads) {
                thread.join();
            }
            for (Generator generator : generators) {
                usersRepository.saveAll(generator.getList());
                System.out.println("saved " + generator.getList().size() + " items");
            }

            System.out.println("generated");
        }
    }

    public static class Generator implements Runnable {
        private final int count;
        private final PasswordEncoder passwordEncoder;
        private List<Users> list = new ArrayList<>();

        public Generator(int count, PasswordEncoder passwordEncoder) {
            this.count = count;
            this.passwordEncoder = passwordEncoder;
        }

        @SneakyThrows
        @Override
        public void run() {
            var faker = new Faker();
            for (int i = 0; i < count; i++) {
                list.add(
                    new Users()
                        .setBiography(faker.funnyName().name())
                        .setBirthDate(LocalDate.ofInstant(faker.date().birthday().toInstant(), ZoneId.systemDefault()))
                        .setCity(faker.address().city())
                        .setName(faker.name().firstName())
                        .setSurname(faker.name().lastName())
                        .setPassword_hash(passwordEncoder.encodePassword(faker.name().nameWithMiddle()))
                        .setSex(User.Sex.male)
                );
            }
        }

        public List<Users> getList() {
            return list;
        }
    }
}
