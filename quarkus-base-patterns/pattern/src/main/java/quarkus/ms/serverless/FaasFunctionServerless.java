import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class FaasFunctionServerless {

    @Inject
    ServicioDominio servicioDominio;

    public String manejarEvento(String evento) {
        // Lógica de la función Serverless
        String resultado = servicioDominio.procesarEvento(evento);
        return resultado;
    }
}