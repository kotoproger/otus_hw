package ru.otus.kondakov.homework.framework.controller.api;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.otus.kondakov.homework.framework.controller.model.LoginPost200Response;
import ru.otus.kondakov.homework.framework.controller.model.LoginPostRequest;
import ru.otus.kondakov.homework.framework.security.TokenService;
import ru.otus.kondakov.homework.framework.security.UserService;

@Controller
@RequestMapping("${openapi.oTUSHighloadArchitect.base-path:}")
@RequiredArgsConstructor
public class LoginApiController implements LoginApi {

    private final TokenService tokenService;
    private final AuthenticationManager authManager;
    private final UserService usrDetailsService;

    @Override
    public ResponseEntity<LoginPost200Response> loginPost(LoginPostRequest loginPostRequest) {
        UsernamePasswordAuthenticationToken authenticationToken =
            new UsernamePasswordAuthenticationToken(loginPostRequest.getId(), loginPostRequest.getPassword());
        Authentication auth = authManager.authenticate(authenticationToken);

        UserService.User user = (UserService.User) usrDetailsService.loadUserByUsername(loginPostRequest.getId());
        String access_token = tokenService.generateAccessToken(user);
        String refresh_token = tokenService.generateRefreshToken(user);

        return new ResponseEntity<>(new LoginPost200Response().token(access_token).refreshToken(refresh_token), HttpStatus.OK);
    }

    @Override
    public RefreshTokenResponse refreshToken(HttpServletRequest request) {
        String headerAuth = request.getHeader("Authorization");
        String refreshToken = headerAuth.substring(7, headerAuth.length());

        String email = tokenService.parseToken(refreshToken);
        UserService.User user = (UserService.User) usrDetailsService.loadUserByUsername(email);
        String access_token = tokenService.generateAccessToken(user);
        String refresh_token = tokenService.generateRefreshToken(user);

        return new RefreshTokenResponse(access_token, refresh_token);
    }

}
