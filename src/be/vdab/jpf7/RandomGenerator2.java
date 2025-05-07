package be.vdab.jpf7;
import java.util.Arrays;

public class RandomGenerator2 {
    public static void main(String[] args) {
        var getallen = new int[100];

        for(var i = 0; i < getallen.length; i++) {
            getallen[i] = (int)(Math.random()*1000 + 1);
        }

        Arrays.sort(getallen);

        for (int j : getallen) {
            System.out.print(j + "\t");
        }
    }
}
