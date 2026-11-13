package encapsulamiento.Ejercicio_2;

public class Aprendiz {
    // Atributos privados
    private String nombre;
    private String documento;
    private int edad;
    private double notaFinal;
    private String correoInstitucional;

    // Constructor
    public Aprendiz(String documento, String nombre){
        this.documento = documento;
        this.nombre = nombre;
        this.edad = 0;        // Valor inicial
        this.notaFinal = 0.0; // Por defecto
        this.correoInstitucional = "No asignado";
    }

    // Métodos getter (consultan atributos privados)
    public String getDocumento(){return documento;}
    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    public double getNotaFinal(){return notaFinal;}
    public String getCorreoInstitucional(){return correoInstitucional;}

    // Métodos setter (reciben un parámetro y lo validan antes de guardarlo)
    public void setEdad (int edad) {
        if (edad >= 0 && edad <= 100){ // Edad válida entre 0 y 100 años
            this.edad = edad;
        } else{
            System.out.println("Error: La edad debe estar entre 0 y 100 años.");
        }
    }

    public void setNotaFinal (double notaFinal){
        if(notaFinal >= 0.0 && notaFinal <= 5.0){
            this.notaFinal = notaFinal;
        } else{
            System.out.println("Error: La nota debe estar entre 0.0 y 5.0");
        }
    }

    public boolean aprobo(){ //(Metodo que calcula si el aprendiz aprobó)
        return this.notaFinal >= 3.5; // Devuelve true si la nota es igual o mayor a 3.5 } }
    }

    public void setCorreoInstitucional (String correoInstitucional){
        // Si contiene '@', lo guardas en el atributo con 'this.'
        if (correoInstitucional != null && correoInstitucional.contains("@")){
            this.correoInstitucional = correoInstitucional;
        } else{
            System.out.println("Error: Sintaxis de correo inválido");
        }
    }
}
