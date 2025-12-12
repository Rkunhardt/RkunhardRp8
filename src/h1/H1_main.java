package h1;

public class H1_main {
    public static void main(String[] args) {
        Bruch b1 = new Bruch(8, 12);
        b1.shorten();
        System.out.println(b1.zaehler + "/" + b1.nenner); // Sollte 2/3 sein

        Bruch b2 = new Bruch(5, 2);
        Bruch b3 = new Bruch(15, 9);
        System.out.println(b2.hasSameValueAs(b3)); // Sollte false sein (15/9 ist 5/3)
    }
}
