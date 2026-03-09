package Programacion.UD6.Ejercicio2;

public class Empleado {
    protected String nombre;
    protected double sueldoBase;

    public Empleado(String nombre, double sueldoBase) {
        this.nombre = nombre;
        this.sueldoBase = sueldoBase;
    }

    @Override
    public String toString() {
        return nombre + "| Sueldo Base --> " + sueldoBase + "€";
    }

}
