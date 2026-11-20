package herencia.Reto_Integrador;

// Archivo: Administrativo.java
public class Administrativo extends PersonalIPS {
    private String area; // Ej: "Recepción", "Facturación"

    public Administrativo(String documento, String nombre, double salarioBase, String area) {
        super(documento, nombre, salarioBase);
        this.area = area;
    }

    @Override
    public double calcularSalarioMensual() {
        return salarioBase; // Gana únicamente el salario base
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Área asignada: " + area);
    }
}
