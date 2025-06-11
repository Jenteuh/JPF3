package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;
import be.vdab.zookeeper.util.SoortWater;

import java.util.List;

public class Zalm extends Vis{

    private String kleur;

    public Zalm(String naam, Huidbedekking huidbedekking, List<Milieu> milieu, SoortWater soortWater, String kleur) {
        super(naam, huidbedekking, milieu, soortWater);
        setKleur(kleur);
    }

    public String getKleur() {
        return kleur;
    }

    public void setKleur(String kleur) {
        if(kleur != null)
            this.kleur = kleur;
    }

    @Override
    public String toString() {
        return getNaam() + ", " + getHuidbedekking() + ", " + milieu + ", " + verzorging(getHuidbedekking()) + ", " + getSoortWater() + ", " + kleur;
    }

}
