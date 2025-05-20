package be.vdab.jpf13.voertuigen;

import be.vdab.jpf13.util.Vervuiler;

public class Personenwagen extends Voertuig implements Vervuiler {

    private int aantalDeuren = 4;
    private int aantalPassagiers = 5;

    public Personenwagen(){

    }

    public Personenwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, int aantalDeuren, int aantalPassagiers) {
        super(polishouder,kostprijs,pk,gemVerbruik,nummerplaat);
        setAantalDeuren(aantalDeuren);
        setAantalPassagiers(aantalPassagiers);
    }

    public int getAantalDeuren() {
        return aantalDeuren;
    }

    public void setAantalDeuren(int aantalDeuren) {
        if (aantalDeuren >= 0)
            this.aantalDeuren = aantalDeuren;
    }

    public int getAantalPassagiers() {
        return aantalPassagiers;
    }

    public void setAantalPassagiers(int aantalPassagiers) {
        if (aantalPassagiers >= 0)
            this.aantalPassagiers = aantalPassagiers;
    }

    @Override
    public double getKyotoScore() {
        return (getGemVerbruik()*getPk())/aantalPassagiers;
    }

    @Override
    public void toon() {
        System.out.println("Polishouder: " + super.getPolishouder());
        System.out.println("Kostprijs: " + super.getKostprijs());
        System.out.println("Aantal PK: " + super.getPk());
        System.out.println("Gemiddeld verbruik: " + super.getGemVerbruik() + "l/100km");
        System.out.println("Nummerplaat: " + super.getNummerplaat());
        System.out.println("Aantal deuren: " + aantalDeuren);
        System.out.println("Aantal passagiers: " + aantalPassagiers);
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 5.0F;
    }

    @Override
    public String toString() {
        return super.getPolishouder() + ", " + super.getKostprijs() + ", " + super.getPk() + ", " + super.getGemVerbruik() + ", " + super.getNummerplaat() + ", " + aantalDeuren + ", " + aantalPassagiers;
    }
}
