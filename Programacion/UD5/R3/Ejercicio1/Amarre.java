import java.util.ArrayList;

public class Amarre {
    private int numero;
    private double longitudMaxima;
    public double precioDia;
    private boolean ocupado;
    public String tipoAmarre;

    public Amarre (int numero, double longitudMaxima, boolean ocupado, String tipoAmarre) {
        this.numero = numero;
        this.longitudMaxima = longitudMaxima;
        this.ocupado = ocupado;
        this.tipoAmarre = tipoAmarre;
    }

    public int getNumero(){
        return numero;
    }
    public boolean setNumero(int numero) {
        boolean numeroNoValido = false;
        if (numero > 0) {
            this.numero = numero;
            numeroNoValido = true;
        }
        return numeroNoValido;
    }

    public double getLongitudMaxima(){
        return longitudMaxima;
    }
    public boolean setLongitudMaxima(double longitudMaxima) {
        boolean logitudNoValida = false;
        if (longitudMaxima >= 4) {
            this.longitudMaxima = longitudMaxima;
            logitudNoValida = true;
        }
        return logitudNoValida;
    }

    public boolean getOcupado(){
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public cambiarPrecioDia () {

    }
}
