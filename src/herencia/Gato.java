package herencia;

public class Gato extends Animal {
    public Gato(String nombreMascota, int edadMascota) {
        super(nombreMascota, edadMascota);
    }
    @Override
    public void hacerSonido() {
        System.out.println(nombreMascota + " dice: Miau!");
    }
    public void ronronear() {
        System.out.println(nombreMascota + " ronronea felizmente.");
    }
}
