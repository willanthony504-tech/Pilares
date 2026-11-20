package herencia.Ejercicio_1;

public class MainVeterinaria {
    public static void main(String[] args) {
        Perro firulais = new Perro("Firulais", 4, "Golden Retriever");
        Gato michi = new Gato("Michi", 2, "Tigre");
        Pajaro lorito = new Pajaro("Lorito", 5, "Guacamayo");
        firulais.presentarse();
        firulais.comer(); // Heredado del padre
        firulais.hacerSonido(); // Sobrescrito
        firulais.perseguirCola(); // Propio de Perro

        System.out.println("---");

        michi.presentarse();
        michi.dormir(); // Heredado del padre
        michi.hacerSonido(); // Sobrescrito
        michi.ronronear(); // Propio de Gato

        System.out.println("---");

        lorito.presentarse();
        lorito.comer();
        lorito.hacerSonido();
        lorito.volar();
    }
}