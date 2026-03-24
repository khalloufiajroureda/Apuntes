// Crea una **clase abstracta** `Figura` que tenga un método abstracto `calcularArea()`.
// Luego, crea dos clases concretas: `Triangulo` y `Cuadrado`. 
// La clase `Triangulo` debe tener los atributos `base` y `altura`, y su método `calcularArea()` debe devolver el área del triángulo. 
// La clase `Cuadrado` debe tener el atributo `lado`, y su método `calcularArea()` debe devolver el área del cuadrado. 

public class ej11 {
    public static void main(String[] args) {

        Triangulo triangulo = new Triangulo(2, 4);
        Cuadrado cuadrado = new Cuadrado(5.69);

        System.out.println("El area del triangulo es --> " + triangulo.calcularArea());
        System.out.println("El area del cuadrado es --> " + cuadrado.calcularArea());
        
    }
}
