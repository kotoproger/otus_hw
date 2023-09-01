package ru.otus.kondakov.homework.app.domain;

import java.util.List;
import java.util.UUID;

public record Summary(UUID id, String name, String surname, byte age, List<String> interests, String city) {
}
