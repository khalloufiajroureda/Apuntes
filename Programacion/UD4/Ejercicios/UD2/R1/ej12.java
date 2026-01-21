package Ejercicios.UD2.R1;

import java.util.ArrayList;
import java.util.Arrays;

public class ej12 {
    public static void main(String[] args) {
        ArrayList<String> letras = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
        ArrayList<String> invertido = new ArrayList<String>();
        
        for (int i = 0; i < letras.size(); i++) {
            invertido.add(letras.remove(letras.size()-1));
        }
        System.out.println(String.join(", ", invertido));
    }
}
