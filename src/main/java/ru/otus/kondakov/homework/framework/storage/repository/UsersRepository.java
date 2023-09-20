package ru.otus.kondakov.homework.framework.storage.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import ru.otus.kondakov.homework.framework.storage.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    List<Users> findByNameStartingWithAndSurnameStartingWithOrderByIdAsc(String name, String surname);
}
