package be.vdab.jpf13.voertuigen;

import be.vdab.jpf13.util.Milieu;
import be.vdab.jpf13.util.Privaat;

public abstract class Voertuig implements Privaat, Milieu, Comparable<Voertuig> {

    private String polishouder;
    private float kostprijs;
    private int pk;
    private float gemVerbruik;
    private String nummerplaat;

    public Voertuig() {

    }

    public Voertuig(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat) {
        setPolishouder(polishouder);
        setKostprijs(kostprijs);
        setPk(pk);
        setGemVerbruik(gemVerbruik);
        setNummerplaat(nummerplaat);
    }

    public String getPolishouder() {
        return polishouder;
    }

    public void setPolishouder(String polishouder) {
        if (polishouder != null && !polishouder.isBlank())
            this.polishouder = polishouder;
    }

    public float getKostprijs() {
        return kostprijs;
    }

    public void setKostprijs(float kostprijs) {
        if (kostprijs > 0.0F)
            this.kostprijs = kostprijs;
    }

    public int getPk() {
        return pk;
    }

    public void setPk(int pk) {
        if (pk > 0)
            this.pk = pk;
    }

    public float getGemVerbruik() {
        return gemVerbruik;
    }

    public void setGemVerbruik(float gemVerbruik) {
        if (gemVerbruik > 0.0F)
            this.gemVerbruik = gemVerbruik;
    }

    public String getNummerplaat() {
        return nummerplaat;
    }

    public void setNummerplaat(String nummerplaat) {
        if (nummerplaat != null && !nummerplaat.isBlank())
            this.nummerplaat = nummerplaat;
    }

    public abstract double getKyotoScore();

    public void toon() {
        System.out.println("Polishouder: " + polishouder);
        System.out.println("Kostprijs: " + kostprijs);
        System.out.println("Aantal PK: " + pk);
        System.out.println("Gemiddeld verbruik: " + gemVerbruik + "l/100km");
        System.out.println("Nummerplaat: " + nummerplaat);
    }

    @Override
    public void geefPrivateData() {
        System.out.println(" --- Private data van voertuig --- ");
        System.out.println("Polishouder :" + getPolishouder());
        System.out.println("Nummerplaat :" + getNummerplaat());
    }
    @Override
    public void geefMilieuData() {
        System.out.println(" --- Milieu data van voertuig ---");
        System.out.println("PK :" + getPk());
        System.out.println("Kostprijs :" + getKostprijs());
        System.out.println("Gem. verbruik :" + getGemVerbruik());
    }

    @Override
    public String toString() {
        return polishouder + ", " + kostprijs + ", " + pk + ", " + gemVerbruik + ", " + nummerplaat;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Voertuig)) {
            return false;
        }
        var v = (Voertuig) o;
        return nummerplaat.equals(v.getNummerplaat());
    }

    @Override
    public int compareTo(Voertuig o) {
        return nummerplaat.compareTo(o.getNummerplaat());
    }

    @Override
    public int hashCode() {
        return nummerplaat.hashCode();
    }
}
