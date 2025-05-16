package be.vdab.jpf12;

public class Rekenaar {

    private String text;
    private int totaal;

    public Rekenaar(String input) {
        text = input;
        totaal = berekenen(input);
    }

    public String getText() {
        return text;
    }

    public void setText(String input) {
        text = input;
        totaal = berekenen(input);
    }

    public int getTotaal() {
        return totaal;
    }

    private int berekenen(String expressie) {
        var delen = expressie.split(" ");
//in geval van een lege expressie bevat de array delen slechts 1 element,
//nl. een lege string: ""
// eerste cijfer in totaal zetten om te sommeren
        if (!delen[0].equals(""))
            totaal=Integer.parseInt(delen[0]);
        else
            totaal=0;
        int i=1;
        while (i < delen.length) {
            var bewerkingsTeken = delen[i].charAt(0);
            i++;
            if (i < delen.length) {
                var getal = Integer.parseInt(delen[i]);
                voerUit(bewerkingsTeken, getal);
                i++;
            }
        }
        return totaal;
    }

    private void voerUit(char bewTeken, int getal) {
        switch (bewTeken) {
            case '+' -> totaal += getal;
            case '-' -> totaal -= getal;
            case '*' -> totaal *= getal;
            case '/' -> {
                if (getal != 0) {
                    totaal /= getal;
                }
            }
        }
    }

    @Override
    public String toString() {
        return text + "= " + totaal;
    }
}
