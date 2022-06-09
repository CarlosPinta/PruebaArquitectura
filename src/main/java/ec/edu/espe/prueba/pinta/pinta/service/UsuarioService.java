package ec.edu.espe.prueba.pinta.pinta.service;

import ec.edu.espe.prueba.pinta.pinta.dao.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

}
