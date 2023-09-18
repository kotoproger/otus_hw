package ru.otus.kondakov.homework.framework.storage.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDate;
import lombok.Data;

@Entity
@Table(schema = "hw", name = "users")
@Data
public class Users {
    @Id
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
    private Sex sex;

    @Column(name = "password_hash", nullable = false)
    private String password_hash;

    @Column(name = "birth_date", nullable = false)
    private LocalDate birthDate;

    public enum Sex {
        male, female
    }
}
