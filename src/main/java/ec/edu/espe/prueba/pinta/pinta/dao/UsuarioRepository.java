package ec.edu.espe.prueba.pinta.pinta.dao;

import ec.edu.espe.prueba.pinta.pinta.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

    List<Usuario> findByEstado(String estado);
}
