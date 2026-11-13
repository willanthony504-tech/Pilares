package encapsulamiento.Ejercicio_5;

public class MainUsuario {
    public static void main(String[] args) {
        // Instanciamos el usuario con su contraseña inicial
        Usuario u = new Usuario("carlos.dev", "claveSecreta1");

        System.out.println("=== PRUEBA DE AUTENTICACIÓN ===");
        System.out.println("Usuario registrado: " + u.getNombreUsuario());

        System.out.println("\n--- SIMULANDO 3 INTENTOS FALLIDOS CONSECUTIVOS ---");
        System.out.println("Intento 1: " + u.verificarPassword("error1"));
        System.out.println("Intento 2: " + u.verificarPassword("error2"));
        System.out.println("Intento 3: " + u.verificarPassword("error3"));

        System.out.println("\n--- INTENTO 4 (CON LA CONTRASEÑA CORRECTA) ---");
        // Aunque ingrese la contraseña correcta, el sistema rechaza por estar bloqueado
        System.out.println("¿Login exitoso?: " + u.verificarPassword("claveSecreta1"));
    }
}