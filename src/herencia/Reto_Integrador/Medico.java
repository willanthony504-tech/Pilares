package herencia.Reto_Integrador;

public class Medico extends PersonalIPS {
    private String especialidad;
    private int consultasDelMes;

    public Medico(String documento, String nombre, double salarioBase, String especialidad, int consultasDelMes) {
        super(documento, nombre, salarioBase);
        this.especialidad = especialidad;
        this.consultasDelMes = consultasDelMes;
    }

    @Override
    public double calcularSalarioMensual() {
        // Gana el salario base + $500.000 por cada consulta atendida
        return salarioBase + (consultasDelMes * 500000);
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Especialidad: " + especialidad + " | Consultas realizadas: " + consultasDelMes);
    }
}
