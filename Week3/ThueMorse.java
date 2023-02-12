public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[] thueMorse;
        int steps = 0;
        while (Math.pow(2, steps) < n * n) {
            steps++;
        }
        if (steps < 2)
            steps = 2;
        thueMorse = new boolean[(int) Math.pow(2, steps)];
        thueMorse[0] = false;
        for (int i = 0; i < steps; i++) {
            for (int j = 0; j < ((int) Math.pow(2, i)); j++) {
                thueMorse[((int) Math.pow(2, i)) + j] = !thueMorse[j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thueMorse[i] == thueMorse[j])
                    System.out.print("+");
                else
                    System.out.print("-");
                if (j < n - 1)
                    System.out.print("  ");

            }
            System.out.println();
        }
    }

}
