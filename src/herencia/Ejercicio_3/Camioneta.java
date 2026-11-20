package herencia.Ejercicio_3;

public class Camioneta extends Vehiculo{
    private double capacidadCarga;

    public Camioneta(String modelo, String marca, double precio, double capacidadCarga){
        super(modelo, marca, precio);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public void describir() {
        super.describir();
        System.out.println("Tipo: Camioneta - " + capacidadCarga + " kg de carga");
    }

}
