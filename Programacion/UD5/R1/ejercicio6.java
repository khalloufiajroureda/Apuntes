package Programacion.UD5.R1;

public class ejercicio6 {
    public static void main(String[] args) {
        Reloj hora1 = new Reloj(16, 40, 23);
        Reloj hora2 = new Reloj(15, 15, 56);
        Reloj hora3 = new Reloj(10, 10, 60);

        System.out.println(hora1.toString());
        System.out.println(hora2.toString()); 
        System.out.println(hora3.toString());
    }
}

class Reloj {
    int hora;
    int minuto;
    int segundo;

    Reloj(int hora, int minuto,int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    @Override
    public String toString() {
        return hora + ":" + minuto + ":" + segundo;
    }
}
