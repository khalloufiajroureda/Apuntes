public class Electronico extends Producto {
    private int garantia;

    public Electronico(int garantia, String nombre, double precio) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "El producto " + getNombre() + " tiene un precio de " + getPrecio() + "€ una garantia de " + garantia + " años";
    }
}
