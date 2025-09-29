
package Logica;

import Modelo.Usuario;

public class UsuarioLogico {

    // Arreglo con usuarios predefinidos (mínimo 2)
    private static Usuario[] usuarios = {
        new Usuario("docente", "123", "docente"),
        new Usuario("alumno", "456", "alumno")
    };

    // Método para validar login
    public static Usuario validarUsuario(String user, String pass) {
        for (Usuario u : usuarios) {
            if (u.getUsuario().equals(user) && u.getContrasena().equals(pass)) {
                return u; // Retorna el objeto Usuario válido
            }
        }
        return null; // Si no encontró coincidencia
    }
}

