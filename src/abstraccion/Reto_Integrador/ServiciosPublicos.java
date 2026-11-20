package abstraccion.Reto_Integrador;

public abstract class ServiciosPublicos {
    protected String numeroContrato;
    protected String titular;
    protected double consumo;

    public ServiciosPublicos(String numeroContrato, String titular, double consumo){
        this.numeroContrato = numeroContrato;
        this.titular = titular;
        this.consumo = consumo;
    }

    public abstract double calcularFactura();

    public void emitirRecibo(){
        System.out.println("Contrato: " + numeroContrato);
        System.out.println("Titular: " + titular);
        System.out.println("Consumo del mes: " + consumo);
        System.out.println("Total a pagar: $" + calcularFactura());
    }
}
