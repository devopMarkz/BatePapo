package io.github.devopMarkz.BatePapo.dto.usuario;

import io.github.devopMarkz.BatePapo.model.enums.Perfil;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UsuarioAtualizacaoDTO {

    @NotBlank(message = "Nome de usuário deve ser preenchido.")
    private String nomeUsuario;

    @NotBlank(message = "Senha deve ser preenchida.")
    private String senha;

    @Pattern(regexp = "\\d+", message = "O campo deve conter apenas números.")
    private String telefone;

    private Perfil perfil = Perfil.USUARIO;

    public UsuarioAtualizacaoDTO() {
    }

    public UsuarioAtualizacaoDTO(String nomeUsuario, String senha, String telefone) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.telefone = telefone;
    }

    public UsuarioAtualizacaoDTO(String nomeUsuario, String senha, String telefone, Perfil perfil) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.telefone = telefone;
        this.perfil = perfil;
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
