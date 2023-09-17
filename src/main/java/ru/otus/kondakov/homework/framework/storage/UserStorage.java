package ru.otus.kondakov.homework.framework.storage;

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
    public User getUser(Long id) {
        return mapper.map(
            repository.getById(id)
        );
    }
}
