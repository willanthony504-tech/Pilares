package herencia.Ejercicio_1;

public class Pajaro extends Animal{
    public Pajaro(String nombreMascota, int edadMascota, String especie){
        super(nombreMascota, edadMascota, especie);
    }
    @Override
    public void hacerSonido() {System.out.println(nombreMascota + " dice: Pio Pio!");}
    public void volar(){System.out.println(nombreMascota + " vuela.");}
}
