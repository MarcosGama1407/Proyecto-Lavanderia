package com.lavanderia.lavanderia.usuariosdto;

public class UsuarioRegistroDTO {
    
    //Atributos
    //Id del usuario
    private Integer idUsuario;

    //Nombre del usuario
    private String nombre;

    //Apellido del usuario
    private String apellido;

    //Telefono del usuario
    private int telefono;

    //Correo del usuario
    private String correo;

    //Contrasena del usuario
    private String contrasena;

    //Estado del usuario
    private boolean estado;


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

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    //Constructor
    public UsuarioRegistroDTO(Integer idUsuario, String nombre, String apellido, int telefono, String correo,
            String contrasena, boolean estado) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public UsuarioRegistroDTO(String nombre, String apellido, int telefono, String correo, String contrasena,
            boolean estado) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasena = contrasena;
        this.estado = estado;
    }

    public UsuarioRegistroDTO(String correo) {
        this.correo = correo;
    }

    public UsuarioRegistroDTO() {
    }

}
