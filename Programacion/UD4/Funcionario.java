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

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(4, 15, 50));
        Scanner scanner = new Scanner(System.in);
        int numeroUsuario;

        System.out.println("Introduzca un numero: ");
        numeroUsuario = scanner.nextInt();

        if (verificarNumeroArray(numeroUsuario, numeros)) {
            System.out.println("El numero se encuentra en el array");
        } else {
            System.out.println("El numero NO se encuentra en el array");
        }
    }
}
