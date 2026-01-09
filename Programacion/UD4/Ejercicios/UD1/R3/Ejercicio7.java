package Programacion.UD4.Ejercicios.UD1.R3;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double numero1;
        double numero2;
        char operacion;
        double resultado = 0;
        char suma = '+';
        char resta = '-';
        char multiplicacion = '*';
        char division = '/';

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca el primer numero: ");
        numero1 = scanner.nextDouble();
        System.out.print("Introduzca el segundo numero: ");
        numero2 = scanner.nextDouble();
        System.out.print("Introduzca la operacion (`+`, `-`, `*`, `/`): ");
        operacion = scanner.next().charAt(0);
        scanner.close();

        if (operacion == suma) {
            resultado = numero1 + numero2;
            System.out.println("El resultado de su operacion es de: " + resultado);
        } else if (operacion == resta) {
            resultado = numero1 - numero2;
            System.out.println("El resultado de su operacion es de: " + resultado);
        } else if (operacion == multiplicacion) {
            resultado = numero1 * numero2;
            System.out.println("El resultado de su operacion es de: " + resultado);
        } else if (operacion == division) {
            if (numero2 != 0)
                resultado = numero1 / numero2;
            } else {
            System.out.println("No se puede dividir entre 0");
        }

        System.out.println("El resultado de " + numero1 + operacion + numero2 + " es " + resultado);


    

    }
}
