package ru.otus.kondakov.homework.app.domain;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class User {
    private Long id;
    @NotNull
    private String login;
    @NotNull
    private String password;
    private String encodedPassword;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private OffsetDateTime birthday;
    @NotNull
    private String biography;
    @NotNull
    private String city;

    public int getAge() {
        return Period.between(birthday.toLocalDate(), LocalDate.now()).getYears();
    }

}
