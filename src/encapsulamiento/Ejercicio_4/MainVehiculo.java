package encapsulamiento.Ejercicio_4;

public class MainVehiculo {
    public static void main(String[] args) {
        // Instanciamos un nuevo vehículo en memoria
        Vehiculo v = new Vehiculo("ABC123", "Renault", "Logan");

        System.out.println("=== DATOS INICIALES ===");
        System.out.println("Vehículo: " + v.getMarca() + " " + v.getModelo() + " [Placa: " + v.getPlaca() + "]");
        System.out.println("Velocidad inicial: " + v.getVelocidad() + " km/h");
        System.out.println("Kilometraje inicial: " + v.getKilometrajeTotal() + " km\n");

        System.out.println("=== PRUEBA DE ACELERACIÓN Y KILOMETRAJE ===");
        v.acelerar(); // Velocidad: 10 km/h -> suma 10/100.0 = 0.1 km (Total: 0.1)
        v.acelerar(); // Velocidad: 20 km/h -> suma 20/100.0 = 0.2 km (Total: 0.3)
        v.acelerar(); // Velocidad: 30 km/h -> suma 30/100.0 = 0.3 km (Total: 0.6)

        System.out.println("\n=== PRUEBA DEL MÉTODO EXTRA RESET ===");
        v.reset();
        System.out.println("Velocidad tras reset: " + v.getVelocidad() + " km/h");

        System.out.println("\n=== RESULTADO FINAL DE KILOMETRAJE ===");
        System.out.println("Kilometraje total recorrido: " + v.getKilometrajeTotal() + " km");
    }
}
