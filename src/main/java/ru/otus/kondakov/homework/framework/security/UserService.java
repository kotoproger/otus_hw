package ru.otus.kondakov.homework.framework.security;

import java.util.Collection;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import ru.otus.kondakov.homework.app.port.UserStorageInterface;

@Service
@RequiredArgsConstructor
public class UserService implements UserDetailsService {
    private final UserStorageInterface userStorage;

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return userStorage.getUser(Long.parseLong(username))
            .map((data) -> new User(data.getId().toString(), data.getEncodedPassword()))
            .orElseThrow();
    }

    public static class User implements UserDetails {
        private final String id;
        private final String password;

        public User(String id, String password) {
            this.id = id;
            this.password = password;
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {
            return List.of();
        }

        @Override
        public String getPassword() {
            return password;
        }

        @Override
        public String getUsername() {
            return id;
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }
    }
}
