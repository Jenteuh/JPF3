package be.vdab.zookeeper.util;

public class RijksregisternummerValidator {

    public static boolean isValid(String rijksregisternummer) {

        // Controleer of het rijksregisternummer 11 cijfers bevat.
        if (rijksregisternummer.length() != 11 || !rijksregisternummer.matches("\\d{11}")) {
            return false;
        }

        // Extracteer de relevante delen.
        int jaar = Integer.parseInt(rijksregisternummer.substring(0, 2));
        int maand = Integer.parseInt(rijksregisternummer.substring(2, 4));
        int dag = Integer.parseInt(rijksregisternummer.substring(4, 6));
        int volgnummer = Integer.parseInt(rijksregisternummer.substring(6, 9));
        int eersteNegen = Integer.parseInt(rijksregisternummer.substring(0, 9));
        int controleCijfers = Integer.parseInt(rijksregisternummer.substring(9, 11));

        // Controleer de geboortedatum (enkel basis controle, geen volledige validatie).
        if (maand < 1 || maand > 12 || dag < 1 || dag > 31) {
            return false;
        }

        // Controleer de controlecijfers.
        int controlSum = 97-(eersteNegen % 97);

        return controlSum == controleCijfers;
    }
}
