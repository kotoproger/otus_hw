package ru.otus.kondakov.homework.framework.storage;

import java.util.UUID;
import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.app.domain.User;
import ru.otus.kondakov.homework.app.port.UserStorageInterface;

@Service
public class UserStorage implements UserStorageInterface {
    @Override
    public User save(User user) {
        return null;
    }

    @Override
    public Summary getSummary(UUID id) {
        return null;
    }
}
