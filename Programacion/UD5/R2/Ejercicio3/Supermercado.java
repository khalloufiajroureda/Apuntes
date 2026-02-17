package Programacion.UD5.R2.Ejercicio3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Supermercado {
    
    ArrayList<Producto> productos;

    public Supermercado(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public Supermercado() {
        productos = new ArrayList<>();
    }
    

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void venderProducto(Producto producto, int cantidadComprar) {
        if (productos.contains(producto)) {
            int cantidadRestante = producto.getCantidadEnStock() - cantidadComprar;
            if (cantidadRestante >= 0) {
                producto.setCantidadEnStock(cantidadRestante);
            }
        }
    }

    @Override
    public String toString() {
        String inventario = "";
        for (int i = 1; i <= productos.size(); i++) {
            inventario+= "Supermercado --> Producto " + i + ": " + productos.get(i - 1)+ "\n" ;
        }
        return inventario;
    }

}
