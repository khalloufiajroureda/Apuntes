package Ejercicios.UD3.R0;

public class Ejercicio9 {
    
    public static int menorDetres( int a, int b, int c) {
        int minimo = a;
        if (b < minimo) {
            minimo = b;
        }
        if (c < minimo) {
            minimo = c;
        }
        return minimo;
    }
    public static void main(String[] args) {
        int minimo = menorDetres(3, 7, 1);
        System.out.println(minimo);
    }
}
