package Programacion.UD5.PT5Tarea;

/**
 * Clase Animal.
 * Representa un animal del zoológico con sus datos básicos.
 */
public class Animal {

    private String nombre;
    private String codigo;
    private int cantidad;
    private double precio;

    /**
     * Constructor con todos los atributos.
     * 
     * @param nombre   Nombre del animal.
     * @param codigo   Código identificador del animal.
     * @param cantidad Número de ejemplares.
     * @param precio   Precio por unidad.
     */
    public Animal(String nombre, String codigo, int cantidad, double precio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    /**
     * Constructor vacío.
     * Se usa cuando queremos crear el objeto sin datos al principio.
     */
    public Animal() {
    }

    /**
     * Devuelve el nombre del animal.
     * 
     * @return Nombre.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre del animal.
     * 
     * @param nombre Nuevo nombre.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el código del animal.
     * 
     * @return Código.
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Modifica el código del animal.
     * 
     * @param codigo Nuevo código.
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * Devuelve la cantidad de ejemplares.
     * 
     * @return Cantidad.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Modifica la cantidad de ejemplares.
     * 
     * @param cantidad Nueva cantidad.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve el precio del animal.
     * 
     * @return Precio por unidad.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Modifica el precio del animal.
     * 
     * @param precio Nuevo precio.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Devuelve la información del animal.
     * Se usa para mostrarlo por pantalla.
     * 
     * @return Datos del animal en formato texto.
     */
    @Override
    public String toString() {
        return "Código: " + codigo + " | Nombre: " + nombre + " | Cantidad: " + cantidad + " | Precio: " + precio + "€/Und\n";
    }
}