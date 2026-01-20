package Ejercicios.UD2.R1;

import java.util.ArrayList;

public class ej3 {
    public static void main(String[] args) {
        String eliminado;
        ArrayList<String> colores = new ArrayList<String>();
        colores.add("rojo");
        colores.add("verde");
        colores.add("azul");
        
        eliminado = colores.remove(colores.size()-1);
        System.out.println("El colo eliminado ha sido el: " + eliminado);
        System.out.println(String.join(",", colores));
    }
}
