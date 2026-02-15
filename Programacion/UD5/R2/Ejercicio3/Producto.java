package Programacion.UD5.R2.Ejercicio3;

import java.util.ArrayList;


public class Producto {
    
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;
    private double cantidadEnStock;
    ArrayList<Producto> aleatorio;

    public Producto(int id, String nombre, String descripcion, double precio, double cantidadEnStock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidadEnStock = cantidadEnStock;
        setNombre(nombre);
        setPrecio(precio);
        setCantidadEnStock(cantidadEnStock);
        setDescripcion(descripcion);
    }

    

    public Producto() {
        this.aleatorio = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double  getCantidadEnStock() {
        return cantidadEnStock;
    }

    public void setCantidadEnStock( double cantidadEnStock) {
        this.cantidadEnStock = cantidadEnStock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{");
        sb.append("id=").append(id);
        sb.append(", nombre=").append(nombre);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", precio=").append(precio);
        sb.append(", cantidadEnStock=").append(cantidadEnStock);
        sb.append('}');
        return sb.toString();
    }


}
