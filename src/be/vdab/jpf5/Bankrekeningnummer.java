package be.vdab.jpf5;

public class Bankrekeningnummer {
    public static void main(String[] args) {

        var bankrekeningnummer = 737524091952L;
        var eersteTien = bankrekeningnummer / 100;
        var rest = eersteTien % 97;
        var laatsteTwee = bankrekeningnummer % 100;

        System.out.println(rest == laatsteTwee);
    }
}
