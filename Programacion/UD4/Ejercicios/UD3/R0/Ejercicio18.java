package Ejercicios.UD3.R0;

public class Ejercicio18 {
    
    public static int contarVocalesEnCadena(String cadenaTexto){
        cadenaTexto = cadenaTexto.toUpperCase();
        int cantidadTotalVocales = 0;
        for (char letra : cadenaTexto.toCharArray()) {
            if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                cantidadTotalVocales++;
            }
        }
        return cantidadTotalVocales;
    }

    public static void main(String[] args) {
        final String CADENA = "REDA";
        System.out.println(contarVocalesEnCadena(CADENA));
    }
}
