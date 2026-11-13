package herencia;

public class Animal {
    protected String nombreMascota;
    protected int edadMascota;
    public Animal(String nombreMascota, int edadMascota) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
    }
    public void comer() {
        System.out.println(nombreMascota + " esta comiendo.");
    }
    public void dormir() {
        System.out.println(nombreMascota + " esta durmiendo.");
    }
    public void hacerSonido() {
        System.out.println(nombreMascota + " emite un sonido.");
    }
}
