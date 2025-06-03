package io.github.devopMarkz.BatePapo.model;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

@Entity
@Table(name = "tb_mensagens")
public class Mensagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "texto", nullable = false, columnDefinition = "TEXT")
    private String texto;

    @CreationTimestamp
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "grupo_id", nullable = true)
    private Grupo grupo;

    public Mensagem() {
    }

    public Mensagem(String texto, LocalDateTime dataCriacao, Usuario usuario) {
        this.id = id;
        this.texto = texto;
        this.dataCriacao = dataCriacao;
        this.usuario = usuario;
    }

    public Mensagem(String texto, LocalDateTime dataCriacao, Usuario usuario, Grupo grupo) {
        this.texto = texto;
        this.dataCriacao = dataCriacao;
        this.usuario = usuario;
        this.grupo = grupo;
    }

    public Mensagem(Long id, String texto, LocalDateTime dataCriacao, Usuario usuario, Grupo grupo) {
        this.id = id;
        this.texto = texto;
        this.dataCriacao = dataCriacao;
        this.usuario = usuario;
        this.grupo = grupo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Mensagem mensagem = (Mensagem) o;
        return Objects.equals(id, mensagem.id) && Objects.equals(usuario, mensagem.usuario) && Objects.equals(grupo, mensagem.grupo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, grupo);
    }
}
