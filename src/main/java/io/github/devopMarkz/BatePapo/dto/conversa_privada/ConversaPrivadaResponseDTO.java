package io.github.devopMarkz.BatePapo.dto.conversa_privada;

import io.github.devopMarkz.BatePapo.dto.mensagem.MensagemResponseDTO;
import io.github.devopMarkz.BatePapo.dto.usuario.UsuarioRespostaDTO;

import java.util.List;

public class ConversaPrivadaResponseDTO {
    private Long id;
    private UsuarioRespostaDTO user1;
    private UsuarioRespostaDTO user2;
    private List<MensagemResponseDTO> mensagens;

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public UsuarioRespostaDTO getUser1() { return user1; }
    public void setUser1(UsuarioRespostaDTO user1) { this.user1 = user1; }

    public UsuarioRespostaDTO getUser2() { return user2; }
    public void setUser2(UsuarioRespostaDTO user2) { this.user2 = user2; }

    public List<MensagemResponseDTO> getMensagens() { return mensagens; }
    public void setMensagens(List<MensagemResponseDTO> mensagens) { this.mensagens = mensagens; }
}
