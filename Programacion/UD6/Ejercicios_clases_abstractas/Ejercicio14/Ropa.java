public class Ropa extends Producto{
    private String talla;

    public Ropa(String talla, String nombre, double precio) {
        super(nombre, precio);
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "El producto " + getNombre() + " tiene un precio de " + getPrecio() + "€ y la talla es " + talla ;
    }
    
}
