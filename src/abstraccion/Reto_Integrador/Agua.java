package abstraccion.Reto_Integrador;

public class Agua extends ServiciosPublicos{
    public Agua(String numeroContrato, String titular, double consumoM3){
        super(numeroContrato, titular, consumoM3);
    }

    @Override
    public double calcularFactura(){
        return (consumo * 3500) + 8000;
    }
}
