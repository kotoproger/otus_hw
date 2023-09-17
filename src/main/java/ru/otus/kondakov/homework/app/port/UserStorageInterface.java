package ru.otus.kondakov.homework.app.port;

import ru.otus.kondakov.homework.app.domain.User;

public interface UserStorageInterface {
    User save(User user);

    public User getUser(Long id);
}
