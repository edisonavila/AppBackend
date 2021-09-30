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
import co.edu.unbosque.ciclo3back.model.Clientes;
import co.edu.unbosque.ciclo3back.dao.ClienteDAO;

@RestController //Representa objeto tipo rest
@RequestMapping("clientes")
public class ClienteAPI {
	
	@Autowired //Inyecta dependencias de JPA a proveedoresDao
	private ClienteDAO clienteDao;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Clientes cliente) {
		clienteDao.save(cliente);
	}
	
	@GetMapping("/listar")
	public List<Clientes>listar(){
		return clienteDao.findAll();
	}
	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable ("id") Long id) {
		clienteDao.deleteById(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Clientes cliente) {
		clienteDao.save(cliente);
	}
	
}
