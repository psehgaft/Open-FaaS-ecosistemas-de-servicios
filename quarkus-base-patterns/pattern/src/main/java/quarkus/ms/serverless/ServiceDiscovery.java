import io.quarkus.service.discovery.ServiceDiscovery;
import io.quarkus.service.discovery.ServiceDiscoveryEndpoint;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/mi-servicio-cliente")
public class ServiceDiscoveryResource {

    @Inject
    ServiceDiscovery serviceDiscovery;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getServiceDiscoveryEndpoint() {
        ServiceDiscoveryEndpoint endpoint = serviceDiscovery.endpoint("mi-servicio");
        if (endpoint != null) {
            String ip = endpoint.getHost();
            int puerto = endpoint.getPort();
            return "Dirección IP: " + ip + ", Puerto: " + puerto;
        } else {
            return "Servicio no encontrado";
        }
    }
}