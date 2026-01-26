package Ejercicios.UD2.R2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        ArrayList<String> tareas = new ArrayList<>(Arrays.asList("tarea1", "tarea2", "tarea3"));
        ArrayList<Boolean> completadas = new ArrayList<>(Arrays.asList(false, true, false));
        ArrayList<String> pendientes = new ArrayList<String>();
        ArrayList<String> hechas = new ArrayList<String>();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        String nueva;
        String buscar;
        Boolean encontrado = true;

        do {

            do {
                try {
                    System.out.println("1. Añadir tarea.");
                    System.out.println("2. Marcar completada.");
                    System.out.println("3. Ver pendientes.");
                    System.out.println("4. Ver completadas.");
                    System.out.println("5. Salir.");
                    opcion = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error introduce un numero: ");
                    opcion = -1;
                }

            } while (opcion < 1 || opcion >= 5);

            if (opcion == 1) {
                System.out.println("Nueva tarea:");
                nueva = scanner.nextLine();
                tareas.add(nueva);
                completadas.add(false);

            } else if (opcion == 2) {
                System.out.println("Nombre de la tarea:");
                buscar = scanner.nextLine();
                encontrado = false;

                for (int i = 0; i < tareas.size() && !encontrado; i++) {
                    if (tareas.get(i).equals(buscar)) {
                        encontrado = true;
                        completadas.set(i, true);
                    }
                }

                if (!encontrado) {
                    System.out.println("No encontrada");
                }
            } else if (opcion == 3) {

                for (int i = 0; i < completadas.size(); i++) {
                    if (!completadas.get(i)) {
                        pendientes.add(tareas.get(i));
                    }

                    System.err.println("Pendientes: " + pendientes);

                }

            } else if (opcion == 4) {
                for (int i = 0; i < completadas.size(); i++) {
                    if (completadas.get(i)) {
                        hechas.add(tareas.get(i));
                    }

                    System.out.println("Completadas: " + hechas);
                }
            }

        } while (opcion != 5);
        System.out.println("Programa finalizado");
        scanner.close();
    }
}