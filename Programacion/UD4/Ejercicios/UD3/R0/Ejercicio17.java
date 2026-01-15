package Programacion.UD4.Ejercicios.UD3.R0;

public class Ejercicio17 {
    
    public static String revertirCadena(String cadenaTexto){
        int cadena = cadenaTexto.length();
        String cadenaInvertida = "";
        for (int i = 1; i <= cadena; i++){
            cadenaInvertida += cadenaTexto.charAt(cadena - i);
        }
        return cadenaInvertida;
    }
    public static void main(String[] args) {
        System.out.println(revertirCadena("Hola"));
    }
}
