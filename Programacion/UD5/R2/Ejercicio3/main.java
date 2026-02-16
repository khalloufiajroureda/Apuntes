package Programacion.UD5.R2.Ejercicio3;

import java.util.Scanner;

import Programacion.UD5.R2.Faker;

import Programacion.UD5.R2.Ejercicio1.Estudiante;

public class main {
    public static void main(String[] args) {
        
        final int CANTIDAD_PRODUCTOS = 2;

        Supermercado mercadona = new Supermercado();
        Producto aleatorio = new Producto();
        
        for (int i = 0; i < CANTIDAD_PRODUCTOS; i++) {
            aleatorio = new Producto(Faker.nombresProductos(), Faker.preciosProductos(0, 10), Faker.stockProductos(0, 300), Faker.palabrasLorem());
            mercadona.agregarProducto(aleatorio);
        }
        System.out.println(mercadona);
    }
}
