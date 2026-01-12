package Programacion.UD4.Ejercicios.UD1;

import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {
        int numeroPedidos = 1;
        int stockArroz;
        double stockAgua;
        int maki;
        int nigiri;
        int sashimi;
        int arrozMaki = 120;
        int arrozNigiri = 50;
        int arrozSashimi = 0;
        double aguaMaki = 0.10;
        double aguaNigiri = 0.05;
        double aguaSashimi = 0.02;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique el numero de pedidos que desea realizar: ");
        numeroPedidos = scanner.nextInt();
        System.out.print("Indique el stock de arroz disponible: ");
        stockArroz = scanner.nextInt();
        System.out.print("Indique el stock de agua disponible: ");
        stockAgua = scanner.nextDouble();

        for (int i = 0; i < numeroPedidos; i++) {
            System.out.println("--- Pedido " + (i + 1) +" ---");
            System.out.println("Indique el tipo de plato (maki, nigiri, sashimi): ");
            maki = scanner.nextInt();
        }
    }
}