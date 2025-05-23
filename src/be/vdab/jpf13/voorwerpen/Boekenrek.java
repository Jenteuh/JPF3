package be.vdab.jpf13.voorwerpen;

import be.vdab.jpf13.util.Voorwerp;

public class Boekenrek implements Voorwerp {
    private int hoogte = 0;
    private int breedte = 0;
    private float aankoopPrijs = 0;
    private static final float WINSTMARGE = 2F;

    public Boekenrek(int hoogte, int breedte, float aankoopPrijs) {
        setHoogte(hoogte);
        setBreedte(breedte);
        setAankoopPrijs(aankoopPrijs);
    }

    public Boekenrek() {
        this(175,100,40.0F);
    }

    public int getHoogte() {
        return hoogte ;
    }
    public final void setHoogte(int hoogte) {
        if (hoogte > 0)
            this.hoogte = hoogte;
    }
    public int getBreedte() {
        return breedte ;
    }
    public final void setBreedte(int breedte) {
        if (breedte > 0)
            this.breedte = breedte ;
    }
    public float getAankoopPrijs() {
        return aankoopPrijs ;
    }
    public final void setAankoopPrijs(float aankoopPrijs) {
        if (aankoopPrijs > 0.0)
            this.aankoopPrijs = aankoopPrijs ;
    }
    public float getWINSTMARGE() {
        return WINSTMARGE;
    }

    @Override
    public void gegevensTonen() {
        System.out.println("GEGEVENS VAN DE BOEKENREK ") ;
        System.out.println("Het boekenrek is " + hoogte + " cm hoog en "
                + breedte + " cm breed.");
        System.out.println("Het is eigendom van : " + EIGENAAR);
        System.out.println("Aankoopprijs : " + aankoopPrijs);
        System.out.println("Winst : " + winstBerekenen());
    }
    @Override
    public float winstBerekenen() {
        return aankoopPrijs * WINSTMARGE ;
    }
    @Override
    public String toString() {
        return (hoogte + " ; " + breedte + " ; " + EIGENAAR + " ; " +
                aankoopPrijs + " ; " + WINSTMARGE);
    }
}
