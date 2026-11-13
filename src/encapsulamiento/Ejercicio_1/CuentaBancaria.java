package encapsulamiento.Ejercicio_1;

public class CuentaBancaria {
    // Atributos privados - encapsulados
    private String numeroCuenta;
    private String titular;
    private double saldo;

    public CuentaBancaria(String numeroCuenta, String titular) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = 0.0;
    }

    // Getters - solo lectura desde el exterior
    public String getNumeroCuenta() { return numeroCuenta; }
    public String getTitular() { return titular; }
    public double getSaldo() { return saldo; }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso de $" + cantidad + " en la cuenta " + numeroCuenta);
        } else {
            System.out.println("Error: la cantidad debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: la cantidad debe ser positiva.");
        } else if (cantidad > saldo) {
            System.out.println("Error: saldo insuficiente.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso de $" + cantidad + " de la cuenta " + numeroCuenta);
        }
    }

    // --- AQUÍ ESTÁ EL RETO DE ANDAMIAJE ---
    public void transferir(CuentaBancaria destino, double cantidad) {
        System.out.println("\n--- Intentando transferir $" + cantidad + " de " + this.titular + " a " + destino.getTitular() + " ---");

        if (cantidad <= 0) {
            System.out.println("Error: la cantidad a transferir debe ser mayor a cero.");
        } else if (cantidad > this.saldo) {
            System.out.println("Error: saldo insuficiente para completar la transferencia.");
        } else {
            // Descontamos del saldo actual y le sumamos a la cuenta de destino
            this.saldo -= cantidad;
            destino.saldo += cantidad;
            System.out.println("Transferencia exitosa de $" + cantidad + " a la cuenta de " + destino.getTitular());
        }
    }
}

