package io.github.devopMarkz.BatePapo.services;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTCreationException;
import io.github.devopMarkz.BatePapo.dto.AuthDTO;
import io.github.devopMarkz.BatePapo.exceptions.TokenInvalidoException;
import io.github.devopMarkz.BatePapo.model.Usuario;
import io.github.devopMarkz.BatePapo.repositories.UsuarioRepository;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Service
public class TokenService {

    private final UsuarioRepository usuarioRepository;

    public TokenService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public String obterToken(AuthDTO authDTO) {
        var usuario = usuarioRepository.findByNomeUsuario(authDTO.nomeUsuario())
                .orElseThrow(() -> new UsernameNotFoundException("Usuário inexistente!"));
        return gerarToken(usuario);
    }

    private String gerarToken(Usuario usuario) {
        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            return JWT.create()
                    .withIssuer("BatePapoAPI")
                    .withSubject(usuario.getNomeUsuario())
                    .withClaim("Perfil", usuario.getPerfil().name())
                    .withExpiresAt(Instant.now().plus(8L, ChronoUnit.HOURS))
                    .sign(algorithm);
        } catch (JWTCreationException e){
            throw new TokenInvalidoException("Token inválido!");
        }
    }

    public String validarTokenRetornarNomeDeUsuario(String token) {
        try {
            Algorithm algorithm = Algorithm.HMAC256("secret");
            return JWT.require(algorithm)
                    .withIssuer("BatePapoAPI")
                    .build()
                    .verify(token)
                    .getSubject();
        } catch (JWTCreationException e){
            throw new TokenInvalidoException("Token inválido!");
        }
    }

}
