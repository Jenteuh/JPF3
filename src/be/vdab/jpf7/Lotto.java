package be.vdab.jpf7;
import java.util.Arrays;

public class Lotto {
    public static void main(String[] args) {
        var getallen = new int[7];

        while (getallen[getallen.length - 1] == 0) {
            var getal = (int) (Math.random() * 42 + 1);
            var index = 0;
            while (getallen[index] != getal && getallen[index] != 0) {
                index++;
            }
            if (getallen[index] == 0) {
                getallen[index] = getal;
            }
        }

        Arrays.sort(getallen, 0, 6);

        for(var i=0; i < getallen.length -1; i++) {
            System.out.print(getallen[i]+ "\t");
        }
        System.out.println("");
        System.out.println(getallen[getallen.length-1]);
    }
}
