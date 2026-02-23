import java.util.ArrayList;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Embarcacion embarcacion1 = new Embarcacion("Balearia", 15000, "Lancha", "Jason Stantham", 1950,
                200000);
        System.out.println(embarcacion1);

        Amarre amarre1 = new Amarre(10, 10, 0, false, "normal");
        System.out.println(amarre1);
    }
}
