package ec.edu.espe.prueba.pinta.pinta.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class UsuarioEspacioPK implements Serializable {

    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;

    public UsuarioEspacioPK() {
    }

    public UsuarioEspacioPK(Integer codEspacio, Integer codUsuario) {
        this.codEspacio = codEspacio;
        this.codUsuario = codUsuario;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodUsuariop() {
        return codUsuario;
    }

    public void setCodUsuariop(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

}
