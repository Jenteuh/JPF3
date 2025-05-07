package be.vdab.jpf7;

public class ArrayMetIteraties {
    public static void main(String[] args) {

        var getallen = new int[5];
        var som = 0;

        for (int i = 0; i < getallen.length; i++) {
            getallen[i] = (int) ((Math.random() * 100) + 1);
            som += getallen[i];
        }

        for (var i : getallen) {
            System.out.print(i);
            System.out.print(" ");
        }

        var gemiddelde = (float) som / getallen.length;

        System.out.println("");
        System.out.println("");
        System.out.println("Som: " + som);
        System.out.println("Gemiddelde waarde: " + gemiddelde);

    }
}
