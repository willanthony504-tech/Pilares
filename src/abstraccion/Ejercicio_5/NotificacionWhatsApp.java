package abstraccion.Ejercicio_5;

public class NotificacionWhatsApp extends Notificacion{
    public NotificacionWhatsApp(String numeroWhatsApp, String mensaje){
        super(numeroWhatsApp, mensaje);
    }

    @Override
    public void enviar(){
        System.out.println("Enviando WhatsApp a: " + destinatario);
        System.out.println("Su mensaje es: " + mensaje);
        registrarEnvio();
    }
}
