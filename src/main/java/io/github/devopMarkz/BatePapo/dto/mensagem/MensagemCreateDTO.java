package io.github.devopMarkz.BatePapo.dto.mensagem;

public class MensagemCreateDTO {
    private String texto;
    private Long usuarioId;
    private Long grupoId;  // Opcional (pode ser null)
    private Long conversaPrivadaId;  // Opcional (pode ser null)

    // getters e setters
    public String getTexto() { return texto; }
    public void setTexto(String texto) { this.texto = texto; }

    public Long getUsuarioId() { return usuarioId; }
    public void setUsuarioId(Long usuarioId) { this.usuarioId = usuarioId; }

    public Long getGrupoId() { return grupoId; }
    public void setGrupoId(Long grupoId) { this.grupoId = grupoId; }

    public Long getConversaPrivadaId() { return conversaPrivadaId; }
    public void setConversaPrivadaId(Long conversaPrivadaId) { this.conversaPrivadaId = conversaPrivadaId; }
}
