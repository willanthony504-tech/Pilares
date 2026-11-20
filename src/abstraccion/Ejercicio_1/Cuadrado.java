package abstraccion.Ejercicio_1;

public class Cuadrado extends Figura{
    private double lado;

    public Cuadrado(double lado){
        super("Cuadrado");
        this.lado = lado;
    }

    @Override
    public double calcularArea(){
        return lado * lado;
    }
}
