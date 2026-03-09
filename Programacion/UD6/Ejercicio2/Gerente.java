package Programacion.UD6.Ejercicio2;

public class Gerente extends Empleado {

    private final double BONIFICADOR = 5;

    public Gerente(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    public Double calcularSueldo() {
        double bonificacionSueldo = 0;

        bonificacionSueldo = sueldoBase * BONIFICADOR;
        return bonificacionSueldo;
    }

    @Override
    public String toString() {
        return "Gerente: " + nombre + " | Sueldo Base: " + sueldoBase + "€";
    }
}
