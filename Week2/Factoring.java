public interface Factoring {
    public static boolean FactorLong(Long t) {
        long start = System.currentTimeMillis();
        System.out.println(t);

        for (long factor = 2; factor < t / factor; factor++) {
            while (t % factor == 0) {
                t /= factor;
                System.out.print(factor + " ");
            }

        }
        if (t > 1)
            System.out.print(t);
        System.out.println();
        System.out.println("Time Elapsed: " + (System.currentTimeMillis() - start));
        if ((System.currentTimeMillis() - start) < 10000)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {

        long i = 2000000000000000L;
        boolean breakLoop = true;
        while (breakLoop) {
            breakLoop = FactorLong(i);
            i = i + 1;

        }

    }
}
