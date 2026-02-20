import java.util.ArrayList;

public class Cine {
    ArrayList<Pelicula> Peliculas;

    public Cine(ArrayList<Pelicula> Peliculas) {
        this.Peliculas = Peliculas;
    }

    public Cine() {
        Peliculas = new ArrayList<>();
    }

    public void agregarPelicula(Pelicula pelicula) {
        Peliculas.add(pelicula);
    }

    public boolean buscarPelicula(String peliculaAbuscar) {
        boolean peliculaEncontrada = false;
        for (int i = 0; i < Peliculas.size(); i++) {
            if (Peliculas.get(i).getTitulo().equals(peliculaAbuscar)) {
                peliculaEncontrada = true;
            }
        }
        return peliculaEncontrada;
    }

    @Override
    public String toString() {
        String inventario = "";
        for (int i = 1; i <= Peliculas.size(); i++) {
            inventario += "Cine --> Pelicula " + i + ": " + Peliculas.get(i - 1) + "\n";
        }
        return inventario;
    }
}
