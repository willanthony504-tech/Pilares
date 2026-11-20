package herencia.Ejercicio_4;

public class MainFiguras {
    public static void main(String[] args) {
        Circulo c = new Circulo("Rojo", 5);
        Rectangulo r = new Rectangulo("Azul", 4, 6);
        Triangulo t = new Triangulo("Verde", 5, 8); // Instancia de Triangulo

        // Uso del método describir() del reto extra
        c.describir();
        System.out.println("---");
        r.describir();
        System.out.println("---");
        t.describir();
    }
}
