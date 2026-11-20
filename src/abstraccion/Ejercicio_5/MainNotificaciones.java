package abstraccion.Ejercicio_5;

public class MainNotificaciones {
    public static void main(String[] args){
        NotificacionEmail ne = new NotificacionEmail("carlos@sena.edu.co", "Su matrícula fue aprobada");
        NotificacionSMS ns = new NotificacionSMS("3001234567", "Su pedido está en camino");
        NotificacionWhatsApp nw = new NotificacionWhatsApp("3001234567", "Hola amigo como estás, como te encuentras");


        ne.enviar();

        System.out.println("----");

        ns.enviar();

        System.out.println("----");

        nw.enviar();
    }
}
