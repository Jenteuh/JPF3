package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;

import java.util.List;

public abstract non-sealed class Reptiel extends GewerveldDier {

    public Reptiel(String naam, Huidbedekking huidbedekking, List<Milieu> milieu) {
        super(naam, huidbedekking, milieu);
    }
}
