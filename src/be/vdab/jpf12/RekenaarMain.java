package be.vdab.jpf12;

import java.util.Scanner;

public class RekenaarMain {
    public static void main(String[] args) {
        var rek = new Rekenaar("17 + 38 * 2 - 22");
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek); //toString() wordt hier getoond
//lege expressie
        rek.setText("");
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek);
//andere expressie
        rek.setText("7 - 5 * 10 / 0 ");
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek);
//expressie laten ingeven door gebruiker
        var scanner = new Scanner(System.in);
        System.out.println("Geef zelf een te berekenen expressie: ");
        var expressie = scanner.nextLine();
        rek.setText(expressie);
        System.out.println("Totaal: " + rek.getTotaal());
        System.out.println(rek);
    }
}
