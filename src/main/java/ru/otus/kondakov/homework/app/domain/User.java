package ru.otus.kondakov.homework.app.domain;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.Period;
import java.util.List;
import java.util.UUID;

public class User {
    private UUID id;
    private String login;
    private String password;
    private String encodedPassword;
    private String name;
    private String surname;
    private OffsetDateTime birthday;
    private List<String> interests;
    private String city;

    public UUID getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getEncodedPassword() {
        return encodedPassword;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OffsetDateTime getBirthday() {
        return birthday;
    }

    public List<String> getInterests() {
        return interests;
    }

    public String getCity() {
        return city;
    }

    public int getAge(){
        return Period.between(birthday.toLocalDate(), LocalDate.now()).getYears();
    }

    public String getPassword() {
        return password;
    }
}
