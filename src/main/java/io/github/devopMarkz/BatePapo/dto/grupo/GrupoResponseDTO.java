package io.github.devopMarkz.BatePapo.dto.grupo;

import io.github.devopMarkz.BatePapo.dto.usuario.UsuarioRespostaDTO;

import java.util.List;

public class GrupoResponseDTO {
    private Long id;
    private String nome;
    private String descricao;
    private List<UsuarioRespostaDTO> usuarios;  // Usuários do grupo
    private List<UsuarioRespostaDTO> administradores;  // Administradores do grupo
    private List<MensagemResponseDTO> mensagens;  // Lista de mensagens relacionadas ao grupo

    // getters e setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public List<UsuarioRespostaDTO> getUsuarios() { return usuarios; }
    public void setUsuarios(List<UsuarioRespostaDTO> usuarios) { this.usuarios = usuarios; }

    public List<UsuarioRespostaDTO> getAdministradores() { return administradores; }
    public void setAdministradores(List<UsuarioRespostaDTO> administradores) { this.administradores = administradores; }

    public List<MensagemResponseDTO> getMensagens() { return mensagens; }
    public void setMensagens(List<MensagemResponseDTO> mensagens) { this.mensagens = mensagens; }
}
