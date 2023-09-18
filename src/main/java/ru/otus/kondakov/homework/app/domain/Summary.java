package ru.otus.kondakov.homework.app.domain;

import java.time.LocalDate;

public record Summary(Long id, String name, String surname, int age, String biography, String city,
                      LocalDate birthDate) {
}
