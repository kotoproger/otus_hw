package ru.otus.kondakov.homework.framework.storage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Data;
import ru.otus.kondakov.homework.app.domain.User;

@Entity
@Table(schema = "hw", name = "users")
@Data
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "surname", nullable = false)
    private String surname;

    @Column(name = "biography", nullable = false)
    private String biography;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "sex", nullable = false)
    @Enumerated(EnumType.STRING)
    private User.Sex sex;

    @Column(name = "password_hash", nullable = false)
    private String password_hash;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    public Long getId() {
        return id;
    }

    public Users setId(Long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Users setName(String name) {
        this.name = name;
        return this;
    }

    public String getSurname() {
        return surname;
    }

    public Users setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public String getBiography() {
        return biography;
    }

    public Users setBiography(String biography) {
        this.biography = biography;
        return this;
    }

    public String getCity() {
        return city;
    }

    public Users setCity(String city) {
        this.city = city;
        return this;
    }

    public User.Sex getSex() {
        return sex;
    }

    public Users setSex(User.Sex sex) {
        this.sex = sex;
        return this;
    }

    public String getPassword_hash() {
        return password_hash;
    }

    public Users setPassword_hash(String password_hash) {
        this.password_hash = password_hash;
        return this;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Users setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }
}
