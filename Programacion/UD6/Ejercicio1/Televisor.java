package Programacion.UD6.Ejercicio1;

public class Televisor extends Electrodomestico {
    
    private int tamanioPantalla;

    public Televisor(String marca, String modelo, int tamanioPantalla) {
        super(marca, modelo);
        this.tamanioPantalla = tamanioPantalla;
    }

    @Override
    public String toString() {
        return "Televisor: " + super.toString() + " Tamaño de pantalla --> " + tamanioPantalla;
    }

    
}
