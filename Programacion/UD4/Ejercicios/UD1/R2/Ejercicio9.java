package Ejercicios.UD1.R2;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        int caramelosNinios = 0;
        int caramelosSobrantes = 0;
        int caramelos = 0;
        int ninios = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Indique cuantos caramelos tienes: ");
        caramelos = scanner.nextInt();
        System.out.print("Indique cuantos niños hay: ");
        ninios = scanner.nextInt();
        scanner.close();

        caramelosNinios = (caramelos / ninios);
        caramelosSobrantes = caramelos % ninios;
        System.out.println("A cada niño le toca " + caramelosNinios + " caramelos, y te sobran " + caramelosSobrantes);

    }
}
