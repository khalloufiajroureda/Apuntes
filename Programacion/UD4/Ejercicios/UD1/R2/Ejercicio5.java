package Programacion.UD4.Ejercicios.UD1.R2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su peso: ");
        int peso = scanner.nextInt();
        final double pesoLuna = (peso * 16.5) / 100;
        System.out.println("Su peso en la luna es : " + pesoLuna);
        scanner.close();
    }
}
