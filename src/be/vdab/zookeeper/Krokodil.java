package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.KrokodilComparator;
import be.vdab.zookeeper.util.Milieu;

import java.util.Comparator;
import java.util.List;

public class Krokodil extends Reptiel{

    float lengteInMeter;
    int gewichtInKilo;

    public Krokodil(String naam, Huidbedekking huidbedekking, List<Milieu> milieu, int gewichtInKilo, float lengteInMeter) {
        super(naam, huidbedekking, milieu);
        setGewichtInKilo(gewichtInKilo);
        setLengteInMeter(lengteInMeter);
    }

    public float getLengteInMeter() {
        return lengteInMeter;
    }

    public void setLengteInMeter(float lengteInMeter) {
        if (lengteInMeter > 0)
            this.lengteInMeter = lengteInMeter;
        else throw new IllegalArgumentException("Geen geldige lengte");
    }

    public float getGewichtInKilo() {
        return gewichtInKilo;
    }

    public void setGewichtInKilo(int gewichtInKilo) {
        if (gewichtInKilo > 0)
            this.gewichtInKilo = gewichtInKilo;
        else throw new IllegalArgumentException("Geen geldig gewicht");
    }

    public static Comparator<Krokodil> sorteerOpGewicht() {
        return new KrokodilComparator();
    }

@Override
public String toString() {
    return getNaam() + ", " + getHuidbedekking() + ", " + milieu + ", " + verzorging(getHuidbedekking()) + ", " + lengteInMeter + " meter, " + gewichtInKilo + " kg";
}

}