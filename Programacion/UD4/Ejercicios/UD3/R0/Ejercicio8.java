package Programacion.UD4.Ejercicios.UD3.R0;

public class Ejercicio8 {

    public static int mayor( int a, int b) {
        int maximo = a;
        if (b > a) {
            maximo = b;
        }
        
        return maximo;
    }
    public static void main(String[] args) {
        int maximo = mayor(10, 15);
        System.out.println(maximo);
    }
}
