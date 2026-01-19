package Ejemplos;

import java.util.Scanner;

public class EntradaSalida {
    public static void main(String[] args) {
        // Crear objeto Scanner
        Scanner scanner = new Scanner(System.in);

        // Leer datos del usuario
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = scanner.nextInt();

        // Limpiar el búfer
        scanner.nextLine();

        System.out.print("Ingrese su ciudad: ");
        String ciudad = scanner.nextLine();

        // Mostrar datos ingresados
        System.out.println("Hola, " + nombre + "! Tienes " + edad + " años y vives en " + ciudad + ".");

        // Cerrar el objeto Scanner
        scanner.close();
    }
}

