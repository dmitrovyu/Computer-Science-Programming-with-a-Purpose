/**************
* BandMatrix.java takes two integer command-line arguments n and width and prints
* an n-by-n pattern, with a zero (0) for each element whose distance from the main diagonal
* is strictly more than width, and an asterisk (*) for each entry that is not, and two spaces between each 0 or *.
* https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php
* @author Dejan Dmitrovic
****************/



public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        char symbol;
        String row = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i == j) || ((j <= i + width) && (j > i)) || ((j >= i - width) && (j < i)))
                    symbol = '*';
                else
                    symbol = '0';
                row = row + "  " + symbol;
            }
            System.out.println(row);
            row = "";
        }
    }
}
