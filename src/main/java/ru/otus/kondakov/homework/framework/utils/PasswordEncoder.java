package ru.otus.kondakov.homework.framework.utils;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.port.PasswordEncoderInterface;

@Service
public class PasswordEncoder implements PasswordEncoderInterface {
    @Value("${app.security.password_hash_salt}")
    private String salt;

    @Value("${app.security.password_hash_algorithm}")
    private String algorithm;

    @Value("${app.security.password_hash_count}")
    private Integer hashCount;

    @Override
    public String encodePassword(String password) throws NoSuchAlgorithmException {
        String hash = password;
        for (int i = 0; i < hashCount; i++) {
            hash = hash + salt;
            MessageDigest md = MessageDigest.getInstance(algorithm);
            byte[] digest = md.digest(hash.getBytes(StandardCharsets.UTF_8));
            hash = DatatypeConverter.printHexBinary(digest).toLowerCase();
        }

        return hash;
    }
}
