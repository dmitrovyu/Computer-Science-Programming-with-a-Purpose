
import edu.princeton.cs.algs4.StdOut;

public class TrinomialDP {

    public static long trinomial(int n, int k) {
        long[][] results;
        if (n == 0 && k == 0)
            return 1;
        else if (k < -n || k > n)
            return 0;
        results = new long[n + 1][n + 1];
        results[0][0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0)
                    results[i][j] = results[i - 1][j] + 2 * results[i - 1][j + 1];
                else if (j == i)
                    results[i][j] = results[i - 1][j - 1];
                else
                    results[i][j] = results[i - 1][j - 1] + results[i - 1][j] + results[i - 1][j + 1];
            }
        }
        if (k < 0)
            return results[n][Math.abs(k)];
        else
            return results[n][k];

    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        StdOut.println(trinomial(n, k));

    }
}
