import java.util.ArrayList;

public class Amarre {
    private static int numeroAmarres = 1;
    private int numero;
    private double longitudMaxima;
    private double precioDia;
    private boolean ocupado;
    private String tipoAmarre;

    public Amarre(double longitudMaxima, String tipoAmarre) {
        setNumero();
        this.longitudMaxima = longitudMaxima;
        this.tipoAmarre = tipoAmarre;
        calcularPrecioDia();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero() {
        if (numero > 0) {
            this.numero = numeroAmarres;
            numeroAmarres++;
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

    public void calcularPrecioDia() {

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

    public void isOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public String getTipoAmarre() {
        return tipoAmarre;
    }

    public void setTipoAmarre(String tipoAmarre) {
        if (tipoAmarre.equalsIgnoreCase("Normal") || tipoAmarre.equalsIgnoreCase("Premium") || tipoAmarre.equalsIgnoreCase("Megayate")) {
            this.tipoAmarre = tipoAmarre;
        }
    }

    @Override
    public String toString() {
        return "Amarre: " + numero + " Con longitud Maxima de " + getLongitudMaxima() + " metros | Precio por Dia --> " + getPrecioDia() + "€/Dia | ocupado --> " + ocupado + " | Tipo de Amarre --> " + getTipoAmarre();
    }

}
