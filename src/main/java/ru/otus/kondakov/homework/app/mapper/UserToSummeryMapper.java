package ru.otus.kondakov.homework.app.mapper;

import org.mapstruct.Mapper;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.app.domain.User;

@Mapper(componentModel = "spring")
public interface UserToSummeryMapper {
    Summary map(User user);
}
