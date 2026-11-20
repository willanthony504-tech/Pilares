package abstraccion.Ejercicio_3;

public class Lavadora extends Electrodomestico{

    public Lavadora(String marca){
     super(marca);
    }

    @Override
    public void funcionPrincipal(){
        if (encendido){
            System.out.println("Lavando ropa a 40 grados C durante 45 minutos...");
        } else{
            System.out.print("Enciendala primero, ");
        }
    }

    public void centrifugar(){
        if(encendido){
            System.out.println("Centrifugando ropa a alta velocidad...");
        } else{
            System.out.println("enciendala para centrifugar");
        }
    }
}
