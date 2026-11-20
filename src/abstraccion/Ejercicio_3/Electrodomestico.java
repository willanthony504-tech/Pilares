package abstraccion.Ejercicio_3;

public abstract class Electrodomestico {
    protected String marca;
    protected boolean encendido;

    public Electrodomestico(String marca){
        this.marca = marca;
        this.encendido = false;
    }

    public void encender(){
        encendido = true;
        System.out.println(marca + " está encendido");
    }

    public void apagado(){
        encendido = false;
        System.out.println(marca + " está apagado");
    }


    public abstract void funcionPrincipal();
}
