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
