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

    public User setId(Long id) {
        this.id = id;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getEncodedPassword() {
        return encodedPassword;
    }

    public User setEncodedPassword(String encodedPassword) {
        this.encodedPassword = encodedPassword;
        return this;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public User setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public User setBirthday(LocalDate birthday) {
        this.birthday = birthday;
        return this;
    }

    public String getBiography() {
        return biography;
    }

    public User setBiography(String biography) {
        this.biography = biography;
        return this;
    }

    public String getCity() {
        return city;
    }

    public User setCity(String city) {
        this.city = city;
        return this;
    }

    public Sex getSex() {
        return sex;
    }

    public User setSex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public enum Sex {
        male, female
    }
}
