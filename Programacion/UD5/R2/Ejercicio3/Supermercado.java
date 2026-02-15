package Programacion.UD5.R2.Ejercicio3;

import java.util.ArrayList;

public class Supermercado {
    
    ArrayList<Producto> productos;

    public Supermercado() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void venderProducto(Producto producto) {
        
    }
}
