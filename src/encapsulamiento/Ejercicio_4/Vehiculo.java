package encapsulamiento.Ejercicio_4;

public class Vehiculo {
    // Atributos privados
    private String placa;
    private String marca;
    private String modelo;
    private int velocidad;
    private double kilometrajeTotal; // <--- 1. NUEVO ATRIBUTO PRIVADO

    private static final int VEL_MAX = 200;
    private static final int VEL_MIN = 0;

    // Constructor
    public Vehiculo(String placa, String marca, String modelo) {
        this.documentoPlaca(placa); // Inicialización
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
        this.kilometrajeTotal = 0.0; // Inicializamos el kilometraje en 0.0
    }

    private void documentoPlaca(String placa) {
        this.placa = placa;
    }

    // Getters
    public String getPlaca() { return placa; }
    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidad() { return velocidad; }
    public double getKilometrajeTotal() { return kilometrajeTotal; } // <--- 2. NUEVO GETTER

    // Método Acelerar (modificado para acumular kilometraje)
    public void acelerar() {
        if (velocidad + 10 <= VEL_MAX) {
            velocidad += 10;
            // 3. Sumamos velocidad / 100.0 al kilometraje total acumulado
            kilometrajeTotal += (velocidad / 100.0);
            System.out.println("Velocidad: " + velocidad + " km/h | Kilometraje acumulado: " + kilometrajeTotal + " km");
        } else {
            System.out.println("No puede superar " + VEL_MAX + " km/h.");
        }
    }

    // Método Frenar
    public void frenar() {
        if (velocidad - 10 >= VEL_MIN) {
            velocidad -= 10;
            System.out.println("Velocidad: " + velocidad + " km/h");
        } else {
            velocidad = 0;
            System.out.println("Vehículo detenido.");
        }
    }

    // <--- 4. MÉTODO EXTRA: reset() --->
    public void reset() {
        this.velocidad = 0;
        System.out.println("Velocidad reiniciada a 0 km/h.");
    }
}
