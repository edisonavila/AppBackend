package co.edu.unbosque.ciclo3backGrupo13.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import co.edu.unbosque.ciclo3backGrupo13.model.Usuarios;

public interface UsuariosDAO extends JpaRepository <Usuarios, Long> {

}