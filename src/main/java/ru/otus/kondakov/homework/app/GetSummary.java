package ru.otus.kondakov.homework.app;

import java.util.UUID;
import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.app.port.UserStorageInterface;

@Service
public class GetSummary {
    private final UserStorageInterface storage;

    public GetSummary(UserStorageInterface storage) {
        this.storage = storage;
    }

    public Summary get(UUID id) {
        return this.storage.getSummary(id);
    }
}
