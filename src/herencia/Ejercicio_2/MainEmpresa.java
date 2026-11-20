package herencia.Ejercicio_2;

public class MainEmpresa {
    public static void main(String[] args){
        Vendedor v = new Vendedor("Carlos Perez", "1234", 1500000, 350000);
        Gerente g = new Gerente("Pedro Pascal", "5678", 3000000, 800000);
        AprendizSena a = new AprendizSena("Will Rivero", "9102", 2000000);


        v.mostrarInfo();
        System.out.println("---");
        g.mostrarInfo();
        System.out.println("---");
        a.mostrarInfo();
    }
}
