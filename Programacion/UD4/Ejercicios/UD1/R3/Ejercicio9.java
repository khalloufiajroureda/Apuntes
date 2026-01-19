package Ejercicios.UD1.R3;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        final int DIEZ = 10;
        int numero;
        int digitoDecenas;
        int digitoUnidades;
        int suma;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduzca un numero de dos digitos: ");
        numero = scanner.nextInt();
        scanner.close();
        
        if (numero >= 10 && numero <= 99) {
            digitoDecenas = numero / DIEZ;
            digitoUnidades = numero % DIEZ;
            suma = digitoDecenas + digitoUnidades;
            System.out.println("El número tiene dos cifras, la suma de sus cifras es: " + suma);
        } else {
            System.out.println("El número NO tiene dos cifras");
        }
        
    }
}
