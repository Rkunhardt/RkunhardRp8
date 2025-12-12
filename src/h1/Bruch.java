package h1;

public class Bruch {
    public int zaehler;
    public int nenner;

    public Bruch(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    private int ggT(int x, int y) {
        int a = Math.abs(x);
        int b = Math.abs(y);
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public void shorten() {
        int teiler = ggT(this.zaehler, this.nenner);
        this.zaehler = this.zaehler / teiler;
        this.nenner = this.nenner / teiler;
    }

    public boolean hasSameValueAs(Bruch b) {
        return this.zaehler * b.nenner == b.zaehler * this.nenner;
    }
}