package Ejercicios.UD2.R1;

import java.util.ArrayList;
import java.util.Arrays;

public class ej5 {
    public static void main(String[] args) {
        String eliminado;
        ArrayList<String> animales = new ArrayList<>(Arrays.asList("perro", "gato"));
        animales.add(0, "loro");
        animales.add(0, "tortuga");
        eliminado = animales.remove(0);
        System.out.println("El animal eliminado ha sido: " + eliminado);
        System.out.println(String.join(",", animales));
    }
}
