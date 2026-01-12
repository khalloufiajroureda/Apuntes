package Programacion.UD4.Ejercicios.UD1.R3;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int numero = 0;
        final int DIEZ = 10;
        final int VEINTE = 20;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Escriba un  numero: ");
        numero = scanner.nextInt();
        scanner.close();

        if (numero >= DIEZ && numero <= VEINTE) {
            System.out.println("Su numero se encuentra entre el 10 y el 20");
        } else {
            System.out.println("Su numero NO se encuentra entre el 10 y el 20");
        }
    }
}
