package Ejercicios.UD2.R1;

import java.util.ArrayList;
import java.util.Arrays;


public class ej11 {
    
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>(Arrays.asList("Ana", "Pedro"));
        nombres.addLast("Laura");
        nombres.addFirst("Carlos");
        System.out.println(String.join(", ", nombres));
    }
}
