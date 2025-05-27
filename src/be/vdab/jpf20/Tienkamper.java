package be.vdab.jpf20;

public class Tienkamper implements Comparable<Tienkamper>{

    private String naam = "";
    private int punten;

    public Tienkamper (String naam, int punten) {
        setNaam(naam);
        setPunten(punten);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam != null) {
            this.naam = naam;
        }
    }

    public int getPunten() {
        return punten;
    }

    public void setPunten(int punten) {
        if (punten >= 0) {
            this.punten = punten;
        }
    }

    @Override
    public String toString() {
        return naam + " - " + punten;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Tienkamper tk)) {
            return false;
        }
        return naam.equals(tk.naam);
    }

    @Override
    public int compareTo(Tienkamper o) {
        return naam.compareTo(o.naam);
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }
}
