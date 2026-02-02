package Programacion.UD5.R1;

public class ejercicio1 {
    public static void main(String[] args) {
        Circulo Circulo1 = new Circulo(5);
        Circulo Circulo2 = new Circulo(1);

    System.out.println("Circulo de radio: " + Circulo1.radio + "Area: " + Circulo1.calcularArea() + "Perimetro: " + Circulo1.calcularPerimetro());
    System.out.println("Circulo de radio: " + Circulo2.radio + "Area: " + Circulo2.calcularArea() + "Perimetro: " + Circulo2.calcularPerimetro());

    }
    
}


class Circulo{
     final double PI = 3.1415;
     double radio;

     Circulo(double radio) {
        this.radio = radio;
     }

     double calcularArea() {
        return PI * this.radio * this.radio;
     }

     double calcularPerimetro() {
        return 2 * PI * this.radio;
     }
}






