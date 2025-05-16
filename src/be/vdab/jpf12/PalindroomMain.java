package be.vdab.jpf12;

import java.util.Scanner;

public class PalindroomMain {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Geef een woord: ");
        var woord = scanner.next();
        var palindroom = new PalindroomTester(woord);

        System.out.println("Woord: " + palindroom.getText());
        System.out.println("Woord omgekeerd: " + palindroom.getReverseText());
//        System.out.println("Woord is een palindroom: " + palindroom.isPalindroom());
        if (palindroom.isPalindroom(false))
            System.out.println("Het woord is een zuiver palindroom.");
        else {
            if (palindroom.isPalindroom(true)) {
                System.out.println("Het woord is, los van de hoofdletters, een palindroom");
            }
            else {
                System.out.println("Het woord is helemaal geen palindroom!");
            }
        }
    }
}
