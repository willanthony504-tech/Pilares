package abstraccion.Reto_Integrador;

public class Gas extends ServiciosPublicos{
    public Gas(String numeroContrato, String titular, double consumoM3){
        super(numeroContrato, titular, consumoM3);
    }

    @Override
    public double calcularFactura(){
        return (consumo * 2100) + 5000;
    }
}
