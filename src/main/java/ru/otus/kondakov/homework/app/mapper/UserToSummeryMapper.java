package ru.otus.kondakov.homework.app.mapper;

import org.mapstruct.Mapper;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.app.domain.User;

@Mapper(componentModel = "spring")
public interface UserToSummeryMapper {
    default Summary map(User user) {
        return new Summary(user.getId(), user.getName(), user.getSurname(), user.getAge(), user.getBiography(), user.getCity());
    }
}
