package Ejercicios.UD3.R0;

public class Ejercicio10 {
    public static double areaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }
    
    public static void main(String[] args) {
        double area = areaTriangulo(10.0, 5.0);
        System.out.println(area);
    }
    
}
