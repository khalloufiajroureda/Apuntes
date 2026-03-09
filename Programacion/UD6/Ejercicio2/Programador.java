package Programacion.UD6.Ejercicio2;

public class Programador extends Empleado {

    private final double BONIFICADOR = 1.5;

    public Programador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    public Double calcularSueldo() {
        double bonificacionSueldo = 0;

        bonificacionSueldo = sueldoBase * BONIFICADOR;
        return bonificacionSueldo;
    }

    @Override
    public String toString() {
        return "Programador: " + nombre + " | Sueldo Base: " + sueldoBase + "€";
    }

}
