package Programacion.UD6.Ejercicio1;

public class Lavadora extends Electrodomestico {

    private double capacidadCarga;

    public Lavadora(String marca, String modelo, int capacidadCarga) {
        super(marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Lavadora: " + super.toString() + "| Capacidad de carga --> " + capacidadCarga;
    }

}
