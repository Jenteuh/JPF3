package be.vdab.zookeeper.util;

import be.vdab.zookeeper.Krokodil;

import java.util.Comparator;

public class KrokodilComparator implements Comparator<Krokodil> {
    @Override
    public int compare(Krokodil i, Krokodil j) {
        if(i.getGewichtInKilo() > j.getGewichtInKilo())
            return 1;
        else
            return -1;
    }
}
