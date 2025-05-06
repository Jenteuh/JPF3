package be.vdab.jpf6;

public class ArrayOef {

    public static void main(String[] args) {

        System.out.println("--- Impliciete initialisatie array  ---");
        var getallen = new int[3];
        System.out.println("1e element uit int tabel:" + getallen[0]);
        System.out.println("2e element uit int tabel:" + getallen[1]);
        System.out.println("3e element uit int tabel:" + getallen[2]);
        System.out.println("");

        var chars = new char[3];
        System.out.println("1e element uit char tabel:" + chars[0]);
        System.out.println("2e element uit char tabel:" + chars[1]);
        System.out.println("3e element uit char tabel:" + chars[2]);
        System.out.println("");

        var vlaggen = new boolean[3];
        System.out.println("1e element uit boolean tabel:" + vlaggen[0]);
        System.out.println("2e element uit boolean tabel:" + vlaggen[1]);
        System.out.println("3e element uit boolean tabel:" + vlaggen[2]);
        System.out.println("");

        var kommaGetallen = new float[3];
        System.out.println("1e element uit float tabel:" +
                kommaGetallen[0]);
        System.out.println("2e element uit float tabel:" +
                kommaGetallen[1]);
        System.out.println("3e element uit float tabel:" +
                kommaGetallen[2]);
        System.out.println("");

        var namen = new String[3];
        System.out.println("1e element uit String tabel:" + namen[0]);
        System.out.println("2e element uit String tabel:" + namen[1]);
        System.out.println("3e element uit String tabel:" + namen[2]);
        System.out.println("");
    }
}
