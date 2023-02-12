import edu.princeton.cs.algs4.StdOut;

public class Convert {
    public static String convert (int n) {
        if (n == 1) return "1";
        return convert(n/2) + (n%2);
    }

    public static void main (String[] args){
        int x = Integer.parseInt(args[0]);
        StdOut.println(convert(x));
    }
}
