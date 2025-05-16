package be.vdab.jpf12;

import org.w3c.dom.ls.LSInput;

import java.util.Scanner;

public class Klinkers {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        System.out.println("Invoer:");
        var zin = scanner.nextLine().toLowerCase();
        var aantalKlinkers = 0;

        for (var i=0; i<zin.length(); i++) {
            var character = zin.charAt(i);
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u'){
                aantalKlinkers++;
            }
            //alternatief
//            if ("aeiou".indexOf(character)> -1)
//                aantalKlinkers++;
        }
        System.out.println("Aantal klinkers: " + aantalKlinkers);
    }
}
