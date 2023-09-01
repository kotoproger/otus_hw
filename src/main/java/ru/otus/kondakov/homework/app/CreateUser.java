package ru.otus.kondakov.homework.app;

import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.domain.User;
import ru.otus.kondakov.homework.app.port.UserStorageInterface;

@Service
public class CreateUser {
    private final UserStorageInterface storage;

    public CreateUser(UserStorageInterface storage) {
        this.storage = storage;
    }

    public User register(User user) {
        return storage.save(user);
    }
}
