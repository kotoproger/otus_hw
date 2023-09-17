package ru.otus.kondakov.homework.framework.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.framework.controller.model.UserSummary;

@Mapper(componentModel = "spring")
public interface SummaryMapper {
    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "secondName", source = "surname")
    @Mapping(target = "birthdate", ignore = true)
    @Mapping(target = "biography", ignore = true)
    UserSummary map(Summary summary);
}
