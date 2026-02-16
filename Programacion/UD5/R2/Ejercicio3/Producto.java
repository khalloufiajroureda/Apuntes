package Programacion.UD5.R2.Ejercicio3;

import java.util.ArrayList;


public class Producto {
    private static int numeroProductos = 0;
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int cantidadEnStock;
    ArrayList<Producto> aleatorio;

    public Producto(String nombre, String descripcion, double precio, int cantidadEnStock) {
        setId();
        this.nombre = nombre;
        this.descripcion = descripcion;
        setPrecio(precio);
        setCantidadEnStock(cantidadEnStock);
    }

    public Producto() {
        this.aleatorio = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    private void setId(){
        this.id = "P-" + numeroProductos;
        numeroProductos++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean setPrecio(double precio) {
        boolean precioCorrecto = false;
        if (precio >=0) {
            this.precio = precio;
            precioCorrecto = true;
        }
        return precioCorrecto;
    }

    public int  getCantidadEnStock() {
        return cantidadEnStock;
    }

    public boolean setCantidadEnStock( int cantidadEnStock) {
        boolean stockCorrecto = false;
        if (cantidadEnStock >=0) {
            this.cantidadEnStock = cantidadEnStock;
            stockCorrecto = true;
        }
        return stockCorrecto;
    }

    @Override
    public String toString() {
        return nombre + ": " + descripcion + " PRECIO: " + precio + "€.\n--Unidades en Stock: " + cantidadEnStock;
    }
}
