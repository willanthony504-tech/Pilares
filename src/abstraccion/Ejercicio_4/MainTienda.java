package abstraccion.Ejercicio_4;

public class MainTienda {
    public static void main(String[] args){
        TarjetaCredito t = new TarjetaCredito(25000, "4111-2222-3333-4444");
        PagoEfectivo p = new PagoEfectivo(80000);

        t.mostrarMonto();
        t.procesarPago();

        System.out.println("----");

        p.mostrarMonto();
        p.procesarPago();
    }


}
