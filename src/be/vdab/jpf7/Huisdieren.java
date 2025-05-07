package be.vdab.jpf7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Huisdieren {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.println("\nHoeveel Huisdieren heeft u?");
        var huisdieren = scanner.nextInt();
        switch (huisdieren) {
            case 0 -> System.out.println("Da's ni veel");
            case 1 -> System.out.println("Beter dan niets");
            case 2 -> System.out.println("Gezellig");
            case 3 -> System.out.println("Wordt dat niet wat druk met momenten?");
            default -> System.out.println("U woont dus op een boerderij");
        }
    }
}
