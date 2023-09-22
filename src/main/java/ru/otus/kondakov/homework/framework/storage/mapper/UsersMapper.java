package ru.otus.kondakov.homework.framework.storage.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.otus.kondakov.homework.app.domain.User;
import ru.otus.kondakov.homework.framework.storage.entity.Users;

@Mapper(componentModel = "spring")
public interface UsersMapper {
    @Mapping(source = "birthDate", target = "birthday")
    @Mapping(source = "password_hash", target = "encodedPassword")
    @Mapping(target = "password", ignore = true)
    User map(Users user);

    @Mapping(target = "birthDate", source = "birthday")
    @Mapping(target = "password_hash", source = "encodedPassword")
    Users map(User user);
}
