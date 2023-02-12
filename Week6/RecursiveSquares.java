import edu.princeton.cs.algs4.StdDraw;

public class RecursiveSquares {

    public static void drawSquare(double x, double y, double length) {
        StdDraw.setPenColor(StdDraw.LIGHT_GRAY);
        StdDraw.filledSquare(x, y, length / 4);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.square(x, y, length / 4);

    }

    public static void draw(int n, double x, double y, double length) {

        if (n == 0)
            return;

        draw(n - 1, x - length / 4, y + length / 4, length / 2);
        draw(n - 1, x + length / 4, y + length / 4, length / 2);
        drawSquare(x, y, length);
        draw(n - 1, x - length / 4, y - length / 4, length / 2);
        draw(n - 1, x + length / 4, y - length / 4, length / 2);

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        draw(n, .5, .5, 1);

    }
}
