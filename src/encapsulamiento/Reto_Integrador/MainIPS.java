package encapsulamiento.Reto_Integrador;

public class MainIPS {
    public static void main(String[] args) {
        // 1. Crear un paciente
        Paciente p = new Paciente("1098765432", "María Fernanda Ríos", 28, "O+", "Gastritis Crónica");

        System.out.println("=== CONSULTA DE DIAGNÓSTICO ===");
        // 2. Intentar consultar con clave incorrecta
        System.out.println("Intento 1 (clave incorrecta): " + p.consultarDiagnostico("1234"));

        // 3. Consultar con clave correcta
        System.out.println("Intento 2 (clave correcta): " + p.consultarDiagnostico("MED-2026"));

        System.out.println("\n=== REGISTRO DE ALERGIAS ===");
        // 4. Agregar 2 alergias
        p.agregarAlergia("Penicilina");
        p.agregarAlergia("Ibuprofeno");

        System.out.println("\n=== INFORMACIÓN PÚBLICA DEL PACIENTE ===");
        // 5. Mostrar la información pública del paciente
        System.out.println("Documento: " + p.getDocumento());
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Edad: " + p.getEdad() + " años");
        System.out.println("Tipo de Sangre: " + p.getTipoSangre());
        System.out.println("¿Tiene alergias?: " + (p.tieneAlergias() ? "Sí" : "No"));
        System.out.println("Alergias registradas: " + p.getAlergias());
    }
}
