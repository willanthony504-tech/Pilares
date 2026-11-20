package herencia.Reto_Integrador;

public class Enfermero extends PersonalIPS {
    private String turno; // "Mañana", "Tarde" o "Noche"

    public Enfermero(String documento, String nombre, double salarioBase, String turno) {
        super(documento, nombre, salarioBase);
        this.turno = turno;
    }

    @Override
    public double calcularSalarioMensual() {
        // Recibe una bonificación adicional de $200.000 si realiza turno de noche
        if (turno != null && turno.equalsIgnoreCase("noche")) {
            return salarioBase + 200000;
        }
        return salarioBase;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Turno: " + turno);
    }
}
