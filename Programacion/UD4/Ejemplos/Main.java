package Programacion.UD4.Ejemplos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner1.nextLine();
        System.out.println("Nombre: " + nombre);
        scanner1.close();
    }
}