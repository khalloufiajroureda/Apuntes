import java.util.ArrayList;

public class Amarre {
    private int numero;
    private double longitudMaxima;
    public double precioDia;
    private boolean ocupado;
    public String tipoAmarre;

    public Amarre(double longitudMaxima, boolean ocupado, String tipoAmarre) {
        this.longitudMaxima = longitudMaxima;
        this.ocupado = ocupado;
        this.tipoAmarre = tipoAmarre;

        if (tipoAmarre.equalsIgnoreCase("Normal")) {
            this.precioDia = 25 + (1.5 * longitudMaxima);
        } else if (tipoAmarre.equalsIgnoreCase("Premium")) {
            this.precioDia = 60 + (2.2 * longitudMaxima);
        } else {
            this.precioDia = 120 + (3.5 * longitudMaxima);
        }
    }

    public int getNumero() {
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

    public double getLongitudMaxima() {
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

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    @Override
    public String toString() {
        return "Longitud Maxima --> " + longitudMaxima + " metros | Precio por Dia --> " + precioDia
                + "€ | ocupado --> " + ocupado + " | Tipo de Amarre --> " + tipoAmarre;
    }

}
