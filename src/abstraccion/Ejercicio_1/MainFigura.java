package abstraccion.Ejercicio_1;

public class MainFigura {
    public static void main(String[] args){
        Circulo c = new Circulo(5);
        Triangulo t = new Triangulo(4,6);
        Rectangulo r = new Rectangulo(5, 10);
        Cuadrado cu = new Cuadrado(5);

        c.mostrar();
        System.out.println("----");
        t.mostrar();
        System.out.println("----");
        r.mostrar();
        System.out.println("----");
        cu.mostrar();
    }
}
