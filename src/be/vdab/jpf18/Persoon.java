package be.vdab.jpf18;

public class Persoon {
    private String voornaam;
    private String familienaam;
    private Geslacht geslacht;

    public Persoon (String voornaam, String familienaam, Geslacht geslacht) {
        this.voornaam = voornaam;
        this.familienaam = familienaam;
        this.geslacht = geslacht;
    }

    public String toString() {
        return voornaam + " " + familienaam + ", " + geslacht;
    }
}
