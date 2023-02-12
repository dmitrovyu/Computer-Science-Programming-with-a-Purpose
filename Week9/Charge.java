import edu.princeton.cs.algs4.StdOut;

public class Charge {
    private final double rx,ry;
    private final double q;

    public Charge (double x0, double y0, double q0){
        rx = x0;
        ry = y0;
        q = q0;
    }
    public double potentialAt (double x, double y) {
        double k = 8.99e09;
        double dx = rx - x;
        double dy = ry - y;
        return k*q/Math.sqrt(dx*dx +dy*dy);
    }
    public String toString(){
        return q + " at " + "(" + rx + ", " + ry + ")";
    }
    public static void main (String[] aStrings) {
        Charge c = new Charge(.72, .31, 20.1);
        StdOut.println(c);
        StdOut.printf("%6.2e\n", c.potentialAt(.42, .71));
    }
}
