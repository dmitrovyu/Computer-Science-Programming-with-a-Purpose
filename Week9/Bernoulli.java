import edu.princeton.cs.algs4.StdRandom;

public class Bernoulli {
    public static int binomial(int n)
    {  // Simulate flipping a coin n times; return # heads.
       int heads = 0;
       for (int i = 0; i < n; i++)
          if (StdRandom.bernoulli(0.5)) heads++;
       return heads;
    }
}
