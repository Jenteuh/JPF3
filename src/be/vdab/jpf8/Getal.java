package be.vdab.jpf8;

public class Getal {
    private int x;

    public Getal(int a) {
        setX(a);
    }

    public void print() {
        System.out.println(x);
    }

    public int absoluut() {
        return Math.abs(x);
    }

    public int som(int a) {
        return a + x;
    }

    public float som(float a) {
        return a + x;
    }

    public double som(double a) {
        return a + x;
    }

    public void add(int a) {
        x += a;
    }

    public double toDouble() {
        return (double) x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
