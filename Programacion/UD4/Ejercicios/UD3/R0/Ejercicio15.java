package Ejercicios.UD3.R0;
import java.lang.ClassNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

public class Ejercicio15 {
    public static ArrayList<Integer>  filtrarNumerosMayores(ArrayList<Integer> array, int valor) {
        ArrayList<Integer> nuevoArray = new ArrayList<Integer>();
        int elementoActual;
        for (int i = 0; i < array.size(); i++) {
            elementoActual = array.get(i);
            if (elementoActual > valor) {
                nuevoArray.add(elementoActual);
            }
        }
        return nuevoArray;
    }
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(50, 4, 15));
        int valorNumerico = 10;

        System.out.println(filtrarNumerosMayores(numeros, valorNumerico));
    }
}
