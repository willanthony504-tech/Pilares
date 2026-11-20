package herencia.Ejercicio_1;

public class Gato extends Animal {
    public Gato(String nombreMascota, int edadMascota, String especie) {
        super(nombreMascota, edadMascota, especie);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombreMascota + " dice: Miau!");
    }
    public void ronronear() {
        System.out.println(nombreMascota + " ronronea felizmente.");
    }
}
