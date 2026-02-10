package Programacion.UD5.R2;

public class Ejercicio1 {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("reda", -12, "STEM0607");
        Estudiante estudiante2 = new Estudiante("iker", 20, "Stem0912");
        System.out.println(estudiante1);
        System.out.println(estudiante2);
    }
}

class Estudiante {

    private String nombre;
    private int edad;
    private String numeroDeMatricula;

    public Estudiante(String nombre, int edad, String numeroDeMatricula) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroDeMatricula = numeroDeMatricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public static void mensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            mensaje("ERROR, la edad debe ser mayo que 0");
        }
    }

    public String getNumeroDeMatricula() {
        return numeroDeMatricula;
    }

    public void setNumeroDeMatricula(String numeroDeMatricula) {
        if (numeroDeMatricula.startsWith("STEM")) {
            this.numeroDeMatricula = numeroDeMatricula;
        } else {
            mensaje("Numero de matricula incorrecto");
        }
    }

    @Override
    public String toString() {
        return "Estudiante [Nombre: " + getNombre() + ", Edad: " + getEdad() + ", Numero de Matricula: "
                + getNumeroDeMatricula()
                + "]";
    }

}
