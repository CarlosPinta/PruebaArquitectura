package ec.edu.espe.prueba.pinta.pinta.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "gdc_contenido_version")
public class ContenidoVersion  implements Serializable {

    private static final long serialVersionUID = 136L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_contenido_version", nullable = false)
    private Integer codContenidoVersion;

    @Column(name = "hash_archivo", nullable = false, length = 32)
    private String hashArchivo;

    @Column(name = "nombre_archivo", nullable = false, length = 32)
    private String nombreArchivo;

    @Column(name = "tamanio", nullable = false)
    private Integer tamanio;

    @Column(name = "version", nullable = false)
    @Version
    private Integer version;

    @Column(name = "comentario", nullable = false, length = 32)
    private String comentario;

    @Column(name = "fecha_creacion", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaCreacion;

    @Column(name = "cod_usuario_creacion", nullable = false)
    private Integer codUsuarioCreacion;

    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;

    public ContenidoVersion() {
    }

    public ContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public Integer getCodContenidoVersion() {
        return codContenidoVersion;
    }

    public void setCodContenidoVersion(Integer codContenidoVersion) {
        this.codContenidoVersion = codContenidoVersion;
    }

    public String getHashArchivo() {
        return hashArchivo;
    }

    public void setHashArchivo(String hashArchivo) {
        this.hashArchivo = hashArchivo;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public Integer getTamanio() {
        return tamanio;
    }

    public void setTamanio(Integer tamanio) {
        this.tamanio = tamanio;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Integer getCodUsuarioCreacion() {
        return codUsuarioCreacion;
    }

    public void setCodUsuarioCreacion(Integer codUsuarioCreacion) {
        this.codUsuarioCreacion = codUsuarioCreacion;
    }

    public Contenido getContenido() {
        return contenido;
    }

    public void setContenido(Contenido contenido) {
        this.contenido = contenido;
    }
}
