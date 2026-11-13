package encapsulamiento.Ejercicio_1;

public class Main {
    public static void main(String[] args) {
        // 1. Creación de dos cuentas bancarias independientes en memoria
        CuentaBancaria cuenta1 = new CuentaBancaria("001-2345", "Carlos Pérez");
        CuentaBancaria cuenta2 = new CuentaBancaria("002-9876", "Ana López");

        // 2. Abonamos dinero inicial a Carlos
        cuenta1.depositar(500000);

        // 3. Consultamos saldos iniciales
        System.out.println("\n=== SALDOS INICIALES ===");
        System.out.println(cuenta1.getTitular() + ": $" + cuenta1.getSaldo());
        System.out.println(cuenta2.getTitular() + ": $" + cuenta2.getSaldo());

        // 4. PRUEBA 1: Transferencia válida ($200.000 de Carlos a Ana)
        cuenta1.transferir(cuenta2, 200000);

        // 5. PRUEBA 2: Transferencia fallida por saldo insuficiente ($1.000.000)
        cuenta1.transferir(cuenta2, 1000000);

        // 6. Consultamos saldos finales para verificar que los datos cuadren
        System.out.println("\n=== SALDOS FINALES ===");
        System.out.println(cuenta1.getTitular() + ": $" + cuenta1.getSaldo());
        System.out.println(cuenta2.getTitular() + ": $" + cuenta2.getSaldo());
    }
}