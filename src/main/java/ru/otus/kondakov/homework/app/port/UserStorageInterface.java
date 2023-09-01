package ru.otus.kondakov.homework.app.port;

import java.util.UUID;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.app.domain.User;

public interface UserStorageInterface {
    User save(User user);

    Summary getSummary(UUID id);
}
