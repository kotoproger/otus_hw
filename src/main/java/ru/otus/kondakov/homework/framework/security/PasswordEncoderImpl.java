package ru.otus.kondakov.homework.framework.security;

import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PasswordEncoderImpl implements PasswordEncoder {
    private final ru.otus.kondakov.homework.framework.utils.PasswordEncoder encoder;

    @SneakyThrows
    @Override
    public String encode(CharSequence rawPassword) {
        return encoder.encodePassword(rawPassword.toString());
    }

    @SneakyThrows
    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return encodedPassword.equals(encoder.encodePassword(rawPassword.toString()));
    }
}
