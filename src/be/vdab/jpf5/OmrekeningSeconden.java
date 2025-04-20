package be.vdab.jpf5;

public class OmrekeningSeconden {

    public static void main(String[] args) {
        int seconden = 5924;
        int resultaatUren = seconden / 3600;
        int resultaatMinuten = (seconden % 3600) / 60;
        int resultaatSeconden = (seconden % 3600) % 60;

        System.out.println("U:" + resultaatUren + " M:" + resultaatMinuten + " S:" + resultaatSeconden);
    }
}
