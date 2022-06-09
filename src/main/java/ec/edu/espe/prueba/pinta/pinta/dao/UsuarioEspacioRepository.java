package ec.edu.espe.prueba.pinta.pinta.dao;

import ec.edu.espe.prueba.pinta.pinta.model.Espacio;
import ec.edu.espe.prueba.pinta.pinta.model.UsuarioEspacio;
import ec.edu.espe.prueba.pinta.pinta.model.UsuarioEspacioPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPK> {

    List<UsuarioEspacio> findByPkCodUsuario(Integer codUsuario);
}
