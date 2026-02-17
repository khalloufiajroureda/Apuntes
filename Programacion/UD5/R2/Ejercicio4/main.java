public class ejercicio5 {
    public static void main(String[] args) {
        Cancion cancion1 = new Cancion("No me quiero casar", "Bad Bunny", 2.5);
        Cancion cancion2 = new Cancion("Quizas, Tal vez", "Eladio Carrion", 3);
        Cancion cancion3 = new Cancion("Ojitos feat Fabriell", "Dei V", 3.2);

        Playlist summerVibes = new Playlist();
        summerVibes.agregarCancion(cancion1);
        summerVibes.agregarCancion(cancion2);
        summerVibes.agregarCancion(cancion3);
        System.out.println(summerVibes);
        System.out.println("Duracion total de la PlayList --> " + summerVibes.calcularDuracionPlaylist() + " min");
    }
}
