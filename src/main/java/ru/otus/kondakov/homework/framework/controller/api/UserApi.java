/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ru.otus.kondakov.homework.framework.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.Optional;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;
import ru.otus.kondakov.homework.framework.controller.model.LoginPost500Response;
import ru.otus.kondakov.homework.framework.controller.model.UserRegisterPost200Response;
import ru.otus.kondakov.homework.framework.controller.model.UserRegisterPostRequest;
import ru.otus.kondakov.homework.framework.controller.model.UserSummary;

@Validated
@Tag(name = "user", description = "the user API")
public interface UserApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /user/get/{id}
     * Получение анкеты пользователя
     *
     * @param id Идентификатор пользователя (required)
     * @return Успешное получение анкеты пользователя (status code 200)
     *         or Невалидные данные (status code 400)
     *         or Анкета не найдена (status code 404)
     *         or Ошибка сервера (status code 500)
     *         or Ошибка сервера (status code 503)
     */
    @Operation(
        operationId = "userGetIdGet",
        description = "Получение анкеты пользователя",
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешное получение анкеты пользователя", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserSummary.class))
            }),
            @ApiResponse(responseCode = "400", description = "Невалидные данные"),
            @ApiResponse(responseCode = "404", description = "Анкета не найдена"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
            }),
            @ApiResponse(responseCode = "503", description = "Ошибка сервера", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/user/get/{id}",
        produces = {"application/json"}
    )
    default ResponseEntity<UserSummary> userGetIdGet(
        @Parameter(name = "id", description = "Идентификатор пользователя", required = true, in = ParameterIn.PATH) @PathVariable("id") String id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"birthdate\" : \"2017-02-01T00:00:00.000+00:00\", \"city\" : \"Москва\", \"second_name\" : \"Фамилия\", \"id\" : \"id\", \"biography\" : \"Хобби, интересы и т.п.\", \"first_name\" : \"Имя\", \"age\" : 18 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /user/register
     * Регистрация нового пользователя
     *
     * @param userRegisterPostRequest  (optional)
     * @return Успешная регистрация (status code 200)
     *         or Невалидные данные (status code 400)
     *         or Ошибка сервера (status code 500)
     *         or Ошибка сервера (status code 503)
     */
    @Operation(
        operationId = "userRegisterPost",
        description = "Регистрация нового пользователя",
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешная регистрация", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = UserRegisterPost200Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "Невалидные данные"),
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
        value = "/user/register",
        produces = {"application/json"},
        consumes = {"application/json"}
    )
    ResponseEntity<UserRegisterPost200Response> userRegisterPost(
        @Parameter(name = "UserRegisterPostRequest", description = "") @Valid @RequestBody(required = false) UserRegisterPostRequest userRegisterPostRequest
    );


//    /**
//     * GET /user/search
//     * Поиск анкет
//     *
//     * @param firstName Условие поиска по имени (required)
//     * @param lastName Условие поиска по фамилии (required)
//     * @return Успешные поиск пользователя (status code 200)
//     *         or Невалидные данные (status code 400)
//     *         or Ошибка сервера (status code 500)
//     *         or Ошибка сервера (status code 503)
//     */
//    @Operation(
//        operationId = "userSearchGet",
//        description = "Поиск анкет",
//        responses = {
//            @ApiResponse(responseCode = "200", description = "Успешные поиск пользователя", content = {
//                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = UserSummary.class)))
//            }),
//            @ApiResponse(responseCode = "400", description = "Невалидные данные"),
//            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content = {
//                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
//            }),
//            @ApiResponse(responseCode = "503", description = "Ошибка сервера", content = {
//                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
//            })
//        }
//    )
//    @RequestMapping(
//        method = RequestMethod.GET,
//        value = "/user/search",
//        produces = {"application/json"}
//    )
//    default ResponseEntity<List<UserSummary>> userSearchGet(
//        @NotNull @Parameter(name = "first_name", description = "Условие поиска по имени", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "first_name", required = true) String firstName,
//        @NotNull @Parameter(name = "last_name", description = "Условие поиска по фамилии", required = true, in = ParameterIn.QUERY) @Valid @RequestParam(value = "last_name", required = true) String lastName
//    ) {
//        getRequest().ifPresent(request -> {
//            for (MediaType mediaType : MediaType.parseMediaTypes(request.getHeader("Accept"))) {
//                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
//                    String exampleString = "[ { \"birthdate\" : \"2017-02-01T00:00:00.000+00:00\", \"city\" : \"Москва\", \"second_name\" : \"Фамилия\", \"id\" : \"id\", \"biography\" : \"Хобби, интересы и т.п.\", \"first_name\" : \"Имя\", \"age\" : 18 }, { \"birthdate\" : \"2017-02-01T00:00:00.000+00:00\", \"city\" : \"Москва\", \"second_name\" : \"Фамилия\", \"id\" : \"id\", \"biography\" : \"Хобби, интересы и т.п.\", \"first_name\" : \"Имя\", \"age\" : 18 } ]";
//                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
//                    break;
//                }
//            }
//        });
//        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
//
//    }

}
