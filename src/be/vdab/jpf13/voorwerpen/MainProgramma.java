package be.vdab.jpf13.voorwerpen;

import be.vdab.jpf13.util.Isbn13Exception;
import be.vdab.jpf13.util.Voorwerp;

public class MainProgramma {
    public static void main(String[] args) {
        var voorwerpen = new Voorwerp[3];
        try {
            voorwerpen[0] = new Leesboek();
        } catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[1] = new Leesboek("Studieboek Java 7", "Oracle", 20.4F,
                    "genre Informatica","978-14-302-4764-7", "onderw programmeren");
        }
        catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        try {
            voorwerpen[2] = new Woordenboek("Woordenboek Engels", "Van Dale", 30.10F,
                    "genre vertaal woordenboek", "978-90-664-8143-9", "taal Engels-Nederlands");
        }
        catch (Isbn13Exception ex) {
            System.out.println(ex.getMessage());
        }
        var totaleWinst = 0;
        for (var eenVoorwerp: voorwerpen) {
            if (eenVoorwerp != null) {
                eenVoorwerp.gegevensTonen();
                System.out.println();
                totaleWinst += eenVoorwerp.winstBerekenen();
            }
        }
        System.out.println("DE TOTALE WINST BEDRAAGT " + totaleWinst);
    }
}