package com.lavanderia.lavanderia.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuarios", uniqueConstraints = @UniqueConstraint(columnNames = "correo"))
public class Usuario {
    
    //Atributos
    //Id del usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsuario;

    //Nombre del usuario
    @Column(name = "nombre")
    private String nombre;

    //Apellido del usuario
    @Column(name = "apellido")
    private String apellido;

    //Telefono del usuario
    private int telefono;

    //Correo del usuario
    private String correo;

    //Contrasena del usuario
    private String contrasena;

    //Estado del usuario
    private boolean estado;

    //Rol del usuario
    @ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
        name = "usuarios_roles",
        joinColumns = @JoinColumn(name = "usuario_id",referencedColumnName = "idUsuario"),
        inverseJoinColumns = @JoinColumn(name = "rol_id",referencedColumnName = "idRol")
        )
    private Collection<Rol> rol;

    

    public Usuario(Integer idUsuario, String nombre, String apellido, int telefono, String correo, String contrasena,
            boolean estado, Collection<Rol> rol) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
        this.rol = rol;
    }

    public Usuario(String nombre, String apellido, int telefono, String correo, String contrasena, boolean estado,
            Collection<Rol> rol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
        this.rol = rol;
    }

    public Usuario() {
    }

    //Getters y seeders
    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public Collection<Rol> getRol() {
        return rol;
    }

    public void setRol(Collection<Rol> rol) {
        this.rol = rol;
    }

    

}
