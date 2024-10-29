/*
 En este ejemplo, el UserService es un servicio único que se encarga de manipular los usuarios. Recibe una instancia de UserRepository a través de su constructor, que se encarga de acceder a los datos de los usuarios. El UserService expone métodos para obtener, crear, actualizar y eliminar usuarios.
 La interfaz UserRepository define los métodos necesarios para acceder a los datos de los usuarios, como buscar por ID, guardar, actualizar y eliminar. La implementación concreta de UserRepository en UserRepositoryImpl contiene la lógica específica para interactuar con la base de datos o cualquier otro mecanismo de almacenamiento.
 El ejemplo muestra cómo se pueden estructurar y separar las responsabilidades en un servicio único en Java, donde el servicio principal (UserService) se encarga de la lógica del negocio y se comunica con una capa de acceso a datos (UserRepository) para realizar operaciones de persistencia.
*/

public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserById(int id) {
        return userRepository.findById(id);
    }

    public void createUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.update(user);
    }

    public void deleteUser(int id) {
        userRepository.delete(id);
    }
}

public interface UserRepository {
    User findById(int id);
    void save(User user);
    void update(User user);
    void delete(int id);
}

public class UserRepositoryImpl implements UserRepository {
    // Implementación de métodos de acceso a datos

    @Override
    public User findById(int id) {
        // Lógica para buscar un usuario por su id en la base de datos
    }

    @Override
    public void save(User user) {
        // Lógica para guardar un usuario en la base de datos
    }

    @Override
    public void update(User user) {
        // Lógica para actualizar un usuario en la base de datos
    }

    @Override
    public void delete(int id) {
        // Lógica para eliminar un usuario de la base de datos
    }
}

public class User {
    private int id;
    private String name;
    private String email;

    // Constructor, getters y setters
}