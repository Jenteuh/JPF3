package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;

import java.util.List;

public abstract non-sealed class Amfibie extends GewerveldDier {
    public Amfibie(String naam, Huidbedekking huidbedekking, List<Milieu> milieu) {
        super(naam, huidbedekking, milieu);
    }
}
