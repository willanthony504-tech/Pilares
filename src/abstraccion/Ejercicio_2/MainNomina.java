package abstraccion.Ejercicio_2;

public class MainNomina {
    public static void main(String[] args){
        EmpleadoFijo ef = new EmpleadoFijo("Juan Álvarez", "1234", 2000000);
        EmpleadoPorHoras eh = new EmpleadoPorHoras("Mattias Velazquez", "5678", 80, 15000);
        EmpleadoFreelance efr = new EmpleadoFreelance("Sebastian Arnulfo", "9101", 10, 50000);


        ef.mostrarRecibo();
        System.out.println("----");
        eh.mostrarRecibo();
        System.out.println("----");
        efr.mostrarRecibo();

    }
}
