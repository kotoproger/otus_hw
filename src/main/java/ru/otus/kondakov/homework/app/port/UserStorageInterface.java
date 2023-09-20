package ru.otus.kondakov.homework.app.port;

import java.util.List;
import java.util.Optional;
import ru.otus.kondakov.homework.app.domain.User;

public interface UserStorageInterface {
    User save(User user);

    Optional<User> getUser(Long id);

    List<User> find(String name, String surname);
}
