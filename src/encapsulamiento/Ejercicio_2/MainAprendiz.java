package encapsulamiento.Ejercicio_2;

public class MainAprendiz {

    // CREACIÓN EN MEMORIA RAM: La palabra 'new' reserva
    // el espacio para el objeto 'a'
    public static void main(String[] args) {
        Aprendiz a = new Aprendiz("1090123456", "Laura Gómez");

        // 2\. ENVIAMOS PARÁMETROS A LOS SETTERS GUARDIANES
        a.setEdad(19);
        a.setNotaFinal(4.2);

        // 3\. INTENTO DE ASIGNACIÓN INVÁLIDA (El setter la rechazará automáticamente)
        a.setNotaFinal(7.0);

        // Intento 1: Correo inválido (sin '@') Será rechazado por el setter
        a.setCorreoInstitucional("lauragomez.sena.edu.co");

        // Intento 2: Correo válido (con '@') Será aceptado y guardado
        a.setCorreoInstitucional("lauragomez@misena.edu.co");

        // 4\. CONSULTA DE DATOS CON LOS GETTERS
        System.out.println("--- DATOS DEL APRENDIZ ---");
        System.out.println("Documento: " + a.getDocumento());
        System.out.println("Nombre: " + a.getNombre());
        System.out.println("Edad: " + a.getEdad());
        System.out.println("Nota Final: " + a.getNotaFinal());
        System.out.println("Correo: " + a.getCorreoInstitucional());

        // 5\. EVALUACIÓN DE APROBACIÓN
        System.out.println("¿Aprobó?: " + (a.aprobo() ? "Sí" : "No"));
    }
}
