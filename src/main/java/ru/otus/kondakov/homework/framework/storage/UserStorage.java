package ru.otus.kondakov.homework.framework.storage;

import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.domain.User;
import ru.otus.kondakov.homework.app.port.UserStorageInterface;
import ru.otus.kondakov.homework.framework.storage.mapper.UsersMapper;
import ru.otus.kondakov.homework.framework.storage.repository.UsersRepository;

@Service
@RequiredArgsConstructor
public class UserStorage implements UserStorageInterface {
    private final UsersRepository repository;
    private final UsersMapper mapper;

    @Override
    public User save(User user) {
        return mapper.map(
            repository.save(
                mapper.map(user)
            )
        );
    }

    @Override
    public Optional<User> getUser(Long id) {
        return Optional.of(mapper.map(
            repository.getById(id)
        ));
    }

    @Override
    public List<User> find(String name, String surname) {
        var list = repository.findByNameStartingWithAndSurnameStartingWithOrderByIdAsc(name, surname);
        return list.stream().map(mapper::map).toList();
    }
}
