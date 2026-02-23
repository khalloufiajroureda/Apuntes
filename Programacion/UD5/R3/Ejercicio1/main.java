import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Embarcacion embarcacion1 = new Embarcacion("Balearia", 15000, "Lancha", "Jason Stantham", 1950,
                200000);
        System.out.println(embarcacion1);

        Amarre amarre1 = new Amarre(15, true, "Normal");

        ArrayList<String> tiposAmarresValidos = new ArrayList<>(Arrays.asList("Normal", "Premium", "Megayate"));
        if (!tiposAmarresValidos.contains(amarre1.tipoAmarre)) {
            System.out.println("Tipo de amarre NO válido");
        } else {
            System.out.println(amarre1);
        }

    }
}
