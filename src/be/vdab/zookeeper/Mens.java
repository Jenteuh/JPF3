package be.vdab.zookeeper;

import be.vdab.zookeeper.exceptions.RijksregisternummerNietGeldigException;
import be.vdab.zookeeper.util.Huidbedekking;
import be.vdab.zookeeper.util.Milieu;
import be.vdab.zookeeper.util.RijksregisternummerValidator;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Objects;

public class Mens extends Zoogdier {

    private long rijksregisternummer;
    private LocalDate geboortedatum;

    public Mens(String naam, Huidbedekking huidbedekking, List<Milieu> milieu, long rijksregisternummer, LocalDate geboortedatum) {
        super(naam, huidbedekking, milieu);
        try {
            setRijksregisternummer(rijksregisternummer);
        } catch (RijksregisternummerNietGeldigException e) {
            System.out.println("Geen geldig rijksregisternummer");;
        }
        setGeboortedatum(geboortedatum);
    }

    public long getRijksregisternummer() {
        return rijksregisternummer;
    }

    public void setRijksregisternummer(long rijksregisternummer) throws RijksregisternummerNietGeldigException {
        if (RijksregisternummerValidator.isValid(String.valueOf(rijksregisternummer)))
            this.rijksregisternummer = rijksregisternummer;
        else throw new RijksregisternummerNietGeldigException();
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {;
        this.geboortedatum = geboortedatum;
    }

    public long getLeeftijd(LocalDate geboortedatum) {
        return ChronoUnit.YEARS.between(geboortedatum, LocalDate.now());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mens mens = (Mens) o;
        return rijksregisternummer == mens.rijksregisternummer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rijksregisternummer);
    }

    @Override
    public String toString() {
        return getNaam() + ", " + getHuidbedekking() + ", " + milieu + ", " + verzorging(getHuidbedekking()) + ", " + getLeeftijd(geboortedatum) + " jaar oud";
    }
}
