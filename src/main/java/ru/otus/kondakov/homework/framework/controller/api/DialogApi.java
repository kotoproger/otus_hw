/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.0.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package ru.otus.kondakov.homework.framework.controller.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;
import ru.otus.kondakov.homework.framework.controller.model.DialogMessage;
import ru.otus.kondakov.homework.framework.controller.model.DialogUserIdSendPostRequest;
import ru.otus.kondakov.homework.framework.controller.model.LoginPost500Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.NativeWebRequest;

@Validated
@Tag(name = "dialog", description = "the dialog API")
public interface DialogApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /dialog/{user_id}/list
     *
     * @param userId  (required)
     * @return Диалог между двумя пользователями (status code 200)
     *         or Невалидные данные ввода (status code 400)
     *         or Неавторизованный доступ (status code 401)
     *         or Ошибка сервера (status code 500)
     *         or Ошибка сервера (status code 503)
     */
    @Operation(
        operationId = "dialogUserIdListGet",
        responses = {
            @ApiResponse(responseCode = "200", description = "Диалог между двумя пользователями", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = DialogMessage.class)))
            }),
            @ApiResponse(responseCode = "400", description = "Невалидные данные ввода"),
            @ApiResponse(responseCode = "401", description = "Неавторизованный доступ"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
            }),
            @ApiResponse(responseCode = "503", description = "Ошибка сервера", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/dialog/{user_id}/list",
        produces = { "application/json" }
    )
    default ResponseEntity<List<DialogMessage>> dialogUserIdListGet(
        @Parameter(name = "user_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"from\" : \"from\", \"to\" : \"to\", \"text\" : \"Привет, как дела?\" }, { \"from\" : \"from\", \"to\" : \"to\", \"text\" : \"Привет, как дела?\" } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /dialog/{user_id}/send
     *
     * @param userId  (required)
     * @param dialogUserIdSendPostRequest  (optional)
     * @return Успешно отправлено сообщение (status code 200)
     *         or Невалидные данные ввода (status code 400)
     *         or Неавторизованный доступ (status code 401)
     *         or Ошибка сервера (status code 500)
     *         or Ошибка сервера (status code 503)
     */
    @Operation(
        operationId = "dialogUserIdSendPost",
        responses = {
            @ApiResponse(responseCode = "200", description = "Успешно отправлено сообщение"),
            @ApiResponse(responseCode = "400", description = "Невалидные данные ввода"),
            @ApiResponse(responseCode = "401", description = "Неавторизованный доступ"),
            @ApiResponse(responseCode = "500", description = "Ошибка сервера", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
            }),
            @ApiResponse(responseCode = "503", description = "Ошибка сервера", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = LoginPost500Response.class))
            })
        },
        security = {
            @SecurityRequirement(name = "bearerAuth")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/dialog/{user_id}/send",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<Void> dialogUserIdSendPost(
        @Parameter(name = "user_id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("user_id") String userId,
        @Parameter(name = "DialogUserIdSendPostRequest", description = "") @Valid @RequestBody(required = false) DialogUserIdSendPostRequest dialogUserIdSendPostRequest
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}
