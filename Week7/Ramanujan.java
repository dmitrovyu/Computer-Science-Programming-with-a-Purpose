
import edu.princeton.cs.algs4.StdOut;

public class Ramanujan {
    public static boolean isRamanujan(long n) {
        int count = 0;
        double b = 1.0;

        for (long i = 1; i < Math.cbrt(n); i++) {

            b = Math.cbrt(n - i*i*i);
            if (b % 1 == 0)
                count++;
            if (count > 1)
                break;

        }

        if (count > 1)
            return true;
        return false;

    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        StdOut.println(isRamanujan(n));
    }
}
