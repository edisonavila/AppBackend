package co.edu.unbosque.ciclo3back.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unbosque.ciclo3back.dao.Detalle_ventasDAO;
import co.edu.unbosque.ciclo3back.model.Detalle_ventas;

@RestController
@RequestMapping("/detalle_ventas")

public class Detalle_ventasAPI {
	
	@Autowired
	private Detalle_ventasDAO detalle_ventaDAO;
	
	@PostMapping("/guardar")
	public void guardar(@RequestBody Detalle_ventas detalle_venta) {
		detalle_ventaDAO.save(detalle_venta);
	}
}
