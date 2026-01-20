package Ejercicios.UD2.R1;

import java.util.ArrayList;

public class ej2 {
    public static void main(String[] args) {
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        System.out.println(String.join(",", colores));
    }
}
