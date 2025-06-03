package io.github.devopMarkz.BatePapo.controllers;

import io.github.devopMarkz.BatePapo.dto.AuthDTO;
import io.github.devopMarkz.BatePapo.services.TokenService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private final TokenService tokenService;
    private final AuthenticationManager authenticationManager;

    public LoginController(TokenService tokenService, AuthenticationManager authenticationManager) {
        this.tokenService = tokenService;
        this.authenticationManager = authenticationManager;
    }

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody AuthDTO authDTO) {
        var authenticationToken = new UsernamePasswordAuthenticationToken(authDTO.nomeUsuario(), authDTO.senha());
        authenticationManager.authenticate(authenticationToken);
        return ResponseEntity.ok(tokenService.obterToken(authDTO));
    }

}
