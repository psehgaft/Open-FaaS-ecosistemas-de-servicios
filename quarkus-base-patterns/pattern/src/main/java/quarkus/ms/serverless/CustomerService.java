/*
 En este ejemplo, el microservicio CustomerService es un composite service que combina la funcionalidad de UserService y OrderService. Recibe instancias de UserService y OrderService a través de su constructor. El método getCustomerWithOrders() del CustomerService utiliza los métodos de los otros dos servicios para obtener la información completa de un cliente y sus órdenes.
 UserService y OrderService son microservicios independientes que encapsulan la lógica para obtener datos de usuarios y órdenes, respectivamente.
 Las clases UserDTO y OrderDTO son clases de transferencia de datos (DTO) que representan la estructura de los datos que se intercambian entre los microservicios. La clase CustomerDTO representa la estructura completa del cliente con sus órdenes.
 En este ejemplo, el microservicio CustomerService utiliza la composición de servicios para obtener y combinar la información de varios microservicios y ofrecer una funcionalidad completa y coherente a los clientes.
*/

public class CustomerService {
    private UserService userService;
    private OrderService orderService;

    public CustomerService(UserService userService, OrderService orderService) {
        this.userService = userService;
        this.orderService = orderService;
    }

    public CustomerDTO getCustomerWithOrders(int customerId) {
        UserDTO user = userService.getUserById(customerId);
        List<OrderDTO> orders = orderService.getOrdersByCustomerId(customerId);

        return new CustomerDTO(user, orders);
    }
}

public class UserService {
    public UserDTO getUserById(int id) {
        // Lógica para obtener un usuario por su ID desde UserService
    }
}

public class OrderService {
    public List<OrderDTO> getOrdersByCustomerId(int customerId) {
        // Lógica para obtener las órdenes de un cliente desde OrderService
    }
}

public class UserDTO {
    private int id;
    private String name;
    private String email;

    // Constructor, getters y setters
}

public class OrderDTO {
    private int id;
    private int customerId;
    private String product;
    private int quantity;

    // Constructor, getters y setters
}

public class CustomerDTO {
    private UserDTO user;
    private List<OrderDTO> orders;

    public CustomerDTO(UserDTO user, List<OrderDTO> orders) {
        this.user = user;
        this.orders = orders;
    }

    // Getters y setters
}

