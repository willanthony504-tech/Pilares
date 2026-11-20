package herencia.Ejercicio_5;

public class Administrador extends Usuario {
    private String nivelPermiso; // "TOTAL" o "PARCIAL"

    public Administrador(String nombre, String correo, String nivelPermiso) {
        super(nombre, correo);
        this.nivelPermiso = nivelPermiso;
    }

    @Override
    public void iniciarSesion() {
        super.iniciarSesion(); // Reutiliza el saludo del padre
        System.out.println("Panel de administración con permisos: " + nivelPermiso);
    }
}
