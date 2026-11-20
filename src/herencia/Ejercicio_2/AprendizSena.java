package herencia.Ejercicio_2;

public class AprendizSena extends Empleado {
    public AprendizSena(String nombre, String documento, double salarioBase) {
        super(nombre, documento, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 0.5; // Retorna el 50% del salario base como apoyo de sostenimiento
    }
}
