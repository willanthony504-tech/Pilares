package encapsulamiento.Reto_Integrador;

public class Paciente {
    // 1. Atributos privados (Protegidos)
    private String documento;
    private String nombre;
    private int edad;
    private String tipoSangre;
    private String diagnostico; // Atributo confidencial - SIN getter público
    private String alergias;    // Variable de texto simple

    // Clave autorizada para médicos
    private static final String CLAVE_MEDICO = "MED-2026";

    // 2. Constructor
    public Paciente(String documento, String nombre, int edad, String tipoSangre, String diagnosticoInicial) {
        this.documento = documento;
        this.nombre = nombre;
        setEdad(edad);           // Usa el setter para validar
        setTipoSangre(tipoSangre); // Usa el setter para validar
        this.diagnostico = diagnosticoInicial;
        this.alergias = "Ninguna"; // Valor inicial
    }

    // 3. Getters y Setters públicos con validaciones
    public String getDocumento() { return documento; }
    public void setDocumento(String documento) { this.documento = documento; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) {
        if (edad >= 0 && edad <= 120) {
            this.edad = edad;
        } else {
            System.out.println("Error: La edad debe estar entre 0 y 120 años.");
        }
    }

    public String getTipoSangre() { return tipoSangre; }
    public void setTipoSangre(String tipoSangre) {
        if (tipoSangre.equals("A+") || tipoSangre.equals("A-") ||
                tipoSangre.equals("B+") || tipoSangre.equals("B-") ||
                tipoSangre.equals("O+") || tipoSangre.equals("O-") ||
                tipoSangre.equals("AB+") || tipoSangre.equals("AB-")) {
            this.tipoSangre = tipoSangre;
        } else {
            System.out.println("Error: Tipo de sangre inválido.");
        }
    }

    public String getAlergias() { return alergias; }

    // 4. Métodos para la gestión de alergias (Concatenando texto)
    public void agregarAlergia(String nuevaAlergia) {
        if (this.alergias.equals("Ninguna")) {
            this.alergias = nuevaAlergia;
        } else {
            this.alergias = this.alergias + ", " + nuevaAlergia;
        }
        System.out.println("Alergia '" + nuevaAlergia + "' agregada con éxito.");
    }

    public boolean tieneAlergias() {
        return !this.alergias.equals("Ninguna");
    }

    // 5. Control de acceso al diagnóstico por clave médica
    public String consultarDiagnostico(String claveMedico) {
        if (CLAVE_MEDICO.equals(claveMedico)) {
            return this.diagnostico;
        } else {
            System.out.println("Acceso denegado: Clave médica incorrecta.");
            return "ACCESO DENEGADO";
        }
    }

    public void actualizarDiagnostico(String claveMedico, String nuevoDiagnostico) {
        if (CLAVE_MEDICO.equals(claveMedico)) {
            this.diagnostico = nuevoDiagnostico;
            System.out.println("Diagnóstico actualizado correctamente.");
        } else {
            System.out.println("Error: Clave médica incorrecta.");
        }
    }
}
