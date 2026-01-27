import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Funcionario {
    //Funcion para verificar si un numero coincide en un Array.
    public static Boolean verificarNumeroArray(int numeroComprobar, ArrayList<Integer> arrayNumeros) {
        boolean coincide = false;
        for (int i = 0; i < arrayNumeros.size() && !coincide; i++) {
            if (arrayNumeros.get(i) == numeroComprobar) {
                coincide = true;
            }
        }
        return coincide;
    }
    //-------------------------------------MAIN-----------------------------------
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(4, 15, 50));
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario;

        System.out.println("Introduzca un numero: ");
        numeroUsuario = scanner.nextInt();

        if (verificarNumeroArray(numeroUsuario, numeros)) {
            imprimirMensaje("El numero se encuentra en el array");
        } else {
            imprimirMensaje("El numero NO se encuentra en el array");
        }
        scanner.close();
    }

    // Funcion para imprimir mensaje
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    // Funcion para saber si se repite algun Numero o String en un array.
    public static boolean aniadirSinDuplicados(String posibleDuplicado, ArrayList<String> array) {
        boolean duplicadosEncontrado = false;

        for (int i = 0; i < array.size() && !duplicadosEncontrado; i++) {
            if (array.get(i).equalsIgnoreCase(posibleDuplicado)) {
                duplicadosEncontrado = true;
            }
        }
        if (!duplicadosEncontrado) {
            array.add(posibleDuplicado);

        } else {
            imprimirMensaje("No se añade " + posibleDuplicado + " ya que está en el array");
        }

        return duplicadosEncontrado;
    }
}
