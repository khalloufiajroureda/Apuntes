package Ejercicios.UD2.R1;

import java.util.ArrayList;

public class ej9 {
    public static void main(String[] args) {
        ArrayList<String> cola = new ArrayList<String>();
        cola.add("cliente1");
        cola.add("cliente2");
        cola.add("cliente3");
        System.out.println(cola);
    
        System.out.println("Cliente atendido: " + cola.remove(0));
        System.out.println(cola);
        
        System.out.println("Cliente atendido: " + cola.remove(0));
        System.out.println(cola);

        System.out.println("Cliente atendido: " + cola.remove(0));
        
    }
}
