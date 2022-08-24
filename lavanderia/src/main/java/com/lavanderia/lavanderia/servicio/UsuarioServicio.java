package com.lavanderia.lavanderia.servicio;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.lavanderia.lavanderia.model.Usuario;
import com.lavanderia.lavanderia.usuariosdto.UsuarioRegistroDTO;

public interface UsuarioServicio extends UserDetailsService{

    public Usuario save(UsuarioRegistroDTO registroDTO);

}
