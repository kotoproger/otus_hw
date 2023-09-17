package ru.otus.kondakov.homework.framework.controller.api;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import ru.otus.kondakov.homework.app.GetSummary;
import ru.otus.kondakov.homework.framework.controller.mapper.SummaryMapper;
import ru.otus.kondakov.homework.framework.controller.model.UserSummary;

@Controller
@RequestMapping("${openapi.oTUSHighloadArchitect.base-path:}")
public class UserApiController implements UserApi {

    private final NativeWebRequest request;
    private final GetSummary summary;
    private final SummaryMapper summaryMapper;

    @Autowired
    public UserApiController(NativeWebRequest request, GetSummary summary, SummaryMapper summaryMapper) {
        this.request = request;
        this.summary = summary;
        this.summaryMapper = summaryMapper;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

    @Override
    public ResponseEntity<UserSummary> userGetIdGet(String id) {
        return new ResponseEntity<>(summaryMapper.map(summary.get(Long.parseLong(id))), HttpStatus.OK);
    }
}
