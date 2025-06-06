package io.github.devopMarkz.BatePapo.dto.grupo;

import java.util.List;

public class GrupoCreateDTO {
    private String nome;
    private String descricao;
    private List<Long> usuariosIds;
    private List<Long> administradoresIds;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public List<Long> getUsuariosIds() { return usuariosIds; }
    public void setUsuariosIds(List<Long> usuariosIds) { this.usuariosIds = usuariosIds; }

    public List<Long> getAdministradoresIds() { return administradoresIds; }
    public void setAdministradoresIds(List<Long> administradoresIds) { this.administradoresIds = administradoresIds; }
}
