package be.vdab.jpf10;

import be.vdab.jpf13.voertuigen.Personenwagen;
import be.vdab.jpf13.voertuigen.Voertuig;
import be.vdab.jpf13.voertuigen.Vrachtwagen;

public class TestProgramma {
    public static void main(String[] args) {

        var auto1 = new Personenwagen();
        auto1.toon();
        System.out.println(auto1);

        var auto2 = new Personenwagen("Jente Huysmans", 12995F, 90, 6.0F, "2-FXE-572", 5, 5);
        auto2.toon();
        System.out.println(auto2);

        var camion1 = new Vrachtwagen();
        camion1.toon();
        System.out.println(camion1);

        var camion2 = new Vrachtwagen("Jorg van Immerseel", 200000F, 460, 30.5F, "1-ABC-123", 26000);
        camion2.toon();
        System.out.println(camion2);

        System.out.println("Kyotoscore personenwagen 1: " + auto1.getKyotoScore());
        System.out.println("Kyotoscore personenwagen 2: " + auto2.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 1: " + camion1.getKyotoScore());
        System.out.println("Kyotoscore vrachtwagen 2: " + camion2.getKyotoScore());

        var voertuigen = new Voertuig[4];
        voertuigen[0] = auto1;
        voertuigen[1] = auto2;
        voertuigen[2] = camion1;
        voertuigen[3] = camion2;

        for (var voertuig : voertuigen) {
            System.out.println(voertuig);
        }

        for (var voertuig : voertuigen) {
            voertuig.toon();
        }
    }
}
