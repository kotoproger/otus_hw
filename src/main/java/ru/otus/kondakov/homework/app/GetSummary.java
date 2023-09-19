package ru.otus.kondakov.homework.app;

import java.util.Optional;
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

    public Optional<Summary> get(Long id) {
        return this.storage.getUser(id).map(mapper::map);
    }
}
