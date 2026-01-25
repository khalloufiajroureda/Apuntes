package Ejercicios.UD2.R2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        ArrayList<Integer> temperaturas = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        int temperaturaSolicitada;
        String opcion = "";

        for (int i = 1; i <= 7; i++) {
            System.out.println("Inserte la temperatura del día " + i + ":");
            temperaturaSolicitada = scanner.nextInt();
            temperaturas.add(temperaturaSolicitada);
        }

        while (!opcion.equals("4")) {
            
            System.out.println("1. Mostrar la temperatura más alta registrada.\n" +
                    "2. Mostrar la temperatura más baja registrada.\n" +
                    "3. Calcular la temperatura promedio de la semana.\n" +
                    "4. Salir del programa.");
            opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                int temperaturaMaxima = temperaturas.get(0);

                for (int i = 1; i < temperaturas.get(i); i++) {
                    if (temperaturas.get(i) > temperaturaMaxima) {
                        temperaturaMaxima = temperaturas.get(i);
                    }
                }
                System.out.println("La temperatura máxima es de " + temperaturaMaxima + " ºC");

            }else if (opcion.equals("2")) {
                int temperaturaMinima = temperaturas.get(0);

                for (int i = 1; i < temperaturas.size(); i++) {
                    if (temperaturas.get(i) < temperaturaMinima) {
                        temperaturaMinima = temperaturas.get(i);
                    }
                }
                System.out.println("La temperatura mínima es de " + temperaturaMinima + " ºC");

            } else if (opcion.equals("3")){
                int sumatorioTemperaturas = 0;

                for (int i = 0; i < temperaturas.size(); i++) {
                    sumatorioTemperaturas += temperaturas.get(i);
                }

                int temperaturaMedia = sumatorioTemperaturas / temperaturas.size();

                System.out.println("La temperatura media es de " + temperaturaMedia + " ºC");
                scanner.close();
            }
        }
    }
}
