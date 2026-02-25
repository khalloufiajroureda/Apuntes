package Programacion.UD5.R3.Ejercicio2;

public class Tramite {
    private String codigo;
    private String nombreTramite;
    private double precioBase;
    private boolean requiereCita;
    private int duracionDias;

    public Tramite(String nombreTramite, double precioBase, int duracionDias) {
        this.nombreTramite = nombreTramite;
        setPrecioBase(precioBase);
        setRequiereCita(requiereCita);
        setDuracionDias(duracionDias);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombreTramite() {
        return nombreTramite;
    }

    public void setNombreTramite(String nombreTramite) {
        this.nombreTramite = nombreTramite;
    }

    public void imprimirMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public double getPrecioBase() {
        if (precioBase == -1) {
            imprimirMensaje("EL precio no puede ser negativo.");
        }
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        if (precioBase  >= 0) {
            this.precioBase = precioBase;
        } else {
            this.precioBase = -1;
        }
    }

    public boolean isRequiereCita() {
        return requiereCita;
    }

    public boolean setRequiereCita(boolean requiereCita) {
        boolean citaValida = false;
        if (nombreTramite.equals("Trámite de extranjería") || nombreTramite.equals("Constitución de sociedad") || nombreTramite.equals("Gestión de herencias") ) {
            this.requiereCita = requiereCita;
            citaValida = true;
        }
        return citaValida;
    }

    public int getDuracionDias() {
        if (duracionDias == 0) {
            imprimirMensaje("Introoduzca una duracion de dias correcta, Por Favor.");
        }
        return duracionDias;
    }

    public void setDuracionDias(int duracionDias) {
        if (duracionDias >= 1) {
            this.duracionDias = duracionDias;
        } else {
            this.duracionDias = 0;
        }
    }

    @Override
    public String toString() {
        return "Tramite [nombreTramite=" + nombreTramite + ", precioBase=" + getPrecioBase() + ", requiereCita="
                + requiereCita + ", duracionDias=" + getDuracionDias() + "]";
    }

    
    
    







}
