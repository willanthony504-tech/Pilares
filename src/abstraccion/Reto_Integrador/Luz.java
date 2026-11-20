package abstraccion.Reto_Integrador;

public class Luz extends ServiciosPublicos{
    public Luz(String numeroContrato, String titular, double consumoKWH){
        super(numeroContrato, titular, consumoKWH);
    }

    @Override
    public double calcularFactura(){
        return (consumo * 650) + 12000;
    }
}
