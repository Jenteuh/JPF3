package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;

import java.util.List;

public class Struisvogel extends Vogel{

    public Struisvogel(String naam, Huidbedekking huidbedekking, List<Milieu> milieu, Boolean vliegt) {
        super(naam, huidbedekking, milieu, vliegt);
    }

}
