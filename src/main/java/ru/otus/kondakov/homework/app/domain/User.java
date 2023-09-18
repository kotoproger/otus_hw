package ru.otus.kondakov.homework.app.domain;

import java.time.LocalDate;
import java.time.Period;
import javax.validation.constraints.NotNull;

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
    @NotNull
    private Sex sex;

    public int getAge() {
        return Period.between(birthday, LocalDate.now()).getYears();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncodedPassword() {
        return encodedPassword;
    }

    public void setEncodedPassword(String encodedPassword) {
        this.encodedPassword = encodedPassword;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getBiography() {
        return biography;
    }

    public void setBiography(String biography) {
        this.biography = biography;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public enum Sex {
        male, female
    }
}
