package Programacion.UD5.R1;


public class ejercicio5 {
    public static void main(String[] args) {
        Termometro prueba1 = new Termometro(15);
        Termometro prueba2 = new Termometro(50);

        System.out.println("La temperatura en grados Celsius es de: " + prueba1.temperatura + " y de Fahrenheit es de: " + prueba1.convertirAFahrenheit());
        System.out.println("La temperatura en grados Celsius es de: " + prueba2.temperatura + " y de Fahrenheit es de: " + prueba2.convertirAFahrenheit());
    }
}

class Termometro {
        double temperatura;

        Termometro(double temperatura) {
            this.temperatura = temperatura;
        }

        double convertirAFahrenheit() {
            return (temperatura * 1.8) + 32;
        }

    }

