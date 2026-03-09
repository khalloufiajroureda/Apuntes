package Programacion.UD6.Ejercicio2;

public class Diseniador extends Empleado {

    private final double BONIFICADOR = 2;

    public Diseniador(String nombre, double sueldoBase) {
        super(nombre, sueldoBase);
    }

    public Double calcularSueldo() {
        double bonificacionSueldo = 0;

        bonificacionSueldo = sueldoBase * BONIFICADOR;
        return bonificacionSueldo;
    }

    @Override
    public String toString() {
        return "Diseñador: " + nombre + " | Sueldo Base: " + sueldoBase + "€";
    }
}
