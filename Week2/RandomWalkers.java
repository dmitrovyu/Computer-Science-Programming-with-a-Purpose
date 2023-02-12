/*******************************
* RandomWalkers.java that takes two integer command-line arguments r and trials. 
* In each of trials independent experiments, 
* simulate a random walk until the random walker is at Manhattan distance r 
* from the starting point. Print the average number of steps.
* @author Dejan Dmitrovic
* https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php
********************************/



public class RandomWalkers {

    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int i, j, distance, steps;
        double random;
        double average = 0;
        for (int k = 1; k <= trials; k++) {
            i = 0;
            j = 0;
            distance = 0;
            steps = 0;
            while (distance < r) {
                random = Math.random();
                if (random < 0.25) {
                    i++;
                } else if (random < 0.5) {
                    i--;
                } else if (random < 0.75) {
                    j++;

                } else {

                    j--;
                }

                distance = Math.abs(i) + Math.abs(j);
                steps = steps + 1;
            }

            average += steps;
        }

        System.out.println("average number of steps = " + average / trials);

    }
}
