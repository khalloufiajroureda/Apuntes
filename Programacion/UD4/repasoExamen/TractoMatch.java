package repasoExamen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class TractoMatch {
    public static void mostrarMenu() {
        System.out.println("\nElige una opcion: " +
        "\n1: Añadir tractor" +
        "\n2: Listar tractores" +
        "\n3: Evaluar tractor" +
        "\n4: Eliminar tractor" +
        "\n0: Salir");
    }

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public static int leerOpcionMenu(int min, int max, Scanner sc) {
        int opcion;
        boolean correcta = false;

        do {
            opcion = leerInt("Elige una opcion:", sc);

            if (opcion >= min && opcion <= max) {
                correcta = true;
            } else {
                imprimirMensaje("Error: la opcion debe estar entre " + min + " y " + max);
            }
        } while (!correcta);
        return opcion;
    }

    public static int leerInt(String mensaje, Scanner sc) {
        int numero = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                imprimirMensaje(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                imprimirMensaje("Error: introduce un numero entero valido");
            }
        }
        return numero;
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Marca = new ArrayList<String>();
        ArrayList<Integer> PotenciaEnCv = new ArrayList<Integer>();
        ArrayList<String> Trabajo = new ArrayList<>(Arrays.asList("arado", "transporte", "siembra"));
        int opcion;
        boolean finPrograma = false;
        final int OPCIONMAX = 4; final int OPCIONMIN = 0; final int UNO = 1; final int DOS = 2; final int TRES = 3; final int CUATRO = 4;
        
        
        while (!finPrograma) {
            mostrarMenu();
            opcion = leerOpcionMenu(OPCIONMIN, OPCIONMAX, scanner);

            if (opcion == UNO) {
                
            }
        }
    }
}


