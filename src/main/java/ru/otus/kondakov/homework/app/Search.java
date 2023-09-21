package ru.otus.kondakov.homework.app;

import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.app.mapper.UserToSummeryMapper;
import ru.otus.kondakov.homework.app.port.UserStorageInterface;

@RequiredArgsConstructor
@Service
public class Search {
    private final UserStorageInterface userStorage;
    private final UserToSummeryMapper mapper;

    public List<Summary> searchByPrefix(
        String name,
        String surname
    ) {
        return userStorage.find(name + "%", surname + "%").stream()
            .map(mapper::map)
            .toList();
    }
}
