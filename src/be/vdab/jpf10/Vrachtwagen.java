package be.vdab.jpf10;

import be.vdab.jpf13.voertuigen.Vervuiler;

public class Vrachtwagen extends Voertuig implements Vervuiler {

    private float maxLading = 10_000F;

    public Vrachtwagen(){

    }

    public Vrachtwagen(String polishouder, float kostprijs, int pk, float gemVerbruik, String nummerplaat, float maxLading) {
        super(polishouder,kostprijs,pk,gemVerbruik,nummerplaat);
        setMaxLading(maxLading);
    }

    public float getMaxLading() {
        return maxLading;
    }

    public void setMaxLading(float maxLading) {
        if (maxLading >= 0)
            this.maxLading = maxLading;
    }

    @Override
    public double getKyotoScore() {
        return (getGemVerbruik()*getPk())/(maxLading/1000F);
    }

    @Override
    public void toon() {
        System.out.println("Polishouder: " + super.getPolishouder());
        System.out.println("Kostprijs: " + super.getKostprijs());
        System.out.println("Aantal PK: " + super.getPk());
        System.out.println("Gemiddeld verbruik: " + super.getGemVerbruik() + "l/100km");
        System.out.println("Nummerplaat: " + super.getNummerplaat());
        System.out.println("Max lading: " + maxLading);
    }

    @Override
    public double berekenVervuiling() {
        return getKyotoScore() * 20.0F;
    }

    @Override
    public String toString() {
        return super.getPolishouder() + ", " + super.getKostprijs() + ", " + super.getPk() + ", " + super.getGemVerbruik() + ", " + super.getNummerplaat() + ", " + maxLading;
    }
}
