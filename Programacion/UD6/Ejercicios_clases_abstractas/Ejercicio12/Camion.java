public class Camion extends Vehiculo{
    
    @Override
    String arrancar() {
        return "El camion ha arrancado";
    }

    @Override
    String detener() {
        return "El camion se a detenido";
    }
}
