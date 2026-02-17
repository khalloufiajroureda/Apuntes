package Programacion.UD5.R2.Ejercicio3;

public class Ejercicio3 {

    public static void main(String[] args) {
        Producto producto1 = new Producto("Arroz", "Basmati de origen sirio", 2.33, 10);
        Producto producto2 = new Producto("Naranjas", "De jaen 100% Naturales", 5.60, 10);

        Supermercado Mercadona = new Supermercado();

        Mercadona.agregarProducto(producto1);
        Mercadona.venderProducto(producto1, 3);
        Mercadona.agregarProducto(producto2);
        Mercadona.venderProducto(producto2, 1);
        System.out.println(Mercadona);
    }
}