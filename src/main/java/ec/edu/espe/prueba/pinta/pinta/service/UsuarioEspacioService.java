package ec.edu.espe.prueba.pinta.pinta.service;

import ec.edu.espe.prueba.pinta.pinta.dao.UsuarioEspacioRepository;
import ec.edu.espe.prueba.pinta.pinta.model.Espacio;
import ec.edu.espe.prueba.pinta.pinta.model.UsuarioEspacio;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioEspacioService {

    private UsuarioEspacioRepository usuarioEspacioRepository;

    public List<UsuarioEspacio> obtenerEspacioPorUsuario(Integer codUsuario){
        return this.usuarioEspacioRepository.findByPkCodUsuario(codUsuario);
    }
}
