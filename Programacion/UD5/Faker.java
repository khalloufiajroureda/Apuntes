

public class Faker {

    // ===== Datos base para Películas =====
    private static final String[] prefijosTitulo = {
            "El Señor de", "La Venganza de", "El Misterio de", "Crónicas de",
            "El Ataque de", "La Maldición de", "El Retorno de", "En Busca de",
            "La Noche de", "El Secreto de", "Guardianes de", "El Último Vuelo de"
    };

    private static final String[] sufijosTitulo = {
            "los Anillos", "la Galaxia", "los Zombies", "Marte",
            "los Dragones", "la Montaña", "los Espías", "las Sombras",
            "las Estrellas", "la Selva", "los Océanos", "la Ciudad"
    };

    private static final String[] generos = {
            "Acción", "Comedia", "Drama", "Ciencia Ficción", "Terror",
            "Romance", "Animación", "Documental", "Suspense", "Fantasía"
    };

    private static final String[] clasificaciones = {
            "TP", "+7", "+12", "+16", "+18"
    };

    // =========================================================
    // Utilidades básicas
    // =========================================================

    /**
     * Genera un número entero aleatorio entre min y max (inclusive).
     */
    public static int entero(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    /**
     * Devuelve un elemento aleatorio de un array de Strings.
     */
    private static String deLista(String[] lista) {
        return lista[entero(0, lista.length - 1)];
    }

    // =========================================================
    // Generadores específicos para Películas
    // =========================================================

    /**
     * Genera un título de película combinando un prefijo y un sufijo.
     * Ej: "El Retorno de la Galaxia"
     */
    public static String tituloPelicula() {
        return deLista(prefijosTitulo) + " " + deLista(sufijosTitulo);
    }

    /**
     * Devuelve un género cinematográfico aleatorio.
     */
    public static String generoPelicula() {
        return deLista(generos);
    }

    /**
     * Genera una duración aleatoria en minutos para la película.
     * Rango: 80 a 210 minutos.
     */
    public static int duracionPelicula() {
        return entero(80, 210);
    }

    /**
     * Devuelve una clasificación de edad aleatoria.
     */
    public static String clasificacionEdad() {
        return deLista(clasificaciones);
    }

    // =========================================================
    // Generadores específicos para Salas
    // =========================================================

    /**
     * Genera una capacidad máxima aleatoria para la sala.
     * Rango: 50 a 300 butacas.
     */
    public static int capacidadSala() {
        return entero(50, 300);
    }

    /**
     * Genera un código de sala estructurado.
     * Ej: "SALA-4B", "SALA-1X"
     */
    public static String codigoSala() {
        String letras = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int numeroSala = entero(1, 9);
        char letraSala = letras.charAt(entero(0, letras.length() - 1));
        
        return "SALA-" + numeroSala + letraSala;
    }
}
