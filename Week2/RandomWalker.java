/*********************************
* A Java programmer begins walking aimlessly. At each time step, 
* she takes one step in a random direction (either north, east, south, or west), 
* each with probability 25%. She stops once she is at Manhattan distance r from 
* the starting point. How many steps will the random walker take?
*
* @author Dejan Dmitrovic
* https://coursera.cs.princeton.edu/introcs/assignments/loops/specification.php
**********************************/

public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int i = 0, j = 0;
        int distance = 0;
        int steps = 0;
        double random = 0;
        System.out.println("(0, 0)");
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
            System.out.println("(" + i + ", " + j + ")");
            distance = Math.abs(i) + Math.abs(j);
            steps = steps + 1;
        }
        System.out.println("steps = " + steps);
    }
}
