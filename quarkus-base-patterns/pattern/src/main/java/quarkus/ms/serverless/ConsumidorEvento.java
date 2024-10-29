import io.smallrye.reactive.messaging.annotations.Incoming;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ConsumidorEvento {

    @Incoming("eventos-salida") // Nombre del canal de entrada
    public void recibirEvento(EventoMensaje evento) {
        // Procesar el evento recibido, por ejemplo, imprimirlo
        System.out.println("Evento recibido: " + evento.getContenido());
    }
}