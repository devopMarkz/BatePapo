package io.github.devopMarkz.BatePapo.controllers;

import io.github.devopMarkz.BatePapo.dto.usuario.UsuarioCriacaoDTO;
import io.github.devopMarkz.BatePapo.dto.usuario.UsuarioRespostaDTO;
import io.github.devopMarkz.BatePapo.services.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static io.github.devopMarkz.BatePapo.utils.UriGenerator.gerarUri;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<UsuarioRespostaDTO> cadastrarUsuario(@RequestBody @Valid UsuarioCriacaoDTO criacaoDTO) {
        var usuarioResposta = usuarioService.cadastrarUsuario(criacaoDTO);
        return ResponseEntity.created(gerarUri(usuarioResposta.getId())).body(usuarioResposta);
    }

}
