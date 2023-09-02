package ru.otus.kondakov.homework.framework.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * DialogUserIdSendPostRequest
 */

@JsonTypeName("_dialog__user_id__send_post_request")
public class DialogUserIdSendPostRequest {

  private String text;

  public DialogUserIdSendPostRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DialogUserIdSendPostRequest(String text) {
    this.text = text;
  }

  public DialogUserIdSendPostRequest text(String text) {
    this.text = text;
    return this;
  }

  /**
   * Текст сообщения
   * @return text
  */
  @NotNull 
  @Schema(name = "text", example = "Привет, как дела?", description = "Текст сообщения", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("text")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DialogUserIdSendPostRequest dialogUserIdSendPostRequest = (DialogUserIdSendPostRequest) o;
    return Objects.equals(this.text, dialogUserIdSendPostRequest.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DialogUserIdSendPostRequest {\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

