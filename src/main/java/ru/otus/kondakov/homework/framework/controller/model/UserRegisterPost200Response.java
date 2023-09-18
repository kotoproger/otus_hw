package ru.otus.kondakov.homework.framework.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * UserRegisterPost200Response
 */

@JsonTypeName("_user_register_post_200_response")
@Data
public class UserRegisterPost200Response {

  private Long id;

  @Schema(name = "id", example = "e4d2e6b0-cde2-42c5-aac3-0b8316f21e58", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public Long Id() {
    return id;
  }

  public UserRegisterPost200Response setId(Long userId) {
    this.id = userId;

    return this;
  }
}

