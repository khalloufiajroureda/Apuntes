package Programacion.UD5.R2.Ejercicio3;

import java.util.Scanner;

import Programacion.UD5.R2.Faker;

import Programacion.UD5.R2.Ejercicio1.Estudiante;

public class main {
    public static void main(String[] args) {
        
        final int CANTIDAD_PRODUCTOS = 100;

        Supermercado mercadona = new Supermercado();
        Producto aleatorio = new Producto();
        

        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            aleatorio = new Producto(Faker.nombresProductos(), Faker.preciosProductos(), Faker.stockProductos(), Faker.descripcionesProductos());
            mercadona.agregarProducto(aleatorio);
        }

        System.out.println(mercadona);
    }
}
