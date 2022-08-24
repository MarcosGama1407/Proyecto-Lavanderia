package com.lavanderia.lavanderia.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lavanderia.lavanderia.model.Usuario;

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, Integer>{
    
    public Usuario findByEmail(String correo);

}
