package Ejercicios.UD2.R1;

import java.util.ArrayList;

public class ej10 {
    public static void main(String[] args) {
        ArrayList<Integer> pila = new ArrayList<Integer>();
        pila.add(10);
        pila.add(20);
        pila.add(30);
        System.out.println(pila);

        System.out.println("ELemento extraido: " + pila.remove(pila.size()-1));
        System.out.println(pila);

        System.out.println("ELemento extraido: " + pila.remove(pila.size()-1));
        System.out.println(pila);

        System.out.println("ELemento extraido: " + pila.remove(pila.size()-1));

    }
}
