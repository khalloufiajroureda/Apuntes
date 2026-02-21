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
    }
    public tipoAmarre (String tipoAmarre) {
        if(tipoAmarre.equals("Normal") || tipoAmarre.equals("Premium") || tipoAmarre.equals("Megayate")) {
            this.tipoAmarre = tipoAmarre;
        } else {
            System.out.println("Tipo de amarre no valido");
        }
    }
    public precioDia(String tipoAmarre, double precioDia, double longitudMaxima){
        this.tipoAmarre = tipoAmarre;
        this.precioDia = precioDia;
        this.longitudMaxima = longitudMaxima;

        if(tipoAmarre.equals("Normal")){
            this.precioDia = 25 + (1.5 * longitudMaxima)
        } else if (tipoAmarre.equals("Premium")) {
            this.precioDia = 60 + (2.2 * longitudMaxima)
        } else {
            this.precioDia = 120 + (3.5 * longitudMaxima)
        }
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
