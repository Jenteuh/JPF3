package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;

import java.util.List;

public abstract non-sealed class Vogel extends GewerveldDier {

    private boolean vliegt;

    public Vogel(String naam, Huidbedekking huidbedekking, List<Milieu> milieu, Boolean vliegt) {
        super(naam, huidbedekking, milieu);
        setVliegt(vliegt);
    }

    public boolean getVliegt() {
        return vliegt;
    }

    public void setVliegt(boolean vliegt) {
        this.vliegt = vliegt;
    }

    @Override
    public String toString() {
        return getNaam() + ", " + getHuidbedekking() + ", " + milieu + ", " + verzorging(getHuidbedekking()) + ", vliegt: " + vliegt;
    }
}
