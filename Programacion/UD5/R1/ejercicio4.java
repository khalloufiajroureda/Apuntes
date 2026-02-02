package Programacion.UD5.R1;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        Auto primerAuto = new Auto("mercedes", "GLC", 0);
        Auto segundoAuto = new Auto("Volkswagen", "GTI", 0);

        System.out.println("El " + primerAuto.marca +" "+ primerAuto.modelo + " con velocidad actual de: " + primerAuto.velocidadActual + " acelera: " + primerAuto.acelerar() + " y frena: " + primerAuto.frenar());
        System.out.println("El " + segundoAuto.marca +" "+ segundoAuto.modelo + " con velocidad actual de: " + segundoAuto.velocidadActual + " acelera: " + segundoAuto.acelerar() + " y frena: " + segundoAuto.frenar());
    }
}

class Auto {
    Scanner scanner = new Scanner(System.in);
    String marca;
    String modelo;
    int velocidadActual;
    int velocidadFrenada;

    Auto(String marca, String modelo, int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadActual = velocidadActual;
    }

    int acelerar() {
        System.out.println("Introduzca la cantidad que desea acelerar: ");
        velocidadActual += scanner.nextInt();

        return velocidadActual;
    }

    int frenar() {
        System.out.println("Introduzca la cantidad que desea frenar: ");
        velocidadFrenada = scanner.nextInt();

        return velocidadFrenada ;
    }
}