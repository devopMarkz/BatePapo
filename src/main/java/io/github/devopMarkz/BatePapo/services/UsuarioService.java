package io.github.devopMarkz.BatePapo.services;

import io.github.devopMarkz.BatePapo.dto.usuario.UsuarioCriacaoDTO;
import io.github.devopMarkz.BatePapo.dto.usuario.UsuarioRespostaDTO;
import io.github.devopMarkz.BatePapo.model.Usuario;
import io.github.devopMarkz.BatePapo.repositories.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository, ModelMapper modelMapper, PasswordEncoder passwordEncoder) {
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Transactional(rollbackFor = Exception.class)
    public UsuarioRespostaDTO cadastrarUsuario(UsuarioCriacaoDTO criacaoDTO) {
        Usuario usuario = modelMapper.map(criacaoDTO, Usuario.class);
        usuario.setSenha(passwordEncoder.encode(criacaoDTO.getSenha()));
        Usuario usuarioSalvo = usuarioRepository.save(usuario);
        return modelMapper.map(usuarioSalvo, UsuarioRespostaDTO.class);
    }

}
