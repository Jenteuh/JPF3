package be.vdab.jpf13.voorwerpen;

import be.vdab.jpf13.util.Isbn13Exception;
import be.vdab.jpf13.util.Voorwerp;

public abstract class Boek implements Voorwerp {
    private String titel;
    private String auteur;
    private float aankoopPrijs;
    private String genre;
    private String isbn13;

    public Boek(String titel, String auteur, float aankoopPrijs, String genre, String isbn13) {
        setTitel(titel);
        setAuteur(auteur);
        setAankoopPrijs(aankoopPrijs);
        setGenre(genre);
        setIsbn13(isbn13);
    }
    public String getTitel() {
        return titel;
    }
    public final void setTitel(String titel) {
        if (titel != null)
            this.titel = titel;
    }
    public String getAuteur() {
        return auteur;
    }
    public final void setAuteur(String auteur) {
        if (auteur != null)
            this.auteur = auteur;
    }
    public float getAankoopPrijs() {
        return aankoopPrijs;
    }
    public final void setAankoopPrijs(float aankoopPrijs) {
        if (aankoopPrijs > 0.0)
            this.aankoopPrijs = aankoopPrijs;
    }
    public String getGenre() {
        return genre;
    }
    public final void setGenre(String genre) {
        if (genre != null)
            this.genre = genre;
    }
    public String getIsbn13() {
        return isbn13;
    }
    public final void setIsbn13(String isbn13){
        if (checkIsbn13(isbn13)) {
            this.isbn13 = isbn13;
        }
        else {
            throw new Isbn13Exception("laatste cijfer is ongeldig");
        }
    }
    @Override
    public void gegevensTonen() {
        System.out.println("GEGEVENS VAN EEN BOEK ") ;
        System.out.println("Titel : " + titel) ;
        System.out.println("Auteur : " + auteur) ;
        System.out.println("Het is eigendom van : " + EIGENAAR);
        System.out.println("Aankoopprijs : " + aankoopPrijs);
        System.out.println("Genre : " + genre);
    }
    @Override
    public String toString() {
        return (titel + " ; " + auteur + " ; " + EIGENAAR + " ; " +
                aankoopPrijs + " ; " + genre);
    }
    private boolean checkIsbn13(String isbn13) {
        if (isbn13 == null || isbn13.isBlank()) {
            return false;
        }
//verwijder de streepjes
        isbn13 = isbn13.replaceAll( "-", "" );
//controle op lengte van 13 tekens
        if (isbn13.length() != 13) {
            return false;
        }
        try {
            var tot = 0;
            double factor;
            for (var i = 0; i < 12; i++) {
                var digit = Integer.parseInt(isbn13.substring(i, i + 1));
//bepalen of er vermenigvuldigd moet worden met 1 of 3
                factor = (i % 2 == 0) ? 1 : 3;
                tot += digit * factor;
            }
            var checksom = 10 - (tot % 10);
            if (checksom == 10) {
                checksom = 0;
            }
            return checksom == Integer.parseInt(isbn13.substring(12));
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
