package be.vdab.jpf20;

import be.vdab.jpf20.land.Land;
import be.vdab.jpf20.util.LandException;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.ArrayList;

public class LandMain {
    public static void main(String[] args) {
        Land hetLand = null;
        var aantalLanden = 0;
        BigDecimal gemBevolkingsdichtheid;// = BigDecimal.ZERO;
        var landen = new ArrayList<Land>();

        try {
            landen.add(new Land("Ag", "Argentinië", "Buenos Aires",
                    BigInteger.valueOf(38500000L), BigDecimal.valueOf(2825647.56)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("Bg", "Bulgarije", "Sofia",
                    BigInteger.valueOf(7800000L), BigDecimal.valueOf(111002.42)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("Ey", "Egypte", "Cairo",
                    BigInteger.valueOf(72000000L), BigDecimal.valueOf(997739.83)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("In", "India", "New Delhi",
                    BigInteger.valueOf(1060000000L), BigDecimal.valueOf(3336251.12)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("It", "Italië", "Rome",
                    BigInteger.valueOf(57840000L), BigDecimal.valueOf(301268.14)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("L", "Luxemburg", "Luxemburg",
                    BigInteger.valueOf(462690L), BigDecimal.valueOf(2586.27)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("N", "Noorwegen", "Oslo",
                    BigInteger.valueOf(4600000L), BigDecimal.valueOf(386958.22)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("B", "België", "Brussel",
                    BigInteger.valueOf(10400000L), BigDecimal.valueOf(30528.56)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("Si", "Singapore", "Singapore",
                    BigInteger.valueOf(4200000L), BigDecimal.valueOf(640.94)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        try {
            landen.add(new Land("Us", "Verenigde Staten", "Washington DC",
                    BigInteger.valueOf(293000000L), BigDecimal.valueOf(9165487.63)) );
        } catch (LandException le) {System.out.println(le.getMessage());}
        var totBevolkingsdichtheid = BigDecimal.ZERO;
        var absVerschil = BigDecimal.valueOf(Double.MAX_VALUE);
        for (var eenLand : landen) {
            if(eenLand != null) {
                totBevolkingsdichtheid =
                        totBevolkingsdichtheid.add(eenLand.bevolkingsDichtheid());
                aantalLanden++;
                System.out.println(eenLand);
            }
        }
        gemBevolkingsdichtheid = totBevolkingsdichtheid
                .divide(BigDecimal.valueOf(aantalLanden), 2,
                        RoundingMode.HALF_UP);
        for (var eenLand : landen) {
            if ( ((eenLand.bevolkingsDichtheid()
                    .subtract(gemBevolkingsdichtheid))
                    .abs())
                    .compareTo(absVerschil) < 0 ) {
                hetLand = eenLand;
                absVerschil = (eenLand.bevolkingsDichtheid()
                        .subtract(gemBevolkingsdichtheid)).abs();
            }
        }
        System.out.println("\nDe gemiddelde bevolkingsdichtheid is " +
                gemBevolkingsdichtheid);
        System.out.println("Het land dat het dichtst aanleunt bij dit gemiddelde is " + hetLand.getLandNaam() +
                " met een bevolkingsdichtheid van " +
                        hetLand.bevolkingsDichtheid() );
    }
}
