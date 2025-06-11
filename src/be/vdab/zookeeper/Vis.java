package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;
import be.vdab.zookeeper.util.SoortWater;

import java.util.List;

public abstract non-sealed class Vis extends GewerveldDier {

    private SoortWater soortWater;

    public Vis(String naam, Huidbedekking huidbedekking, List<Milieu> milieu, SoortWater soortWater) {
        super(naam, huidbedekking, milieu);
        setSoortWater(soortWater);
    }

    public SoortWater getSoortWater() {
        return soortWater;
    }

    public void setSoortWater(SoortWater soortWater) {
        if (soortWater != null) {
            this.soortWater = soortWater;
        }
    }

    @Override
    public String toString() {
        return getNaam() + ", " + getHuidbedekking() + ", " + milieu + ", " + verzorging(getHuidbedekking()) + ", " + soortWater;
    }
}
