package be.vdab.jpf9;

public record Persoon(String voornaam, String achternaam) {
    public Persoon {
        if (voornaam.isBlank() || achternaam.isBlank()) {
            throw new IllegalArgumentException("Voor- en achternaam mogen niet leeg zijn");
        }
    }

    @Override
    public String toString() {
        return voornaam + " " + achternaam;
    }
}
