package Programacion.UD4.Ejercicios.UD1.R4;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final int DIEZ = 10;
        final int UNO = 1;  
        int numeroEntero;
        int multiplicacion;
        int iteracion = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        numeroEntero = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < DIEZ; i++) {
            iteracion = i + UNO;
            multiplicacion = numeroEntero * iteracion;
            System.out.println(numeroEntero + " X " + iteracion + " = " + multiplicacion);
        }
    }
}