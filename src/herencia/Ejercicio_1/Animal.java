package herencia.Ejercicio_1;

public class Animal {
    protected String nombreMascota;
    protected int edadMascota;
    protected String especie;
    public Animal(String nombreMascota, int edadMascota, String especie) {
        this.nombreMascota = nombreMascota;
        this.edadMascota = edadMascota;
        this.especie = especie;
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
    public void presentarse(){System.out.println(nombreMascota + " es de especie: " + especie);}
}
