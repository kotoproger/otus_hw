package ru.otus.kondakov.homework.framework.controller.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.otus.kondakov.homework.app.domain.Summary;
import ru.otus.kondakov.homework.app.domain.User;
import ru.otus.kondakov.homework.framework.controller.model.UserRegisterPost200Response;
import ru.otus.kondakov.homework.framework.controller.model.UserRegisterPostRequest;
import ru.otus.kondakov.homework.framework.controller.model.UserSummary;

@Mapper(componentModel = "spring")
public interface UserApiMapper {
    @Mapping(target = "firstName", source = "name")
    @Mapping(target = "secondName", source = "surname")
    @Mapping(target = "birthdate", ignore = true)
    @Mapping(target = "biography", ignore = true)
    UserSummary mapFromSummary(Summary summary);

    User mapCreateRequest(UserRegisterPostRequest request);

    default UserRegisterPost200Response mapCreateResponse(User user) {
        return new UserRegisterPost200Response().setId(user.getId());
    }

    ;
}
