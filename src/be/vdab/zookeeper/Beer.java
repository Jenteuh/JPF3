package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;

import java.util.List;

public class Beer extends Zoogdier{

    List<String> leefgebieden;

    public Beer(String naam, Huidbedekking huidbedekking, List<Milieu> milieu, List<String> leefgebieden) {
        super(naam, huidbedekking, milieu);
        setLeefgebieden(leefgebieden);
    }

    public List<String> getLeefgebieden() {
        return leefgebieden;
    }

    public void setLeefgebieden(List<String> leefgebieden) {
        if (!leefgebieden.isEmpty()) {
            this.leefgebieden = leefgebieden;
        }
        else throw new IllegalArgumentException("Voer leefgebied in");
    }

    public void addLeefgebied(String leefgebied) {
        if (!leefgebieden.contains(leefgebied))
            leefgebieden.add(leefgebied);
        else throw new IllegalArgumentException("Leefgebied is al toegevoegd");

    }

    @Override
    public String toString() {
        return getNaam() + ", " + getHuidbedekking() + ", " + milieu + ", " + verzorging(getHuidbedekking()) + ", " + leefgebieden;
    }
}
