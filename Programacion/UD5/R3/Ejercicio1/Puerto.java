import java.lang.reflect.Array;
import java.util.ArrayList;

public class Puerto {
    private static int numeroDePuertos;
    private String nombre;
    public String ubicacion;
    private int capacidadMaxima;
    public String telefonoContacto;
    private ArrayList<Amarre> amarres;
    private ArrayList<Embarcacion> embarcaciones;
    private ArrayList<String> matriculasAmarradas;

    public Puerto(String ubicacion, int capacidadMaxima, ArrayList<Amarre> amarres, ArrayList<Embarcacion> embarcaciones, ArrayList<String> matriculasAmarradas) {
        setNombre(nombre);
        this.ubicacion = ubicacion;
        setCapacidadMaxima(capacidadMaxima);
        setAmarres(amarres);
        setEmbarcaciones(embarcaciones);
        this.matriculasAmarradas = matriculasAmarradas;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            this.nombre = "Puerto-" + numeroDePuertos;
            numeroDePuertos++;
        }
    }


    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (amarres.size() <= capacidadMaxima){
            this.capacidadMaxima = capacidadMaxima;
        }
    }



    public ArrayList<Amarre> getAmarres() {
        return amarres;
    }

    public void setAmarres(ArrayList<Amarre> amarres) {
        if (amarres.size() <= capacidadMaxima){
            this.amarres = amarres;

            for (int i = 0; i < amarres.size(); i++) {
                matriculasAmarradas.set(i, "VACIO");
            }
        }
    }



    public ArrayList<Embarcacion> getEmbarcaciones() {
        return embarcaciones;
    }

    public void setEmbarcaciones(ArrayList<Embarcacion> embarcaciones) {
        this.embarcaciones = embarcaciones;
    }



    public ArrayList<String> getMatriculasAmarradas() {
        return matriculasAmarradas;
    }

    public void setMatriculasAmarradas(ArrayList<String> matriculasAmarradas) {
        this.matriculasAmarradas = matriculasAmarradas;
    }

    public boolean registrarEmbarcacion(Embarcacion e) {
        boolean embarcacionRegistrada = false;

        if (!embarcaciones.contains(e)) {
            embarcaciones.add(e);
            embarcacionRegistrada = true;
        }

        return embarcacionRegistrada;
    }

    public boolean altaAmarre(Amarre a) {
        boolean amarreRegistrado = false;

        if (!amarres.contains(a) && amarres.size() < capacidadMaxima) {
            amarres.add(a);
            matriculasAmarradas.add("VACIO");
            amarreRegistrado = true;
        }

        return amarreRegistrado;
    }


    @Override
    public String toString() {
        return nombre + ": Ubicacion --> " + ubicacion + " | Capacidad Maxima --> " + capacidadMaxima
                + " | Telefono de Contacto --> " + telefonoContacto + " | Amarres --> " + amarres + " | Embarcaciones --> " + embarcaciones
                + " | Matriculas Amarradas --> " + matriculasAmarradas;
    }

    






















}