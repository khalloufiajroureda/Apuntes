package repasoExamen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TractoMatch {
    public static void mostrarMenu() {
        System.out.println("\nElige una opcion: " +
                "\n1: Añadir tractor" +
                "\n2: Listar tractores" +
                "\n3: Evaluar tractor" +
                "\n4: Eliminar tractor" +
                "\n0: Salir");
    }

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public static int leerOpcionMenu(int min, int max, Scanner sc) {
        int opcion;
        boolean correcta = false;

        do {
            opcion = leerInt("Elige una opcion:", sc);

            if (opcion >= min && opcion <= max) {
                correcta = true;
            } else {
                imprimirMensaje("Error: la opcion debe estar entre " + min + " y " + max);
            }
        } while (!correcta);
        return opcion;
    }

    public static int leerInt(String mensaje, Scanner sc) {
        int numero = 0;
        boolean correcto = false;

        while (!correcto) {
            try {
                imprimirMensaje(mensaje);
                numero = Integer.parseInt(sc.nextLine());
                correcto = true;
            } catch (NumberFormatException e) {
                imprimirMensaje("Error: introduce un numero entero valido");
            }
        }
        return numero;
    }

    public static boolean aniadirSinDuplicados(String posibleDuplicado, ArrayList<String> array) {
        boolean duplicadosEncontrado = false;

        for (int i = 0; i < array.size() && !duplicadosEncontrado; i++) {
            if (array.get(i).equalsIgnoreCase(posibleDuplicado)) {
                duplicadosEncontrado = true;
            }
        }
        if (!duplicadosEncontrado) {
            array.add(posibleDuplicado);
        } else {
            imprimirMensaje("No se añade " + posibleDuplicado + " ya que está en el array");
        }
        return duplicadosEncontrado;
    }
    
    public static String leerStringArray(String mensajeString, ArrayList<String> array, Scanner sc) {
        String stringUsuario;
        do {
            imprimirMensaje(mensajeString);
            stringUsuario = sc.nextLine();
        } while (aniadirSinDuplicados(stringUsuario, array));

        return stringUsuario;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> Marca = new ArrayList<String>();
        ArrayList<Integer> PotenciaEnCv = new ArrayList<Integer>();
        ArrayList<String> Trabajo = new ArrayList<String>();
        int opcion;
        final int OPCIONMAX = 4;
        final int OPCIONMIN = 0;
        final int CERO = 0;
        final int UNO = 1;
        final int DOS = 2;
        final int TRES = 3;
        final int CUATRO = 4;
        String marcaTractor;
        int potenciaTractor;
        String trabajoTractor;
        int pedirIndice;
        String resultado;
        String eliminado;

        mostrarMenu();
        opcion = leerOpcionMenu(OPCIONMIN, OPCIONMAX, scanner);

        while (!(opcion == CERO)) {
            
            if (opcion == UNO) {
                System.out.println("Introduzca la marca de su tractor: ");
                marcaTractor = scanner.nextLine();
                Marca.add(marcaTractor);

                potenciaTractor = leerInt("Introduzca la potencia de su tractor: ", scanner);
                if (potenciaTractor <= CERO) {
                    System.out.println("No se puede introducir un valor negativo");
                } else {
                    PotenciaEnCv.add(potenciaTractor);
                }

                System.out.println("Introduzca el tipo de trabajo de su tractor: ");
                trabajoTractor = scanner.nextLine();
                while (!trabajoTractor.equals("arado") && !trabajoTractor.equals("transporte") && !trabajoTractor.equals("siembra")) {
                    System.out.println("Tipo de trabajo invalido.");
                    System.out.println("Introduzca el tipo de trabajo de su tractor: ");
                    trabajoTractor = scanner.nextLine();
                }
                Trabajo.add(trabajoTractor);
                
            }
            if (opcion == DOS) {
                for (int i = 0; i < Marca.size(); i++) {
                    System.out.println(i + " -> " + Marca.get(i) + " | " + PotenciaEnCv.get(i) + " CV | trabajo: "
                            + Trabajo.get(i) + ".");
                }
            }
            if (opcion == TRES) {
                pedirIndice = leerInt("Introduzca el indice de su tractor: ", scanner);

                if (pedirIndice < CERO || pedirIndice >= Marca.size()) {
                    System.out.println("El indice que has introducido es incorrecto");
                } else {
                    potenciaTractor = PotenciaEnCv.get(pedirIndice);
                    trabajoTractor = Trabajo.get(pedirIndice);

                    if (trabajoTractor.equals("arado") && potenciaTractor >= 120) {
                        resultado = "APTO";
                    } else if (trabajoTractor.equals("transporte") && potenciaTractor >= 90) {
                        resultado = "APTO";
                    } else if (trabajoTractor.equals("siembra") && potenciaTractor >= 70) {
                        resultado = "APTO";
                    } else {
                        resultado = "NO APTO";
                    }
                    System.out.println("Tractor evaluado:");
                    System.out.println(Marca.get(pedirIndice) + " | " + potenciaTractor + " CV | trabajo: " + trabajoTractor);
                    System.out.println("Resultado: " + resultado);
                }
            }
            if (opcion == CUATRO) {
                pedirIndice = leerInt("Introduzca el indice del tractor que desea eliminar: ", scanner);

                if (pedirIndice < CERO || pedirIndice >= Marca.size()) {
                    System.out.println("El indice que has introducido es incorrecto");
                } else {
                        eliminado = Marca.remove(pedirIndice);
                        PotenciaEnCv.remove(pedirIndice);
                        Trabajo.remove(pedirIndice);
                    System.out.println("El tractor ha sido eliminado correctamente");
                    System.out.println("El tractor eliminado ha sido: " + eliminado);
                }
            }
            mostrarMenu();
            opcion = leerOpcionMenu(OPCIONMIN, OPCIONMAX, scanner);
        }
        System.out.println("Programa Finalizado");
    }
}
