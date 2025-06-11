package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;
import be.vdab.zookeeper.util.SoortWater;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ZooApp {
    public static void main(String[] args) {

        List<GewerveldDier> dierenLijst = new ArrayList<>();

        Zoo zoo = new Zoo(dierenLijst);

        //Beer
        List<Milieu> milieuZoogdier = new ArrayList<>();
        milieuZoogdier.add(Milieu.LAND);
        milieuZoogdier.add(Milieu.WATER);
        List<String> leefgebied1 = new ArrayList<>();
        leefgebied1.add("Noord-Amerika");
        leefgebied1.add("Zuid-Amerika");
        leefgebied1.add("Europa");
        leefgebied1.add("Azie");
        Beer beer1 = new Beer("Beer1", Huidbedekking.HAREN, milieuZoogdier, leefgebied1);
        zoo.voegDierToe(beer1);

        //Kikker
        List<Milieu> milieuAmfibie = new ArrayList<>();
        milieuAmfibie.add(Milieu.LAND);
        milieuAmfibie.add(Milieu.WATER);
        Kikker kikker1 = new Kikker("Kikker1", Huidbedekking.GLAD, milieuAmfibie);
        zoo.voegDierToe(kikker1);

        //Krokodil
        List<Milieu> milieuReptiel = new ArrayList<>();
        milieuReptiel.add(Milieu.LAND);
        milieuReptiel.add(Milieu.WATER);
        Krokodil krokodil1 = new Krokodil("Krokodil1", Huidbedekking.SCHUBBEN, milieuReptiel, 420, 4.6F);
        Krokodil krokodil2 = new Krokodil("Krokodil2", Huidbedekking.SCHUBBEN, milieuReptiel, 390, 4.2F);
        zoo.voegDierToe(krokodil1);
        zoo.voegDierToe(krokodil2);

        //Struisvogel
        List<Milieu> milieuVogel = new ArrayList<>();
        milieuVogel.add(Milieu.LAND);
        milieuVogel.add(Milieu.LUCHT);
        Struisvogel struisvogel1 = new Struisvogel("Struisvogel1", Huidbedekking.VEREN, milieuVogel, false);
        zoo.voegDierToe(struisvogel1);

        //Zalm
        List<Milieu> milieuVis = new ArrayList<>();
        milieuVis.add(Milieu.WATER);
        Zalm zalm1 = new Zalm("Zalm1", Huidbedekking.SCHUBBEN, milieuVis, SoortWater.ZOET_EN_ZOUT, "Rood");
        zoo.voegDierToe(zalm1);

        //Mens
        Mens mens1 = new Mens("Jente", Huidbedekking.HAREN, milieuZoogdier, 96040231916L, LocalDate.of(1996, 04, 02));
        zoo.voegDierToe(mens1);

        //zoo.printLijst();
        //zoo.lijstVanAlleLandDieren();
        //zoo.lijstVanAlleDierenNamenGesorteerdOpAlfabet();
        //System.out.println(zoo.percentageMensen() + "%");
        //zoo.lijstVanAlleKrokoDillenGesorteerdOpGewicht();


    }
}
