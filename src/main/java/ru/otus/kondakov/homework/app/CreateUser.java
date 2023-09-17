package ru.otus.kondakov.homework.app;

import java.security.NoSuchAlgorithmException;
import javax.validation.Valid;
import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.domain.User;
import ru.otus.kondakov.homework.app.port.PasswordEncoderInterface;
import ru.otus.kondakov.homework.app.port.UserStorageInterface;

@Service
public class CreateUser {
    private final UserStorageInterface storage;
    private final PasswordEncoderInterface encoder;

    public CreateUser(UserStorageInterface storage, PasswordEncoderInterface encoder) {
        this.storage = storage;
        this.encoder = encoder;
    }

    public User register(@Valid User user) {
        try {
            user.setEncodedPassword(encoder.encodePassword(user.getPassword()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        return storage.save(user);
    }
}
