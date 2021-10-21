package co.edu.unbosque.ciclo3back.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Optional;
import co.edu.unbosque.ciclo3back.model.Consecutivo;

import co.edu.unbosque.ciclo3back.model.Ventas;

public interface VentasDAO extends JpaRepository<Ventas, Long>{
	
	@Query("select new co.edu.unbosque.ciclo3back.model.Consecutivo(ifnull(max(v.codigo_venta),0)+1) from Ventas v")
	Optional<Consecutivo> obtenerConsecutivo();
}
