package abstraccion.Reto_Integrador;

public class MainServicios {
    public static void main(String[] args){
        Agua a = new Agua("AGUA-001", "Mattias Velasquez", 15);
        Luz l = new Luz("LUZ-001", "Sebastian Arnulfo", 250 );
        Gas g = new Gas("GAS-001", "Jairo Parada", 12);

        System.out.println("=== RECIBO DE AGUA ===");
        a.emitirRecibo();
        System.out.println("=== RECIBO DE LUZ ===");
        l.emitirRecibo();
        System.out.println("=== RECIBO DE GAS ===");
        g.emitirRecibo();


    }
}
