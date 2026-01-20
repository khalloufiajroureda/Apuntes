package Ejercicios.UD2.R1;

import java.util.ArrayList;
import java.util.Arrays;

public class ej1 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(5, 10, 15, 20));
        System.out.println(numeros.get(0));
        System.out.println(numeros.size()-1);
    }
}
