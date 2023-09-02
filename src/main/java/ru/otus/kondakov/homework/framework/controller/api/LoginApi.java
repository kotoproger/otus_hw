/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ru.otus.kondakov.homework.framework.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Optional;
import javax.validation.Valid;
import javax.validation.constraints.*;
import ru.otus.kondakov.homework.framework.controller.model.LoginPost200Response;
import ru.otus.kondakov.homework.framework.controller.model.LoginPost500Response;
import ru.otus.kondakov.homework.framework.controller.model.LoginPostRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

@Validated
@Tag(name = "login", description = "the login API")
public interface LoginApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /login
     * Упрощенный процесс аутентификации путем передачи идентификатор пользователя и получения токена для дальнейшего прохождения авторизации
     *
     * @param loginPostRequest  (optional)
     * @return Успешная аутентификация (status code 200)
     *         or Невалидные данные (status code 400)
     *         or Пользователь не найден (status code 404)
     *         or Ошибка сервера (status code 500)
     *         or Ошибка сервера (status code 503)
     */
    @Operation(
        operationId = "loginPost",
        description = "Упрощенный процесс аутентификации путем передачи идентификатор пользователя и получения токена для дальнейшего прохождения авторизации",
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешная аутентификация", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "Невалидные данные"),
            @ApiResponse(responseCode = "404", description = "Пользователь не найден"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
            }),
            @ApiResponse(responseCode = "503", description = "Ошибка сервера", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/login",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<LoginPost200Response> loginPost(
        @Parameter(name = "LoginPostRequest", description = "") @Valid @RequestBody(required = false) LoginPostRequest loginPostRequest
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"token\" : \"e4d2e6b0-cde2-42c5-aac3-0b8316f21e58\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
