package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;

import java.util.List;

public class Kikker extends Amfibie{

    public Kikker(String naam, Huidbedekking huidbedekking, List<Milieu> milieu) {
        super(naam, huidbedekking, milieu);
    }

}
