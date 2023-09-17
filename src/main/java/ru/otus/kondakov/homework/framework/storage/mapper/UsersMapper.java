package ru.otus.kondakov.homework.framework.storage.mapper;

import org.mapstruct.Mapper;
import ru.otus.kondakov.homework.app.domain.User;
import ru.otus.kondakov.homework.framework.storage.entity.Users;

@Mapper(componentModel = "spring")
public interface UsersMapper {
    User map(Users user);

    Users map(User user);
}
