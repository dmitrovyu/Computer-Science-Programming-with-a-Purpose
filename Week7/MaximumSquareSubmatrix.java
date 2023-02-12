import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class MaximumSquareSubmatrix {

    private static int min(int a, int b, int c) {
        if (a < b && a < c)
            return a;
        else if (b < c || b < a)
            return b;
        else
            return c;
    }

    public static int size(int[][] a) {
        int max = 0;
        int size = a.length;
        int[][] dp = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = a[i][j];
                else if (a[i][j] == 0)
                    dp[i][j] = 0;
                else if (a[i][j] == 1)
                    dp[i][j] = 1 + min(dp[i][j - 1], dp[i - 1][j - 1], dp[i - 1][j]);
                if (dp[i][j] > max)
                    max = dp[i][j];
            }

        }

        return max;

    }

    public static void main(String[] args) {
        int n = StdIn.readInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = StdIn.readInt();

            }
        }
        StdOut.println(size(a));
    }
}
