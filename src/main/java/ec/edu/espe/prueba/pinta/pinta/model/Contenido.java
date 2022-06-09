package ec.edu.espe.prueba.pinta.pinta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "gdc_contenido")
public class Contenido  implements Serializable{

    private static final long serialVersionUID = 136L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido", nullable = false)
    private Integer codContenido;

    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;

    @Column(name = "cod_contenido_padre", nullable = false)
    private Integer CodContenidoPadre;

    @Column(name = "tipo_contenido", nullable = false, length = 2)
    private Integer tipoContenido;

    @Column(name = "nombre", nullable = false, length = 256)
    private String nombre;

    @Column(name = "nombre_archivo", nullable = false, length = 256)
    private String nombreArchivo;

    @Column(name = "version", nullable = false)
    @Version
    private Integer version;

    @Column(name = "estado", nullable = false)
    private Integer estado;

    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;

    public Contenido() {
    }

    public Contenido(Integer codContenido, Integer codEspacio, Integer codContenidoPadre) {
        this.codContenido = codContenido;
        this.codEspacio = codEspacio;
        CodContenidoPadre = codContenidoPadre;
    }

    public Integer getCodContenido() {
        return codContenido;
    }

    public void setCodContenido(Integer codContenido) {
        this.codContenido = codContenido;
    }

    public Integer getCodEspacio() {
        return codEspacio;
    }

    public void setCodEspacio(Integer codEspacio) {
        this.codEspacio = codEspacio;
    }

    public Integer getCodContenidoPadre() {
        return CodContenidoPadre;
    }

    public void setCodContenidoPadre(Integer codContenidoPadre) {
        CodContenidoPadre = codContenidoPadre;
    }

    public Integer getTipoContenido() {
        return tipoContenido;
    }

    public void setTipoContenido(Integer tipoContenido) {
        this.tipoContenido = tipoContenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Integer getEstado() {
        return estado;
    }

    public void setEstado(Integer estado) {
        this.estado = estado;
    }

    public Espacio getEspacio() {
        return espacio;
    }

    public void setEspacio(Espacio espacio) {
        this.espacio = espacio;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}
