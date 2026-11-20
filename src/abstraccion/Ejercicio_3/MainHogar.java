package abstraccion.Ejercicio_3;

public class MainHogar {
    public static void main(String[] agrs){
        Televisor tv = new Televisor("Hyundai");
        Nevera nv = new Nevera("LG");
        Lavadora lv = new Lavadora("Samsung");

        tv.funcionPrincipal();
        tv.encender();
        tv.funcionPrincipal();

        System.out.println("----");

        nv.funcionPrincipal();
        nv.encender();
        nv.funcionPrincipal();

        System.out.println("----");

        lv.funcionPrincipal();
        lv.centrifugar();

        lv.encender();

        lv.funcionPrincipal();
        lv.centrifugar();


    }
}
