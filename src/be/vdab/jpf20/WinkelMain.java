package be.vdab.jpf20;

import be.vdab.jpf20.winkel.Catalogus;
import be.vdab.jpf20.winkel.Mandje;
import be.vdab.jpf20.winkel.Product;

import java.math.BigDecimal;

public class WinkelMain {
    public static void main(String[] args) {
        var catalogus = new Catalogus();
        var mandje = new Mandje();
        var teller = 1;

        for (var product:catalogus.getProducten()){
            if (teller % 2 == 0) {
                mandje.add(product, teller);
            }
            teller++;
        }
//        mandje.add(new Product("1kg appelen", BigDecimal.valueOf(1.34)), 2);

        System.out.println("U kocht:");
        for (var entry : mandje.getMandje().entrySet()) {
            System.out.println((entry.getKey()) + "; aantal stuks: "
                    + entry.getValue());
        }
        System.out.println();

        System.out.println("U kocht voor een totaal van: " + mandje.getTotalePrijs());
    }
}
