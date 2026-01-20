package Ejercicios.UD2.R1;

import java.util.ArrayList;
import java.util.Arrays;

public class ej6 {
    public static void main(String[] args) {
        String eliminado;
        ArrayList<String> frutas = new ArrayList<>(Arrays.asList("manzana", "banana", "naranja"));
        eliminado = frutas.remove(0);
        System.out.println("La fruta eliminada ha sido: " + eliminado);
        frutas.add(2, "fresa");
        System.out.println(String.join(",", frutas));
    }
}
