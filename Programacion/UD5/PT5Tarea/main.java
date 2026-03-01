package Programacion.UD5.PT5Tarea;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Clase principal del programa.
 * Se encarga de mostrar el menú y gestionar las opciones del zoológico.
 */
public class main {

    /**
     * Muestra por pantalla el menú con las distintas opciones.
     */
    public static void mostrarMenu() {
        System.out.println("\n ===== GESTIÓN DE ZOOLÓGICO =====" +
                "\n1: Mostrar todos los animales" +
                "\n2: Buscar un animal por código" +
                "\n3: Agregar ejemplares a un animal" +
                "\n4: Retirar ejemplares de un animal" +
                "\n5: Eliminar un animal" +
                "\n6: Salir");
    }

    /**
     * Muestra un mensaje por pantalla.
     * @param mensajeAMostrar Texto que queremos enseñar al usuario.
     */
    public static void imprimirMensaje(String mensajeAMostrar) {
        System.out.println(mensajeAMostrar);
    }

    /**
     * Pide un número entero al usuario y comprueba que sea válido.
     * Si no es correcto, vuelve a pedirlo.
     * 
     * @param mensaje Texto que se muestra al usuario.
     * @param sc Scanner para leer datos.
     * @return Número entero válido.
     */
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

    /**
     * Lee una opción del menú y comprueba que esté dentro de un rango.
     * 
     * @param min Valor mínimo.
     * @param max Valor máximo.
     * @param sc Scanner para leer datos.
     * @return Opción válida elegida por el usuario.
     */
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

    /**
     * Pide un código al usuario y comprueba que tenga 6 caracteres
     * en mayúscula o números.
     * 
     * @param mensaje Texto que se muestra al usuario.
     * @param sc Scanner para leer datos.
     * @return Código válido.
     */
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

    /**
     * Aquí se crea el zoológico y se gestionan las opciones del menú.
     * Se crean animales aleatorios y se añaden al zoológico.
     * El programa se ejecuta hasta que el usuario elige salir.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        final int UNO = 1;
        final int DOS = 2;
        final int TRES = 3;
        final int CUATRO = 4;
        final int CINCO = 5;
        final int SEIS = 6;
        final int CANTIDAD_ANIMALES = 4;

        mostrarMenu();
        opcion = leerOpcionMenu(UNO, SEIS, scanner);

        ArrayList<Animal> grupoAnimales = new ArrayList<>();
        Zoologico reda = new Zoologico(grupoAnimales);

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
                System.out.println(reda.agregarEjemplares(codigo, cantidad));
            }
            if (opcion == CUATRO) {
                String codigo = comprobarCodigoValido("Introduce el código del animal a buscar:", scanner);
                int cantidad = comprobarNumeroValido("Introduce la cantidad de ejemplares a retirar:", scanner);
                System.out.println(reda.retirarEjemplares(codigo, cantidad));
            }
            if (opcion == CINCO) {
                String codigo = comprobarCodigoValido("Introduce el código del animal a eliminar:", scanner);
                System.out.println(reda.eliminarAnimal(codigo));
            }

            mostrarMenu();
            opcion = leerOpcionMenu(UNO, SEIS, scanner);
        }

        System.out.println("Programa Finalizado");
        scanner.close();
    }
}
