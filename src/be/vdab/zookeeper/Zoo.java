package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Milieu;

import java.util.List;
import java.util.stream.Stream;

public record Zoo(List<GewerveldDier> gewerveldeDieren) {

    public void voegDierToe(GewerveldDier dier) {
        if (!gewerveldeDieren.contains(dier))
            gewerveldeDieren.add(dier);
    }

    public void printLijst() {
        for (GewerveldDier dier : gewerveldeDieren) {
            System.out.println(dier);
        }
    }

    public void lijstVanAlleLandDieren() {
        for (GewerveldDier dier : gewerveldeDieren) {
            if (dier.milieu.contains(Milieu.LAND))
                System.out.println(dier);
        }
    }

    public void lijstVanAlleDierenNamenGesorteerdOpAlfabet() {
        List<String> namen = gewerveldeDieren.stream().map(GewerveldDier::getNaam).sorted().toList();
        for (var naam : namen) {
            System.out.println(naam);
        }
    }

    public double percentageMensen(){
        int aantalMensen = 0;
        int aantalDieren = 0;
        for (GewerveldDier dier : gewerveldeDieren) {
            aantalDieren++;
            if (dier instanceof Mens)
                aantalMensen++;
        }
        return (double) aantalMensen / aantalDieren * 100;
    }

    public void lijstVanAlleKrokoDillenGesorteerdOpGewicht() {
        gewerveldeDieren
                .stream()
                .filter(n -> n instanceof Krokodil)
                .map(n -> (Krokodil) n)
                .sorted(Krokodil.sorteerOpGewicht())
                .forEach(System.out::println);
    }

}
