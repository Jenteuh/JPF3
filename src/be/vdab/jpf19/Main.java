package be.vdab.jpf19;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        var scanner = new Scanner(System.in);

        System.out.print("geboortedatum (dag/maand/jaar): ");
        var geboorteString = scanner.next();
        var geboorte = LocalDate.parse(geboorteString, formatter);
        System.out.println(geboorte.getDayOfWeek());
        System.out.println(ChronoUnit.YEARS.between(geboorte, LocalDate.now()));
    }
}
