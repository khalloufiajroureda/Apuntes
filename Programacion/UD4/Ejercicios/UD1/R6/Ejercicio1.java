package Programacion.UD4.Ejercicios.UD1.R6;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        int numeroAlumno = 1;
        int nota = 0;
        int sumatorio = 0;
        int alumnosAprobados = 0;
        int alumnosSuspensos = 0;
        int promedio;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la calificacion del alumno " + numeroAlumno + ": ");
        numeroAlumno = scanner.nextInt();

        while (nota != -1) {
            numeroAlumno += 1;

            while (nota < 0 || nota > 10) {
                System.out.print("Calificacion Incorrecta. Introduce la calificacion del alumno " + numeroAlumno + ": ");
                nota = scanner.nextInt();
            }

            if (nota >= 5) {
                alumnosAprobados++;
            } else {
                alumnosSuspensos++;
            }

            System.out.print("Introduce la calificacion del alumno " + numeroAlumno + ": ");
            nota = scanner.nextInt();
            
        }
        promedio = sumatorio / (numeroAlumno - 1);

        System.out.println("Hay " + alumnosAprobados + " alumnos aprobados y " + alumnosSuspensos + " alumnos suspensos");
        System.out.println("La calificación media es " + promedio);
        scanner.close();
    }
}
