import java.util.ArrayList;

import Programacion.UD5.R2.Ejercicio3.Producto;

public class Playlist {

    ArrayList<Cancion> canciones;
    public Playlist(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public Playlist() {
        canciones = new ArrayList<>();
    }
    
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public double calcularDuracionPlaylist() {
        double duracionTotal = 0;
        double duracionCancionActual;
        for (int i = 0; i < canciones.size(); i++) {
            duracionCancionActual = canciones.get(i).getDuracion();
            duracionTotal += duracionCancionActual;
        }
        return duracionTotal;
    }

    @Override
    public String toString() {
        String inventario = "";
        for (int i = 1; i <= canciones.size(); i++) {
            inventario+= "Playlist --> Cancion " + i + ": " + canciones.get(i - 1)+ "\n" ;
        }
        return inventario;
    }

    
}
