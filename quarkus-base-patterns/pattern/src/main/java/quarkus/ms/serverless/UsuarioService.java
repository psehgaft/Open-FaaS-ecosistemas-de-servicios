import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UsuarioService {

    // Método para crear un nuevo usuario
    public Usuario crearUsuario(String nombre, String correo) {
        Usuario usuario = new Usuario(nombre, correo);
        // Lógica para almacenar el usuario en la base de datos o en algún sistema de almacenamiento
        // Puedes usar inyección de dependencias para acceder a un repositorio de usuarios, por ejemplo.
        return usuario;
    }

    // Método para obtener información de un usuario
    public Usuario obtenerUsuario(long id) {
        // Lógica para buscar y recuperar un usuario por su ID
        return usuarioEncontrado;
    }

    // Otros métodos para actualizar y eliminar usuarios, etc.
}