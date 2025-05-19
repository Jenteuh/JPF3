package be.vdab.jpf13.voorwerpen;

public class MainProgramma {
    public static void main(String[] args) {
        Voorwerp[] voorwerpen = {
                new Boekenrek(),
                new Boekenrek(75, 90, 28.5F),
                new Leesboek(),
                new Leesboek("Leesboek Java 21"
                        , "Oracle", 20.4F,
                        "genre Informatica", "onderw programmeren" ),
                new Woordenboek(),
                new Woordenboek("Woordenboek Engels", "Van Dale", 30.10F,
                        "genre vertaal woordenboek",
                        "taal Engels-Nederlands")
        };
        var totaleWinst = 0F;
        for (var eenVoorwerp: voorwerpen) {
            eenVoorwerp.gegevensTonen();
            System.out.println();
            totaleWinst += eenVoorwerp.winstBerekenen();
        }
        System.out.println("DE TOTALE WINST BEDRAAGT " + totaleWinst);
    }
}
