package ru.otus.kondakov.homework.app.port;

import java.security.NoSuchAlgorithmException;

public interface PasswordEncoderInterface {
    String encodePassword(String password) throws NoSuchAlgorithmException;
}
