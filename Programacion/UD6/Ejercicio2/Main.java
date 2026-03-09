package Programacion.UD6.Ejercicio2;

// Crea una clase Empleado con los atributos nombre y sueldoBase. 
// Luego, crea tres subclases: Programador, Diseñador y Gerente. 
// Cada subclase debe tener un método calcularSueldo() 
// que ajuste el sueldo base según un bonificador específico para cada tipo de empleado.
// private final double BONIFICADOR = 1.5

// Implementa una clase Main para probar la creación de objetos y la llamada al método calcularSueldo().

public class Main {
    public static void main(String[] args) {

        Programador reda = new Programador("reda", 1500);
        System.out.println(reda.calcularSueldo());
        Gerente victoria = new Gerente("Victoria", 2100);
        System.out.println(victoria.calcularSueldo());
        Diseniador patricia = new Diseniador("Patricia", 2200);
        System.out.println(patricia.calcularSueldo());

    }
}