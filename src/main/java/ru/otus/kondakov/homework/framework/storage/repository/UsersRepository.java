package ru.otus.kondakov.homework.framework.storage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.kondakov.homework.framework.storage.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
