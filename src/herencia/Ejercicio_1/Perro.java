package herencia.Ejercicio_1;

public class Perro extends Animal {
    public Perro(String nombreMascota, int edadMascota, String especie) {
        super(nombreMascota, edadMascota, especie); // Llama al constructor del padre
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombreMascota + " dice: Guau guau!");
    }
    public void perseguirCola() {
        System.out.println(nombreMascota + " persigue su cola.");
    }
}
