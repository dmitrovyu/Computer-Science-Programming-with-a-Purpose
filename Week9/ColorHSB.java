import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ColorHSB {
    private final int hue;
    private final int sat;
    private final int brt;

    public ColorHSB(int h, int s, int b) {
        hue = h;
        sat = s;
        brt = b;
        if (hue < 0 || hue > 359)
            throw new IllegalArgumentException("The hue must be between 0 and 359");
        if (sat < 0 || sat > 100)
            throw new IllegalArgumentException("The saturation must be between 0 and 100");
        if (brt < 0 || brt > 100)
            throw new IllegalArgumentException("The brightness must be between  0 and 100");

    }

    public String toString() {
        return ("(" + hue + ", " + sat + ", " + brt + ")");
    }

    public boolean isGrayscale() {
        if (sat == 0 || brt == 0)
            return true;
        else
            return false;
    }

    public int distanceSquaredTo(ColorHSB that) {
        if (that == null)
            throw new IllegalArgumentException("You must enter color.");
        int distance;
        distance = (int) (Math.min(Math.pow((this.hue - that.hue), 2),
                Math.pow((360 - Math.abs(this.hue - that.hue)), 2))
                + Math.pow(this.sat - that.sat, 2) + Math.pow(this.brt - that.brt, 2));

        return distance;
    }

    public static void main(String[] args) {
        int h0 = Integer.parseInt(args[0]);
        int s0 = Integer.parseInt(args[1]);
        int b0 = Integer.parseInt(args[2]);
        int h1, b1, s1;
        ColorHSB inputColor = new ColorHSB(h0, s0, b0);

        String colorName = StdIn.readString();
        h1 = StdIn.readInt();
        s1 = StdIn.readInt();
        b1 = StdIn.readInt();
        ColorHSB distColor = new ColorHSB(h1, s1, b1);
        int dist = distColor.distanceSquaredTo(inputColor);

        while (!StdIn.isEmpty()) {
            String newcolorName = StdIn.readString();
            int h2 = StdIn.readInt();
            int s2 = StdIn.readInt();
            int b2 = StdIn.readInt();
            ColorHSB newColor = new ColorHSB(h2, s2, b2);
            int dist2 = newColor.distanceSquaredTo(inputColor);

            if (dist2 < dist) {
                colorName = newcolorName;
                distColor = newColor;
                dist = dist2;

            }

        }
        StdOut.print(colorName + " ");
        StdOut.print(distColor);

    }

}
