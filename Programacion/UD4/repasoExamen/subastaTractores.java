package repasoExamen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class subastaTractores {

    public static void mostrarMenu() {
        System.out.println("\nElige una opcion: " +
                "\n1: Añadir lote" +
                "\n2: Listar lotes" +
                "\n3: Hacer puja" +
                "\n4: Ver ganador actual" +
                "\n5: Eliminar lote" +
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
        ArrayList<String> modelo = new ArrayList<String>();
        ArrayList<Integer> precioInicial = new ArrayList<Integer>();
        ArrayList<Integer> mejorPuja = new ArrayList<>(Arrays.asList(0));
        ArrayList<String> mejorPostor = new ArrayList<>(Arrays.asList("NADIE"));
        String modeloTractor;
        int precioTractor;
        int pedirIndice;
        String nombrePostor;
        String namePostor;
        int pujaActual;
        int cantidadPuja;
        final int CERO = 0;
        final int UNO = 1;
        final int DOS = 2;
        final int TRES = 3;
        final int CUATRO = 4;
        final int CINCO = 5;
        int opcion;

        mostrarMenu();
        opcion = leerOpcionMenu(CERO, CINCO, scanner);

        while (!(opcion == CERO)) {

            if (opcion == UNO) {
                System.out.println("Introduzca el modelo de su tractor: ");
                modeloTractor = scanner.nextLine();
                modelo.add(modeloTractor);

                precioTractor = leerInt("Indique el precio inicial para la puja: ", scanner);
                if (precioTractor > CERO) {
                    precioInicial.add(precioTractor);
                }
            }
            if (opcion == DOS) {
                for (int i = 0; i < modelo.size(); i++) {
                    System.out.println(i + " -> " + modelo.get(i) + " | inicial: " + precioInicial.get(i)
                            + " | mejor puja: " + mejorPuja.get(i) + " | postor: " + mejorPostor.get(i));
                }
            }
            if (opcion == TRES) {
                pedirIndice = leerInt("Introduzca el indice del tractor que desea hacer la puja: ", scanner);
                modeloTractor = modelo.get(pedirIndice);
                precioTractor = precioInicial.get(pedirIndice);
                pujaActual = mejorPuja.get(pedirIndice);
                namePostor = mejorPostor.get(pedirIndice);

                System.err.println("Introduzca su nombre: ");
                nombrePostor = scanner.nextLine();
                
                cantidadPuja = leerInt("Introduzca la cantidad de su puja: ", scanner);

                if (cantidadPuja >= precioTractor) {
                    mejorPuja.remove(pujaActual);
                    mejorPuja.add(cantidadPuja);

                    mejorPostor.remove(namePostor);
                    mejorPostor.add(nombrePostor);

                } else {
                    if (cantidadPuja < precioTractor) {
                        System.out.println("PUJA RECHAZADA: No llega al precio inicial.");
                    } else {
                        System.out.println("PUJA RECHAZADA: No supera la mejor puja.");
                    }
                }
                System.out.println("PUJA ACEPTADA");

            }
            mostrarMenu();
            opcion = leerOpcionMenu(CERO, CINCO, scanner);
        }
        System.out.println("Programa Finalizado");
    }
}
