package ec.edu.espe.prueba.pinta.pinta.resource;

import ec.edu.espe.prueba.pinta.pinta.dao.UsuarioEspacioRepository;
import ec.edu.espe.prueba.pinta.pinta.model.Espacio;
import ec.edu.espe.prueba.pinta.pinta.model.UsuarioEspacio;
import ec.edu.espe.prueba.pinta.pinta.service.UsuarioEspacioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/espacioUsuario")
public class UsuarioEspacioResource {

    private UsuarioEspacioService usuarioEspacioService;

    public UsuarioEspacioResource(UsuarioEspacioService usuarioEspacioService) {
        this.usuarioEspacioService = usuarioEspacioService;
    }

    @GetMapping(value = "{codUsuario}")
    public ResponseEntity<List<UsuarioEspacio>> listarFuncionalidadPorModulo(@PathVariable Integer codUsuario) {
        return ResponseEntity.ok(this.usuarioEspacioService.obtenerEspacioPorUsuario(codUsuario));
    }
}
