package Ejercicios.UD2.R1;

import java.util.ArrayList;
import java.util.Arrays;

public class ej7 {
    public static void main(String[] args) {
        ArrayList<String> dias = new ArrayList<>(Arrays.asList("lunes", "martes", "miercoles", "jueves", "viernes", "sabado", "domingo"));
        dias.set(6, "Domingo (Fin de semana)");
        System.out.println(dias);
    }

}
