package abstraccion.Ejercicio_3;

public class Televisor extends Electrodomestico{

    public Televisor(String marca){
        super(marca);
    }

    @Override
    public void funcionPrincipal(){
        if (encendido){
            System.out.println("Mostrando canal en la pantalla...");
        } else{
            System.out.println("Enciendelo primero");
        }
    }
}
