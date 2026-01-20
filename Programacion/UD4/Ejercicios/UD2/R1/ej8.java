package Ejercicios.UD2.R1;

import java.util.ArrayList;
import java.util.Arrays;

public class ej8 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(100, 200, 300));
        int tmp = numeros.get(0);
        numeros.set(0, numeros.getLast());
        numeros.set(2, tmp);

        System.out.println(numeros);
        
    }
}
