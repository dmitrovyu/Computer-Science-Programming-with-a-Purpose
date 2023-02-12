public class DiscreteDistribution {
    public static void main(String[] args) {

        int m = Integer.parseInt(args[0]);

        int[] sequence = new int[args.length];
        int[] cumSums = new int[args.length + 1];

        for (int i = 1; i < args.length; i++) {
            sequence[i] = Integer.parseInt(args[i]);
        }

        cumSums[0] = 0;

        for (int j = 1; j < cumSums.length; j++) {
            cumSums[j] = cumSums[j - 1] + sequence[j - 1];
        }

        for (int t = 0; t < m; t++) {
            int r = (int) (Math.random() * (cumSums[cumSums.length - 1]));

            for (int i = 0; i < cumSums.length; i++) {
                if (r >= cumSums[i] && r < cumSums[i + 1]) {
                    System.out.print((i) + " ");
                }

            }

        }

    }
}