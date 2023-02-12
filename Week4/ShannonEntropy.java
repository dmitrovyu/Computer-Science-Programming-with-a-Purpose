import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class ShannonEntropy {
    public static void main (String[] args){
        int m = Integer.parseInt(args[0]);
        int[] freq = new int[m+1];
        int trials = 0;
        double entropy =0;
        while (!StdIn.isEmpty()) {
            int x =StdIn.readInt();
            while (x>m) {
                StdOut.println("Wrong number please enter again");
                x=StdIn.readInt();
            }
            freq[x]++;
            
        }
        for (int i=0; i<freq.length; i++){
            trials = trials + freq[i];
        }
        
        for (int j = 0; j<freq.length; j++ ){
            
            double p = 1.0 * freq[j] / trials;
            if (freq[j]>0)
            entropy -=p* Math.log(p) / Math.log(2);
        }
        
        StdOut.printf("%.4f\n",entropy);
    }
    
}
