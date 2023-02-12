import edu.princeton.cs.algs4.StdOut;

public class Divisors {
    public static int gcd(int a, int b) {

        if (a == 0 && b == 0)
            return 0;
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        if (a == 0 && b == 0)
            return 0;
        else
            return Math.abs(a) * (Math.abs(b) / gcd(a, b));
    }

    public static boolean areRelativelyPrime(int a, int b) {
        if (gcd(a, b) == 1)
            return true;
        else
            return false;

    }

    public static int totient(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (gcd(n, i) == 1)
                counter++;
        }
        return counter;

    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        StdOut.println("gcd(" + a + "," + b + ") =" + gcd(a, b));
        StdOut.println("lcm(" + a + "," + b + ") =" + lcm(a, b));
        StdOut.println("areRelativelyPrime(" + a + "," + b + ") =" + areRelativelyPrime(a, b));
        StdOut.println("totient(" + a + ") =" + totient(a));
        StdOut.println("totient(" + b + ") =" + totient(b));

    }

}
