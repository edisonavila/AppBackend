package co.edu.unbosque.ciclo3back.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;
import co.edu.unbosque.ciclo3back.model.Usuarios;
import co.edu.unbosque.ciclo3back.dao.UsuarioDAO;

@RestController //Representa objeto tipo rest
@RequestMapping("usuarios")
public class UsuarioAPI {
	
	@Autowired //Inyecta dependencias de JPA a usuarioDao
	private UsuarioDAO usuarioDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Usuarios usuario) {
		usuarioDao.save(usuario);
	}
	
	@GetMapping("/listar")
	public List<Usuarios>listar(){
		return usuarioDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable ("id") Long id) {
		usuarioDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Usuarios usuario) {
		usuarioDao.save(usuario);
	}
	
}
