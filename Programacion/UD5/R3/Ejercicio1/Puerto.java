import java.lang.reflect.Array;
import java.util.ArrayList;

public class Puerto {
    private String nombre;
    public String ubicacion;
    private int capacidadMaxima;
    public String telefonoContacto;
    private ArrayList<Amarre> amarres;
    private ArrayList<Embarcacion> embarcaciones;
    private ArrayList<String> matriculasAmarradas;

    public Puerto(String nombre, String ubicacion, int capacidadMaxima, ArrayList<Amarre> amarres, ArrayList<Embarcacion> embarcaciones, ArrayList<String> matriculasAmarradas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.capacidadMaxima = capacidadMaxima;
        this.amarres = amarres;
        this.embarcaciones = embarcaciones;
        this.matriculasAmarradas = matriculasAmarradas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    @Override
    public String toString() {
        return nombre + ": Ubicacion --> " + ubicacion + " | Capacidad Maxima --> " + capacidadMaxima
                + " | Telefono de Contacto --> " + telefonoContacto + " | Amarres --> " + amarres + " | Embarcaciones --> " + embarcaciones
                + " | Matriculas Amarradas --> " + matriculasAmarradas;
    }

    






















}