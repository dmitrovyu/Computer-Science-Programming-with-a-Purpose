public class Birthday {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        boolean[] dates = new boolean[n];
        int[] times = new int[n + 2];
        int i = 0;
        int person = 0;
        for (int k = 1; k < trials; k++) {
            while (!dates[i]) {

                if (!dates[i]) {
                    dates[i] = true;
                }
                i = (int) (Math.random() * n);
                person++;

            }

            for (int j = 0; j < n; j++)
                dates[j] = false;
            i = 0;
            times[person]++;
            person = 0;
        }
        System.out.println("1" + "\t" + times[0] + "\t" + (double) times[0] / trials);
        double cumProb = 0;
        for (int m = 1; m < n; m++) {
            cumProb = cumProb + times[m];
            System.out.println((m + 1) + "\t" + times[m] + "\t" + cumProb / trials);
            if (cumProb / trials > 0.5)
                break;
        }
    }
}
