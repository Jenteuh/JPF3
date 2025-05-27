package be.vdab.jpf20;

import java.util.HashMap;

public class BeginLetter {
    private static final String[] woorden = { "een", "twee", "drie",
            "vier", "vijf", "zes", "zeven", "acht", "negen", "tien" };

    public static void main(String[] args) {
        var hashMapAantal = new HashMap<Character, Integer>();

//        for (var woord : woorden) {
//            if (hashMapAantal.get(woord.charAt(0)) == null) {
//                hashMapAantal.put(woord.charAt(0), 1);
//            }
//            else {
//                hashMapAantal.put(woord.charAt(0),hashMapAantal.get(woord.charAt(0))+1) ;
//            }
//        }

        for (var woord : woorden) {
            if (!hashMapAantal.containsKey(woord.charAt(0))) {
                hashMapAantal.put(woord.charAt(0) , 1);
            }
            else {
                hashMapAantal.put(woord.charAt(0) ,hashMapAantal.get(woord.charAt(0))+1);
            }
        }

        System.out.println(
                "\nAantal woorden die beginnen met elke letter: " );
        System.out.println(hashMapAantal); //toString() HashMap wordt gebruikt
        System.out.println("size: " + hashMapAantal.size());
        System.out.println("isEmpty: " + hashMapAantal.isEmpty());

        System.out.println("------ Set van de keys ------");
        for (var c : hashMapAantal.keySet()) {
            System.out.println(c);
        }

        System.out.println("------ Set van de values ------");
        for (var i : hashMapAantal.values()) {
            System.out.println(i);
        }

        System.out.println("------ Set van de map.entries ------");
        for (var entry : hashMapAantal.entrySet()) {
            System.out.print(entry); //toString() Map.Entry wordt gebruikt
            System.out.println(" of anders: " + entry.getKey() + " : " + entry.getValue() );
        }
    }
}
