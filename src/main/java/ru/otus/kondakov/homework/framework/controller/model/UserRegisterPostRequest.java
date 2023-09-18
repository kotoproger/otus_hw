package ru.otus.kondakov.homework.framework.controller.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;
import ru.otus.kondakov.homework.app.domain.User;

/**
 * UserRegisterPostRequest
 */

@JsonTypeName("_user_register_post_request")
public class UserRegisterPostRequest {

    @NotNull
    private String firstName;

    @NotNull
    private String secondName;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    @NotNull
    private LocalDate birthday;

    @NotNull
    private String biography;

    @NotNull
    private String city;

    @NotNull
    private String password;

    @NotNull
    private User.Sex sex;

    @Schema(name = "sex", example = "male", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sex")
    public User.Sex getSex() {
        return sex;
    }

    public void setSex(User.Sex sex) {
        this.sex = sex;
    }

    public UserRegisterPostRequest firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Schema(name = "first_name", example = "Имя", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public UserRegisterPostRequest secondName(String secondName) {
        this.secondName = secondName;
        return this;
    }

    @Schema(name = "second_name", example = "Фамилия", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("second_name")
    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public UserRegisterPostRequest birthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    @Valid
    @Schema(name = "birthday", example = "Wed Feb 01 03:00:00 MSK 2017", description = "Дата рождения", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("birthday")
    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public UserRegisterPostRequest biography(String biography) {
        this.biography = biography;
        return this;
    }

    @Schema(name = "biography", example = "Хобби, интересы и т.п.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("biography")
    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public UserRegisterPostRequest city(String city) {
        this.city = city;
        return this;
    }

    @Schema(name = "city", example = "Москва", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public UserRegisterPostRequest password(String password) {
        this.password = password;
        return this;
    }

    @Schema(name = "password", example = "Секретная строка", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserRegisterPostRequest userRegisterPostRequest = (UserRegisterPostRequest) o;
        return Objects.equals(this.firstName, userRegisterPostRequest.firstName) &&
            Objects.equals(this.secondName, userRegisterPostRequest.secondName) &&
            Objects.equals(this.birthday, userRegisterPostRequest.birthday) &&
            Objects.equals(this.biography, userRegisterPostRequest.biography) &&
            Objects.equals(this.city, userRegisterPostRequest.city) &&
            Objects.equals(this.password, userRegisterPostRequest.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, secondName, birthday, biography, city, password);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserRegisterPostRequest {\n");
        sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
        sb.append("    secondName: ").append(toIndentedString(secondName)).append("\n");
        sb.append("    birthdate: ").append(toIndentedString(birthday)).append("\n");
        sb.append("    biography: ").append(toIndentedString(biography)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

