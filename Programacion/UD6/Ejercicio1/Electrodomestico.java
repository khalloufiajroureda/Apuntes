package Programacion.UD6.Ejercicio1;

public class Electrodomestico {

    private String marca;
    private String modelo;

    public Electrodomestico(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca del electrodomestico --> " + marca + " | Modelo --> " + modelo;
    }

}
