public class ejercicio5 {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Forest Gump", "Sentado en un banco en Savannah", "Robert Zemeckis", 142);
        Pelicula pelicula2 = new Pelicula("Titanic", "A bordo del buque conoce a Rose", "James Cameron", 195);
        Pelicula pelicula3 = new Pelicula("El lobo de Wall Street", "La historia del corredor de bolsa", "Martin Scorsese", 180);

        Cine Kinepolis = new Cine();
        Kinepolis.agregarPelicula(pelicula1);
        Kinepolis.agregarPelicula(pelicula2);
        Kinepolis.agregarPelicula(pelicula3);
        System.out.println(Kinepolis);
        System.out.println(Kinepolis.buscarPelicula("Forest Gump"));
    }
}
