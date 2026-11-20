package abstraccion.Ejercicio_4;

public class PagoEfectivo extends MedioPago{

    public PagoEfectivo(double monto){
        super(monto);
    }

    @Override
    public void procesarPago(){
        int codigo = (int)(Math.random() * 100000);
        System.out.println("Genere un código de recaudo: " + codigo);
        System.out.println("Acérquese al efecty a pagar: $" + monto);
    }
}
