package encapsulamiento.Ejercicio_5;

public class Usuario {
    // Atributos privados
    private String nombreUsuario;
    private String password;          // No tiene ni tendrá getter público
    private int intentosFallidos;    // 1. NUEVO ATRIBUTO PRIVADO
    private boolean bloqueado;       // 2. NUEVO ATRIBUTO BOLEANO DE BLOQUEO

    // Constructor
    public Usuario(String nombreUsuario, String passwordInicial) {
        this.nombreUsuario = nombreUsuario;
        this.intentosFallidos = 0;   // Inicia sin fallos
        this.bloqueado = false;       // Inicia desbloqueado
        cambiarPassword(passwordInicial);
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    // Método para cambiar contraseña con validación interna
    public void cambiarPassword(String nueva) {
        if (esPasswordValida(nueva)) {
            this.password = nueva;
            System.out.println("Contraseña actualizada correctamente.");
        } else {
            System.out.println("Contraseña inválida: requiere mínimo 8 caracteres y al menos un número.");
        }
    }

    // --- MÉTODO MODIFICADO CON LÓGICA DE BLOQUEO ---
    public boolean verificarPassword(String intento) {
        // Regla 1: Si la cuenta ya está bloqueada, siempre rechaza la autenticación
        if (this.bloqueado) {
            System.out.println("Acceso denegado: La cuenta de " + nombreUsuario + " está BLOQUEADA.");
            return false;
        }

        // Regla 2: Verificamos si la contraseña coincide
        if (this.password != null && this.password.equals(intento)) {
            this.intentosFallidos = 0; // Reiniciamos el contador al acertar
            return true;
        } else {
            // Regla 3: Si falla, sumamos un intento fallido
            this.intentosFallidos++;
            System.out.println("Contraseña incorrecta. Intento " + intentosFallidos + " de 3.");

            // Regla 4: Al llegar a 3 fallos, se bloquea la cuenta
            if (this.intentosFallidos >= 3) {
                this.bloqueado = true;
                System.out.println("¡ALERTA! Se han superado los 3 intentos. La cuenta ha sido BLOQUEADA.");
            }
            return false;
        }
    }

    // Método auxiliar privado de validación (solo accesible desde dentro de la clase)
    private boolean esPasswordValida(String pass) {
        if (pass == null || pass.length() < 8) return false;
        for (char c : pass.toCharArray()) {
            if (Character.isDigit(c)) return true;
        }
        return false;
    }

    // Getter opcional para consultar desde fuera si la cuenta está bloqueada
    public boolean isBloqueado() {
        return bloqueado;
    }
}

