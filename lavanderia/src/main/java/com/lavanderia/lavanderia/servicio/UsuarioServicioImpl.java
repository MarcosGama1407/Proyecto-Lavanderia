package com.lavanderia.lavanderia.servicio;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.lavanderia.lavanderia.model.Rol;
import com.lavanderia.lavanderia.model.Usuario;
import com.lavanderia.lavanderia.repositorio.UsuarioRepositorio;
import com.lavanderia.lavanderia.usuariosdto.UsuarioRegistroDTO;

@Service
public class UsuarioServicioImpl implements UsuarioServicio{

    private UsuarioRepositorio usuarioRepositorio;


    public UsuarioServicioImpl(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }


    @Override
    public Usuario save(UsuarioRegistroDTO registroDTO) {
        // TODO Auto-generated method stub
        Usuario usuario = new Usuario(registroDTO.getNombre(),registroDTO.getApellido(),registroDTO.getTelefono(),registroDTO.getCorreo(),registroDTO.getContrasena(),
        registroDTO.getEstado(),
        Arrays.asList(new Rol("ROLE_USER")));

        return usuarioRepositorio.save(usuario);
    }


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepositorio.findByEmail(username);
        if(usuario == null) {
            throw new UsernameNotFoundException("Usuario o password invalidos");
        }
        return new User(usuario.getCorreo(), usuario.getContrasena(), mapearAutoridadesRoles(usuario.getRol()));
    }
    
    private Collection<? extends GrantedAuthority> mapearAutoridadesRoles(Collection<Rol> roles) {
        return roles.stream().map(role -> new SimpleGrantedAuthority(role.getNombreRol())).collect(Collectors.toList());
    }
}
