import java.util.ArrayList;

public class Amarre {
    private int numero;
    private double longitudMaxima;
    private double precioDia;
    private boolean ocupado;
    private String tipoAmarre;

    public Amarre(int numero, double longitudMaxima, double precioDia, boolean ocupado, String tipoAmarre) {
        this.numero = numero;
        this.longitudMaxima = longitudMaxima;
        this.precioDia = precioDia;
        this.ocupado = ocupado;
        this.tipoAmarre = tipoAmarre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        }
    }

    private void imprimirMensajeError(String mensajeError) {
        System.out.println(mensajeError);
    }

    public double getLongitudMaxima() {
        if (longitudMaxima == -1) {
            imprimirMensajeError("Longitud máxima con valor eroneo al ser menor de 4.0M.");
        }
        return longitudMaxima;
    }

    public void setLongitudMaxima(double longitudMaxima) {
        if (longitudMaxima >= 4.0) {
            this.longitudMaxima = longitudMaxima;
        } else {
            this.longitudMaxima = -1;
        }
    }

    public double getPrecioDia() {
        return precioDia;
    }

    public void setPrecioDia(double precioDia) {

        if (tipoAmarre.equalsIgnoreCase("Normal")) {
            this.precioDia = 25 + (1.5 * longitudMaxima);
        } else if (tipoAmarre.equalsIgnoreCase("Premium")) {
            this.precioDia = 60 + (2.2 * longitudMaxima);
        } else {
            this.precioDia = 120 + (3.5 * longitudMaxima);
        }
    }

    public boolean getOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipoAmarre() {
        return tipoAmarre;
    }

    public void setTipoAmarre(String tipoAmarre) {
        if (tipoAmarre.equalsIgnoreCase("Normal") || tipoAmarre.equalsIgnoreCase("Premium") || tipoAmarre.equalsIgnoreCase("Megayate"))) {
            this.tipoAmarre = tipoAmarre;
        }
    }

    @Override
    public String toString() {
        return "Amarre: " + numero + " Con longitud Maxima de " + getLongitudMaxima() + " metros | Precio por Dia --> " + getPrecioDia()
                + "€/Dia | ocupado --> " + ocupado + " | Tipo de Amarre --> " + getPrecioDia();
    }

}
