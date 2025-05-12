package be.vdab.jpf8;

public class GetalMain {
    public static void main(String[] args) {
        var getal1 = new Getal(69);
        var getal2 = new Getal(-45);
        var getal3 = new Getal(54);

        getal1.print();

        System.out.println(getal2.absoluut());

        System.out.println(getal1.som(42_000));

        getal1.add(33);
        getal1.print();

        System.out.println(getal3.som(31.5F));
        System.out.println(getal3.som(87.6D));

        System.out.println(getal1.toDouble());
        getal1.toDouble();

        getal1.setX(69);
        getal1.print();
        var x = getal1.getX();
        System.out.println(x);

    }
}
