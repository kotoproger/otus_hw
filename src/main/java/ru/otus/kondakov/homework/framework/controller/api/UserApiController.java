package ru.otus.kondakov.homework.framework.controller.api;

import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import ru.otus.kondakov.homework.app.CreateUser;
import ru.otus.kondakov.homework.app.GetSummary;
import ru.otus.kondakov.homework.framework.controller.mapper.UserApiMapper;
import ru.otus.kondakov.homework.framework.controller.model.UserRegisterPost200Response;
import ru.otus.kondakov.homework.framework.controller.model.UserRegisterPostRequest;
import ru.otus.kondakov.homework.framework.controller.model.UserSummary;

@Controller
@RequiredArgsConstructor
@RequestMapping("${openapi.oTUSHighloadArchitect.base-path:}")
public class UserApiController implements UserApi {

    private final NativeWebRequest request;
    private final GetSummary summary;
    private final UserApiMapper mapper;
    private final CreateUser createUser;

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<UserSummary> userGetIdGet(String id) {
        return new ResponseEntity<>(summary.get(Long.parseLong(id)).map(mapper::mapFromSummary).orElse(null), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<UserRegisterPost200Response> userRegisterPost(@Validated UserRegisterPostRequest userRegisterPostRequest) {
        return new ResponseEntity<>(
            mapper.mapCreateResponse(
                createUser.register(mapper.mapCreateRequest(userRegisterPostRequest))
            ),
            HttpStatus.OK
        );
    }
}
