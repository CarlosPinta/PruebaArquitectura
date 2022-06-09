package ec.edu.espe.prueba.pinta.pinta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "seg_usuario_espacio")
public class UsuarioEspacio implements Serializable {

    private static final long serialVersionUID = 134L;
    @EmbeddedId
    private UsuarioEspacioPK pk;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    public UsuarioEspacio() {
    }

    public UsuarioEspacio(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public UsuarioEspacioPK getPk() {
        return pk;
    }

    public void setPk(UsuarioEspacioPK pk) {
        this.pk = pk;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}

