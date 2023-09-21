package ru.otus.kondakov.homework.framework.storage.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.otus.kondakov.homework.framework.storage.entity.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
    @Query("select u from Users u where lower(name) like :name and lower(surname) like :surname order by id asc")
    List<Users> findByNameStartingWithAndSurnameStartingWithOrderByIdAsc(@Param("name") String name, @Param("surname") String surname);
}
