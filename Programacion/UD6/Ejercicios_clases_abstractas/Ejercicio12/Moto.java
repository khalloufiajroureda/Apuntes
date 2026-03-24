public class Moto extends Vehiculo{
    
    @Override
    String arrancar() {
        return "La moto ha arrancado";
    }

    @Override
    String detener() {
        return "La moto se ha detenido";
    }
}
