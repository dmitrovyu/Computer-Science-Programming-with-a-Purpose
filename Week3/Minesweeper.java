public class Minesweeper {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int k = Integer.parseInt(args[2]);
        boolean[][] mines = new boolean[m][n];
        int[][] table = new int[m][n];
        for (int i = 1; i < k + 1; i++) {
            int corX = (int) (Math.random() * m);
            int corY = (int) (Math.random() * n);
            if (!mines[corX][corY])
                mines[corX][corY] = true;
            else
                i = i - 1;

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mines[i][j]) {
                    if ((i - 1 >= 0) && (!mines[i - 1][j]))
                        table[i - 1][j]++;
                    if ((j - 1 >= 0) && (!mines[i][j - 1]))
                        table[i][j - 1]++;
                    if ((i + 1 < m) && (!mines[i + 1][j]))
                        table[i + 1][j]++;
                    if ((j + 1 < n) && (!mines[i][j + 1]))
                        table[i][j + 1]++;
                    if ((i - 1 >= 0) && (j - 1 >= 0) && (!mines[i - 1][j - 1]))
                        table[i - 1][j - 1]++;
                    if ((i + 1 < m) && (j + 1 < n) && (!mines[i + 1][j + 1]))
                        table[i + 1][j + 1]++;
                    if ((i - 1 >= 0) && (j + 1 < n) && (!mines[i - 1][j + 1]))
                        table[i - 1][j + 1]++;
                    if ((i + 1 < m) && (j - 1 >= 0) && (!mines[i + 1][j - 1]))
                        table[i + 1][j - 1]++;

                }

            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mines[i][j])
                    System.out.print("*  ");
                else
                    System.out.print(table[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
