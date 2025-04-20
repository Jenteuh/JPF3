package be.vdab.jpf5;

public class Snoepautomaat {
    public static void main(String[] args) {
        var krediet = 2;
        var prijs = 1.02;
        var wisselgeld = krediet - prijs;
        var wisselgeldCent = (int)(wisselgeld * 100);

        var munt1eur = wisselgeldCent / 100;
        wisselgeldCent -= munt1eur * 100;
        var munt50c = wisselgeldCent / 50;
        wisselgeldCent -= munt50c * 50;
        var munt20c = wisselgeldCent / 20;
        wisselgeldCent -= munt20c * 20;
        var munt10c = wisselgeldCent / 10;
        wisselgeldCent -= munt10c * 10;
        var munt5c = wisselgeldCent / 5;
        wisselgeldCent -= munt5c * 5;
        var munt2c = wisselgeldCent / 2;
        wisselgeldCent -= munt2c * 2;
        var munt1c = wisselgeldCent;

        System.out.println("U krijgt " + wisselgeld + " euro terug");
        System.out.println("1 euro: " + munt1eur);
        System.out.println("50 cent: " + munt50c);
        System.out.println("20 cent: " + munt20c);
        System.out.println("10 cent: " + munt10c);
        System.out.println("5 cent: " + munt5c);
        System.out.println("2 cent: " + munt2c);
        System.out.println("1 cent: " + munt1c);
    }
}
