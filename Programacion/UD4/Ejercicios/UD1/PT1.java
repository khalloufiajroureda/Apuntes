package Ejercicios.UD1;

import java.util.Scanner;

public class PT1 {
    public static void main(String[] args) {
        int numeroPedidos = 0;
        int numeroUnidades;
        String tipoPlato;
        boolean stockSuperado = false;
        int stockArroz = 0;
        double stockAgua = 0;
        int arrozGastadoAcumulado = 0;
        double aguaGastadaAcumulada = 0;
        final int ARROZMAKI = 120, ARROZNIGIRI = 50, ARROZSASHIMI = 0;
        final double AGUAMAKI = 0.10, AGUANIGIRI = 0.05, AGUASASHIMI = 0.02;
        final int PRECIOMAKI = 8, PRECIONIGIRI = 10, PRECIOSASHIMI = 12;
        int arrozRestante;
        double aguaRestante;
        int totalPiezasMaki = 0;
        int totalPiezasNigiri = 0;
        int totalPiezasSashimi = 0;
        int arrozGastadoPedido;
        double aguaGastadoPedido;
        int importe;
        int contadorPedidos = 0;
        int importeCajaTotal = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Indique el numero de pedidos que desea realizar: ");
        numeroPedidos = scanner.nextInt();
        while (numeroPedidos <= 0) {
            System.out.print("Indique el numero de pedidos que desea realizar: ");
            numeroPedidos = scanner.nextInt();
            try {
                numeroPedidos = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                numeroPedidos = 0;
                System.out.println("Error, El numero de pedidos debe de ser un numero entero");
            }
            if (numeroPedidos <= 0) {
                System.out.println("Error, El numero de pedidos debe de ser mayor que 0");
            }
        }
        System.out.print("Indique el stock de arroz disponible: ");
        stockArroz = scanner.nextInt();
        System.out.print("Indique el stock de agua disponible: ");
        stockAgua = scanner.nextDouble();
        scanner.nextLine();

        for (int i = 1; i <= numeroPedidos; i++) {
            System.out.println("--- Pedido " + i + " ---");
            System.out.print("Indique el tipo de plato (maki, nigiri, sashimi): ");
            tipoPlato = scanner.nextLine();
            
            System.out.print("Indique el el numero de unidades que desea: ");
            numeroUnidades = scanner.nextInt();
            scanner.nextLine();
            
            if (tipoPlato.equals("maki")) {
                arrozGastadoPedido = ARROZMAKI * numeroUnidades;
                aguaGastadoPedido = AGUAMAKI * numeroUnidades;
                importe = PRECIOMAKI * numeroUnidades;

            } else if (tipoPlato.equals("nigiri")) {
                arrozGastadoPedido = ARROZNIGIRI * numeroUnidades;
                aguaGastadoPedido = AGUANIGIRI * numeroUnidades;
                importe = PRECIONIGIRI * numeroUnidades;

            } else {
                arrozGastadoPedido = ARROZSASHIMI * numeroUnidades;
                aguaGastadoPedido = AGUASASHIMI * numeroUnidades;
                importe = PRECIOSASHIMI * numeroUnidades;
            }

            if (stockArroz < (arrozGastadoAcumulado + arrozGastadoPedido)) {
                stockSuperado = true;
                System.out.println("¡Alerta! Has superado el stock de arroz");
            }
            if (stockAgua < (aguaGastadaAcumulada + aguaGastadoPedido)) {
                stockSuperado = true;
                System.out.println("¡Alerta! Has superado el stock de agua");
            }

            if (!stockSuperado) {

                contadorPedidos++;
                arrozGastadoAcumulado += arrozGastadoPedido;
                aguaGastadaAcumulada += aguaGastadoPedido;
                importeCajaTotal += importe;

                if (tipoPlato.equals("maki"))
                    totalPiezasMaki += numeroUnidades;
                else if (tipoPlato.equals("nigiri") )
                    totalPiezasNigiri += numeroUnidades;
                else
                    totalPiezasSashimi += numeroUnidades;

                System.out.println("Plato: " + tipoPlato + " | Unidades: " + numeroUnidades + " | Importe cobrado: "
                        + importe + " Euros");
                System.out.println("Arroz gastado en el pedido: " + arrozGastadoPedido + "g | Arroz acumulado: "
                        + arrozGastadoAcumulado + " g");
                System.out.println("Agua gastada en el pedido (L): " + aguaGastadoPedido + " | Agua acumulada (L): " + aguaGastadaAcumulada);
            }
        }
        arrozRestante = stockArroz - arrozGastadoAcumulado;
        aguaRestante = stockAgua - aguaGastadaAcumulada;

        System.out.println("=== RESUMEN FINAL ===");
        System.out.println("Pedidos registrados: " + contadorPedidos  + " de " + numeroPedidos);
        System.out.println("Unidades: Maki: " + totalPiezasMaki + " | Nigiri: " + totalPiezasNigiri + " | Sashimi: "
                + totalPiezasSashimi);
        System.out.println("Consumo total: Arroz: " + arrozGastadoAcumulado + " g | Agua: " + aguaGastadaAcumulada + " L");
        System.out.println("Stock restante: Arroz: " + arrozRestante + " g | Agua: " + aguaRestante + " L");
        System.out.println("Caja del día: " + importeCajaTotal + " Euros");
        if (stockSuperado) {
            System.out.println("Mensaje final:  Registro interrumpido por superación de stock");
        } else {
            System.out.println("Mensaje final: Registro completado con éxito");
        }
        scanner.close();
    }
}