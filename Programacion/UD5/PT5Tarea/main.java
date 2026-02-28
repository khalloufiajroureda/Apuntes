package Programacion.UD5.PT5Tarea;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void mostrarMenu() {
        System.out.println("\n ===== GESTIÓN DE ZOOLÓGICO =====" +
                "\n1: Mostrar todos los animales" +
                "\n2: Buscar un animal por código" +
                "\n3: Agregar ejemplares a un animal" +
                "\n4: Retirar ejemplares de un animal" +
                "\n5: Eliminar un animal" +
                "\n6: Salir");
    }

    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    public static int comprobarNumeroValido(String mensaje, Scanner sc) {
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

    public static int leerOpcionMenu(int min, int max, Scanner sc) {
        int opcion;
        boolean correcta = false;

        do {
            opcion = comprobarNumeroValido("Seleccione una opción:", sc);

            if (opcion >= min && opcion <= max) {
                correcta = true;
            } else {
                imprimirMensaje("Error: la opcion debe estar entre " + min + " y " + max);
            }
        } while (!correcta);
        return opcion;
    }

    public static String comprobarCodigoValido(String mensaje, Scanner sc) {
        String codigo = "";
        boolean correcto = false;

        while (!correcto) {
            imprimirMensaje(mensaje);
            codigo = sc.nextLine().trim();

            if (codigo.matches("^[A-Z0-9]{6}$")) {
                correcto = true;
            } else {
                imprimirMensaje("Error: Introduce un codigo valido");
            }
        }

        return codigo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        final int UNO = 1;
        final int DOS = 2;
        final int TRES = 3;
        final int CUATRO = 4;
        final int CINCO = 5;
        final int SEIS = 6;

        mostrarMenu();
        opcion = leerOpcionMenu(UNO, SEIS, scanner);

        ArrayList<Animal> grupoAnimales = new ArrayList<>();
        Zoologico reda = new Zoologico(grupoAnimales);

        final int CANTIDAD_ANIMALES = 4;

        for (int i = 0; i < CANTIDAD_ANIMALES; i++) {
            Animal aleatorio = new Animal();
            aleatorio = new Animal(Faker.nombreAnimal(), Faker.codigoAnimal(), Faker.cantidadAnimal(),
                    Faker.precioAnimal());
            grupoAnimales.add(aleatorio);
        }

        while (!(opcion == SEIS)) {

            if (opcion == UNO) {
                System.out.println("--------------------------- Listado de Animales ---------------------------");
                System.out.println(reda.mostrarAnimales());
            }
            if (opcion == DOS) {
                String codigo = comprobarCodigoValido("Introduce el código del animal a buscar:", scanner);
                System.out.println(reda.buscarAnimal(codigo));
            }
            if (opcion == TRES) {
                String codigo = comprobarCodigoValido("Introduce el código del animal a buscar:", scanner);
                int cantidad = comprobarNumeroValido("Introduce la cantidad de ejemplares a agregar:", scanner);
                reda.agregarEjemplares(codigo, cantidad);
            }

            mostrarMenu();
            opcion = leerOpcionMenu(UNO, SEIS, scanner);
        }
        System.out.println("Programa Finalizado");

    }
}
