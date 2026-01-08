package Programacion.UD4.Ejercicios.UD1.R2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Indique cuantos caramelos tienes: ");
        int caramelos = scanner.nextInt();

        System.out.print("Indique cuantos niños hay: ");
        int ninios = scanner.nextInt();
        double caramelosNinios = (caramelos / ninios);
        double caramelosSobrantes = caramelos % ninios;
        System.out.println("Tienes " + caramelosNinios + " caramelos, y te sobran " + caramelosSobrantes);
        scanner.close();
    }
}
