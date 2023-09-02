package ru.otus.kondakov.homework.app;

import java.util.UUID;
import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.app.mapper.UserToSummeryMapper;
import ru.otus.kondakov.homework.app.port.UserStorageInterface;

@Service
public class GetSummary {
    private final UserStorageInterface storage;
    private final UserToSummeryMapper mapper;

    public GetSummary(UserStorageInterface storage, UserToSummeryMapper mapper) {
        this.storage = storage;
        this.mapper = mapper;
    }

    public Summary get(UUID id) {
        return mapper.map(this.storage.getUser(id));
    }
}
