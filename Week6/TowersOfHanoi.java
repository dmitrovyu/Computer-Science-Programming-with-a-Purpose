import edu.princeton.cs.algs4.StdOut;

public class TowersOfHanoi {
    public static void moves (int n, boolean left) {
        if (n == 0) return;
 //       StdOut.println("step" + 1 + " " + n);
        moves (n-1, !left);
 //       StdOut.println("step" + 2 + " " + n);
        if (left) StdOut.println(n + "left");
            else StdOut.println(n+ "right");
 //       StdOut.println("step" + 3 + " " + n);
        moves (n-1, !left);
 //       StdOut.println("step" + 4 + " " + n);
    }
    public static void main (String[] args) {
        int x = Integer.parseInt(args[0]);
        moves (x, true);
    }
}
