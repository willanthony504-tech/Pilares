package herencia.Reto_Integrador;

public class MainIPS {
    public static void main(String[] args) {
        // Médico con 20 consultas en el mes
        Medico medico = new Medico("10987654", "Dr. Camilo Torres", 3500000, "Cardiología", 20);

        // Enfermero del turno noche (recibe bonificación de $200.000)
        Enfermero enfermero = new Enfermero("98765432", "Enf. Sofía Ramírez", 1800000, "noche");

        // Administrativo de Facturación
        Administrativo admin = new Administrativo("45678912", "Diego Martínez", 1400000, "Facturación");

        System.out.println("=== REGISTRO DE ASISTENCIA ===");
        medico.registrarAsistencia();
        enfermero.registrarAsistencia();
        admin.registrarAsistencia();

        System.out.println("\n=== INFORMACIÓN DE NÓMINA IPS ===");
        medico.mostrarInfo();
        System.out.println("---");
        enfermero.mostrarInfo();
        System.out.println("---");
        admin.mostrarInfo();
    }
}
