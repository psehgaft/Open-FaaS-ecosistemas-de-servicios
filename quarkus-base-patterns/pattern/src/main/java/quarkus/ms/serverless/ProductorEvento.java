import io.smallrye.reactive.messaging.annotations.Emitter;
import io.smallrye.reactive.messaging.annotations.Channel;

import javax.inject.Inject;

public class ProductorEvento {

    @Inject
    @Channel("eventos-salida") // Nombre del canal de salida
    Emitter<EventoMensaje> emisor;

    public void enviarEvento(String contenido) {
        EventoMensaje evento = new EventoMensaje(contenido);
        emisor.send(evento);
    }
}