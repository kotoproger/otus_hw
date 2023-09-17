package ru.otus.kondakov.homework.framework.controller.api;

import java.util.Optional;
import javax.validation.constraints.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;

@Controller
@RequestMapping("${openapi.oTUSHighloadArchitect.base-path:}")
public class FriendApiController implements FriendApi {

    private final NativeWebRequest request;

    @Autowired
    public FriendApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}