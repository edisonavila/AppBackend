package co.edu.unbosque.ciclo3back.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.unbosque.ciclo3back.model.Usuarios;

public interface UsuarioDAO extends JpaRepository<Usuarios, Long>{
	
}