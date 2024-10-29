import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class EventoMensaje {
    private String contenido;

    public EventoMensaje() {
    }

    public EventoMensaje(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }
}