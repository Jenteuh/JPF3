package be.vdab.jpf13.voorwerpen;

import be.vdab.jpf13.util.Isbn13Exception;

public class Woordenboek extends Boek {
    private String taal;
    private static final float WINSTMARGE = 1.75F;
    public Woordenboek() {
        this("Woordenboek Nederlands", "Van Dale", 25.8F,
                "verklarend woordenboek", "978-90-664-8384-2", "taal Nederlands" );
    }
    public Woordenboek(String titel, String auteur, float aankoopPrijs,
                       String genre, String isbn13, String taal ) {
        super(titel, auteur, aankoopPrijs, genre, isbn13 );
        setTaal(taal) ;
    }
    public String getTaal() {
        return taal;
    }
    public final void setTaal(String taal) {
        if (taal != null)
            this.taal = taal;
    }
    public float getWINSTMARGE() {
        return WINSTMARGE;
    }

    @Override
    public void gegevensTonen() {
        super.gegevensTonen();
        System.out.println("Taal: " + taal);
        System.out.println("Winst: " + winstBerekenen());
    }

    @Override
    public float winstBerekenen() {
        return super.getAankoopPrijs() * WINSTMARGE;
    }

    @Override
    public String toString() {
        return (super.toString() + " ; " + taal + " ; " + WINSTMARGE);
    }
}
