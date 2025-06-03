package io.github.devopMarkz.BatePapo.dto.usuario;

import io.github.devopMarkz.BatePapo.model.enums.Perfil;

public class UsuarioRespostaDTO {

    private Long id;
    private String nomeUsuario;
    private String senha;
    private String telefone;
    private Perfil perfil;

    public UsuarioRespostaDTO() {
    }

    public UsuarioRespostaDTO(Long id, String nomeUsuario, String senha, String telefone, Perfil perfil) {
        this.id = id;
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.telefone = telefone;
        this.perfil = perfil;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
}
