package ru.otus.kondakov.homework.app.domain;

import java.time.LocalDate;
import java.time.Period;
import javax.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
    private Long id;
    @NotNull
    private String password;
    private String encodedPassword;
    @NotNull
    private String name;
    @NotNull
    private String surname;
    @NotNull
    private LocalDate birthday;
    @NotNull
    private String biography;
    @NotNull
    private String city;

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

}
