package be.vdab.jpf20;

import java.util.ArrayList;
import java.util.TreeSet;

public class TienkamperMain {
    public static void main(String[] args) {

        var Jurgen = new Tienkamper("Jurgen Hingsen",8832);
        var Roman = new Tienkamper("Roman Sebrle",8891);
        var Daley = new Tienkamper("Daley Thompson",8847);
        var Dan = new Tienkamper("Dan O'Brien",8891);

        var lijst = new ArrayList<Tienkamper>();
        lijst.add(Jurgen);
        lijst.add(Roman);
        lijst.add(Daley);
        lijst.add(Dan);

        System.out.println("Tienkamper ArrayList:");
        for (var eenTienkamper:lijst)
            System.out.println(eenTienkamper);
        System.out.println();

        var set = new TreeSet<Tienkamper>();
        set.add(Jurgen);
        set.add(Roman);
        set.add(Daley);
        set.add(Dan);

        System.out.println("Tienkamper TreeSet");
        for (var tk:set)
            System.out.println(tk);
        System.out.println();
    }
}
