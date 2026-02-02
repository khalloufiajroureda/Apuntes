package Programacion.UD5.R1;

public class ejercicio3 {
    public static void main(String[] args) {
        alumno primerAlumno = new alumno("Reda", "Programacion", 8);
        alumno segundoAlumno = new alumno("Oliver", "Sistemas Informaticos", 4);
        alumno terceroAlumno = new alumno("Iker", "BBDD", 6);
        alumno cuartoAlumno = new alumno("Ruben", "ED", 10);
        alumno quintoAlumno = new alumno("Sem", "Lenguaje de Marcas", 1);

        
        System.out.println("El alumno: " + primerAlumno.nombre + ", ha sacado un " + primerAlumno.calificacion + " en " + primerAlumno.materia + ": " + primerAlumno.aprobo() + " (Aprobado)" );
        System.out.println("El alumno: " + segundoAlumno.nombre + ", ha sacado un " + segundoAlumno.calificacion + " en " + segundoAlumno.materia + ": " + segundoAlumno.aprobo() + " (Suspenso)" );
        System.out.println("El alumno: " + terceroAlumno.nombre + ", ha sacado un " + terceroAlumno.calificacion + " en " + terceroAlumno.materia + ": " + terceroAlumno.aprobo() + " (Aprobado)" );
        System.out.println("El alumno: " + cuartoAlumno.nombre + ", ha sacado un " + cuartoAlumno.calificacion + " en " + cuartoAlumno.materia + ": " + cuartoAlumno.aprobo() + " (Aprobado)" );
        System.out.println("El alumno: " + quintoAlumno.nombre + ", ha sacado un " + quintoAlumno.calificacion + " en " + quintoAlumno.materia + ": " + quintoAlumno.aprobo() + " (Suspenso)" );
    }   
}

class alumno {
    String nombre;
    String materia;
    int calificacion;
    boolean nota;


    alumno(String nombre, String materia, int calificacion) {
        this.nombre = nombre;
        this.materia = materia;
        this.calificacion = calificacion;
    }

    boolean aprobo() {
        if (calificacion >= 6) {
            nota = true;
        } else {
            nota = false;
        }
        return nota;
    }
}
