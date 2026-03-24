// ### 15. Empleados con Diferentes Roles
// **Enunciado:**  
// Crea una **clase abstracta** `Empleado` que tenga un método abstracto `calcularSueldo()`. Luego, crea dos clases concretas: `Gerente` y `Asistente`. La clase `Gerente` debe tener un atributo adicional `bono` y su método `calcularSueldo()` debe devolver el sueldo base más el bono. La clase `Asistente` debe tener un atributo adicional `horasExtras` y su método `calcularSueldo()` debe devolver el sueldo base más el pago por horas extras.  

// Implementa una clase `Main` para probar la creación de objetos y la llamada al método `calcularSueldo()`.

public class Main {
    public static void main(String[] args) {
        Gerente santi = new Gerente("Santiago Abascal", 40000.0, 18000.0);
        Asistente olola = new Asistente("Macarena Olona", 60000, 800);

        System.out.println(santi.getNombre() + " --> Total sueldo base mas bono: " + santi.calcularSueldo() + "€");
        System.out.println(olola.getNombre() + " --> Total sueldo base mas horas extra: " + olola.calcularSueldo() + "€");

    }
}
