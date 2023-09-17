package ru.otus.kondakov.homework.app.domain;

import java.util.List;

public record Summary(Long id, String name, String surname, byte age, List<String> interests, String city) {
}
