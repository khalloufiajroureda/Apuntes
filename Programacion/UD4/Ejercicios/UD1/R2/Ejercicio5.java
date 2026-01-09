package Programacion.UD4.Ejercicios.UD1.R2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        final double GRAVEDADLUNA = 0.165;
        Scanner scanner = new Scanner(System.in);
        double pesoUsuario = 0;
        double pesoLuna = 0;

        System.out.print("Ingrese su peso: ");
        pesoUsuario = scanner.nextDouble();
        pesoLuna = pesoUsuario * GRAVEDADLUNA;

        System.out.printf("El usuario pesa en la tierra: %.2f kgs. Su peso en la luna es %.2f kgs", pesoUsuario, pesoLuna);
        scanner.close();
    }
}
