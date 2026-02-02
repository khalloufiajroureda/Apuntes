package Programacion.UD5.R1;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        CuentaBancaria primerTitular = new CuentaBancaria("Reda", 0);
        CuentaBancaria segundoTitular = new CuentaBancaria("Ruben", 0);
        
        System.out.println("Nombre: " + primerTitular.titular + ", Saldo ingresado: " + primerTitular.depositarCantidad() + "€, Saldo restante: " + primerTitular.retirarCantidad() + "€");
        System.out.println("Nombre: " + segundoTitular.titular + ", Saldo ingresado: " + segundoTitular.depositarCantidad() + "€, Saldo restante: " + segundoTitular.retirarCantidad() + "€");
    }

}

class CuentaBancaria{
    Scanner scanner = new Scanner(System.in);
    String titular;
    int saldo;
    int saldoRetirado;

    CuentaBancaria(String titular, int saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    int depositarCantidad() {
        System.out.println("Deposita la cantidad que desee: ");
        saldo = scanner.nextInt();

        return saldo;
    }

    int retirarCantidad() {
        System.out.println("Retire la cantidad que desee: ");
        saldoRetirado = scanner.nextInt();

        if (saldoRetirado > saldo) {
            System.out.println("No puedes retirar, no tienes suficiente saldo");
        } else {
            saldo -= saldoRetirado;
        }
        return saldo;
    }

}
