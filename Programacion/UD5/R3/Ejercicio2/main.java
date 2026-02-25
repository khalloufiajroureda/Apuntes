package Programacion.UD5.R3.Ejercicio2;

import Programacion.UD5.R3.Faker;

public class main {
    public static void main(String[] args) {
        Tramite tramite1 = new Tramite("Solicitud Beca MEC", 15000, 4);
        System.out.println(tramite1);

        final int CANTIDAD_CLIENTES = 4;

        for (int i = 0; i < CANTIDAD_CLIENTES; i++) {
            Cliente aleatorio = new Cliente();
            aleatorio = new Cliente(Faker.nombre(), Faker.dni(), Faker.telefono(), Faker.correo(), Faker.direccion());
            System.out.println(aleatorio);
        }





    }
}
