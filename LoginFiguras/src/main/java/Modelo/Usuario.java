package Modelo;

public class Usuario {
    private String usuario;
    private String contrasena;
    private String rol; // "docente" o "alumno"

    public Usuario(String usuario, String contrasena, String rol) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rol = rol;
    }

    // Getters
    public String getUsuario() {
        return usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getRol() {
        return rol;
    }
}

