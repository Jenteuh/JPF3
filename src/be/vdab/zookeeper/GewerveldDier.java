package be.vdab.zookeeper;

import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;

import java.util.List;
import java.util.Objects;

public abstract sealed class GewerveldDier permits Reptiel, Amfibie, Vis, Vogel, Zoogdier{

    private String naam;
    private Huidbedekking huidbedekking;
    List<Milieu> milieu;

    public GewerveldDier(String naam, Huidbedekking huidbedekking, List<Milieu> milieu) {
        setNaam(naam);
        setHuidbedekking(huidbedekking);
        setMilieu(milieu);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam != null) {
            this.naam = naam;
        }
    }

    public Huidbedekking getHuidbedekking() {
        return huidbedekking;
    }

    public void setHuidbedekking(Huidbedekking huidbedekking) {
        this.huidbedekking = huidbedekking;
    }

    public List<Milieu> getMilieu() {
        return milieu;
    }

    public void setMilieu(List<Milieu> milieu) {
        if (!milieu.isEmpty()) {
            this.milieu = milieu;
        }
    }

    public static String verzorging(Huidbedekking huidbedekking) {
        return switch (huidbedekking) {
            case SCHUBBEN -> "Geen speciale verzorging nodig";
            case GLAD -> "Regelmatig laten afkoelen";
            case HAREN -> "Regelmatig wassen";
            case VEREN -> "Regelmatig wassen, gladstrijken en invetten";
            default -> "Geen geldig type huidbedekking";
        };
    }

    @Override
    public String toString() {
        return naam + ", " + huidbedekking + ", " + milieu + ", " + verzorging(huidbedekking);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        GewerveldDier that = (GewerveldDier) o;
        return Objects.equals(naam, that.naam) && huidbedekking == that.huidbedekking && Objects.equals(milieu, that.milieu);
    }

    @Override
    public int hashCode() {
        return naam.hashCode();
    }
}
