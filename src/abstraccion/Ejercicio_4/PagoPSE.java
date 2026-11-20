package abstraccion.Ejercicio_4;

public class PagoPSE extends MedioPago{
    private String banco;

    public PagoPSE(double monto, String banco){
        super(monto);
        this.banco = banco;
    }

    @Override
    public void procesarPago(){
        System.out.println("Redirigiendo a la plataforma de: " + banco + "...");
        System.out.println("Esperando la confirmación de transferencia de $" + monto + "...");
        System.out.println("Pago por PSE exitoso");
    }
}
