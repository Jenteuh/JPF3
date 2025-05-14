package be.vdab.jpf10;

public class Spaarrekening extends Rekening {

    private static double intrest;
    public Spaarrekening(String rekeningNummer, double intrest) {
        this(rekeningNummer, intrest, 0.0);
    }
    public Spaarrekening(String rekeningNummer, double intrest, double
            saldo) {
        super(rekeningNummer, saldo);
        setIntrest(intrest);
    }
    public final void setIntrest(double intrest) {
        if (intrest > 0.0) {
            Spaarrekening.intrest = intrest;
        }
    }
    public static double getIntrest(){
        return intrest;
    }

    @Override
    public void afhalen(double bedrag) {
        if (bedrag > 0.0) {
            var testSaldo = getSaldo()- bedrag;
            if (testSaldo >= 0) {
                super.afhalen(bedrag);
            }
        }
    }

    @Override
    public double berekenIntrest() {
        return getSaldo() * intrest / 100;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + intrest;
    }
}
