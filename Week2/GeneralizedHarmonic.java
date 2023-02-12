/***********************
* Takes two integer command-line arguments n and r and uses
* a for loop to compute the nth generalized harmonic number of order r
* @author Dejan Dmitrovic
* https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php
************************/

public class GeneralizedHarmonic {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        double result = 0;
        for (int i = 1; i < n + 1; i++) {
            result = result + 1 / Math.pow(i, r);
        }
        System.out.println(result);
    }
}
