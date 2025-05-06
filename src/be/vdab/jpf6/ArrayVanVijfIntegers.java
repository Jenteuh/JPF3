package be.vdab.jpf6;

public class ArrayVanVijfIntegers {

    public static void main(String[] args) {

        var getallen = new int[5];
        getallen[0] = (int)((Math.random() * 100) + 1);
        getallen[1] = (int)((Math.random() * 100) + 1);
        getallen[2] = (int)((Math.random() * 100) + 1);
        getallen[3] = (int)((Math.random() * 100) + 1);
        getallen[4] = (int)((Math.random() * 100) + 1);

        var som = getallen[0] + getallen[1] + getallen[2] + getallen[3] + getallen[4];
        var gemiddelde = (float) som / getallen.length;

        System.out.println(getallen[0] + " " + getallen[1] + " " + getallen[2] + " " + getallen[3] + " " + getallen[4]);
        System.out.println("");
        System.out.println("Som: " + som);
        System.out.println("Gemiddelde waarde: " + gemiddelde);

    }


}
