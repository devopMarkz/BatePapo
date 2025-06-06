package io.github.devopMarkz.BatePapo.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "tb_conversa_privada")
public class ConversaPrivada {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user1_id", nullable = false)
    private Usuario user1;

    @ManyToOne
    @JoinColumn(name = "user2_id", nullable = false)
    private Usuario user2;

    @OneToMany(mappedBy = "conversaPrivada", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Mensagem> mensagens = new ArrayList<>();

    public ConversaPrivada() {
    }

    public ConversaPrivada(Usuario user1, Usuario user2) {
        this.user1 = user1;
        this.user2 = user2;
    }

    public ConversaPrivada(Long id, Usuario user1, Usuario user2) {
        this.id = id;
        this.user1 = user1;
        this.user2 = user2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUser1() {
        return user1;
    }

    public void setUser1(Usuario user1) {
        this.user1 = user1;
    }

    public Usuario getUser2() {
        return user2;
    }

    public void setUser2(Usuario user2) {
        this.user2 = user2;
    }

    public List<Mensagem> getMensagens() {
        return mensagens;
    }

    public void setMensagens(List<Mensagem> mensagens) {
        this.mensagens = mensagens;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ConversaPrivada that = (ConversaPrivada) o;
        return Objects.equals(id, that.id) && Objects.equals(user1, that.user1) && Objects.equals(user2, that.user2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user1, user2);
    }
}
