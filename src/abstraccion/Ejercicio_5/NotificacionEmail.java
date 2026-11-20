package abstraccion.Ejercicio_5;

public class NotificacionEmail extends Notificacion{

    public NotificacionEmail(String destinatario, String mensaje){
        super(destinatario, mensaje);
    }

    @Override
    public void enviar(){
        System.out.println("Enviando EMAIL a: " + destinatario);
        System.out.println("Asunto: Notificación mensaje del sistema");
        System.out.println("Mensaje: " + mensaje);
        registrarEnvio();
    }
}
