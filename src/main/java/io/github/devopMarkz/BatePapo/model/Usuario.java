package io.github.devopMarkz.BatePapo.model;

import io.github.devopMarkz.BatePapo.model.enums.Perfil;
import jakarta.persistence.*;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_usuarios")
public class Usuario implements UserDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_usuario", nullable = false, unique = true)
    private String nomeUsuario;

    @Column(name = "senha")
    private String senha;

    @Column(name = "telefone", unique = true, nullable = false)
    private String telefone;

    @Enumerated(EnumType.STRING)
    @Column(name = "perfil")
    private Perfil perfil;

    public Usuario() {
    }

    public Usuario(String nomeUsuario, String senha, String telefone) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.telefone = telefone;
    }

    public Usuario(String nomeUsuario, String senha, String telefone, Perfil perfil) {
        this.nomeUsuario = nomeUsuario;
        this.senha = senha;
        this.telefone = telefone;
        this.perfil = perfil;
    }

    public Usuario(Long id, String nomeUsuario, String senha, String telefone, Perfil perfil) {
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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) && Objects.equals(nomeUsuario, usuario.nomeUsuario) && Objects.equals(senha, usuario.senha) && Objects.equals(telefone, usuario.telefone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nomeUsuario, senha, telefone);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(perfil.name()));
    }

    @Override
    public String getPassword() {
        return this.senha;
    }

    @Override
    public String getUsername() {
        return this.nomeUsuario;
    }

    @Override
    public boolean isAccountNonExpired() {
        return UserDetails.super.isAccountNonExpired();
    }

    @Override
    public boolean isAccountNonLocked() {
        return UserDetails.super.isAccountNonLocked();
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return UserDetails.super.isCredentialsNonExpired();
    }

    @Override
    public boolean isEnabled() {
        return UserDetails.super.isEnabled();
    }
}
