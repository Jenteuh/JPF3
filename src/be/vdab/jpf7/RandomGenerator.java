package be.vdab.jpf7;

public class RandomGenerator {
    public static void main(String[] args) {

        var getallen = new int[100]; //automatische initialisatie op 0

        for(var i=0; i<10_000; i++) {
            var randGetal = (int)(Math.random()*100 + 1 );
            getallen[randGetal-1]++;
        }

        for(var i=0; i<getallen.length; i++) {
            System.out.println("getal " + (i+1) + " : " + getallen[i]);
        }


    }
}
