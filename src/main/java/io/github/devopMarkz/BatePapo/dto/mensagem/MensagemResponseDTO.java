package io.github.devopMarkz.BatePapo.dto.mensagem;

import io.github.devopMarkz.BatePapo.dto.conversa_privada.ConversaPrivadaResponseDTO;
import io.github.devopMarkz.BatePapo.dto.grupo.GrupoResponseDTO;
import io.github.devopMarkz.BatePapo.dto.usuario.UsuarioRespostaDTO;

import java.time.LocalDateTime;

public class MensagemResponseDTO {
    private Long id;
    private String texto;
    private LocalDateTime dataCriacao;
    private UsuarioRespostaDTO usuario;  // DTO do usuário
    private GrupoResponseDTO grupo;  // DTO do grupo (caso seja de grupo)
    private ConversaPrivadaResponseDTO conversaPrivada;  // DTO de conversa privada (caso seja de conversa privada)

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public LocalDateTime getDataCriacao() { return dataCriacao; }
    public void setDataCriacao(LocalDateTime dataCriacao) { this.dataCriacao = dataCriacao; }

    public UsuarioRespostaDTO getUsuario() { return usuario; }
    public void setUsuario(UsuarioRespostaDTO usuario) { this.usuario = usuario; }

    public GrupoResponseDTO getGrupo() { return grupo; }
    public void setGrupo(GrupoResponseDTO grupo) { this.grupo = grupo; }

    public ConversaPrivadaResponseDTO getConversaPrivada() { return conversaPrivada; }
    public void setConversaPrivada(ConversaPrivadaResponseDTO conversaPrivada) { this.conversaPrivada = conversaPrivada; }
}
