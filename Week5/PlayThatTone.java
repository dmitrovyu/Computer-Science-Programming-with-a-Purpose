
import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdIn;

public class PlayThatTone {
    public static void main (String[] args) {
        int SAMPLING_RATE = 44100;
        while (!StdIn.isEmpty()) {
            int pitch = StdIn.readInt();
            double duration = StdIn.readDouble();
            double hz = 440*Math.pow(2,pitch/12.0);
            int n = (int) (SAMPLING_RATE * duration);
            double[] a = new double[n+1];
            for (int i=0; i<=n; i++) 
                a[i] = Math.sin(2*Math.PI*i*hz/SAMPLING_RATE);
            StdAudio.play(a);
            
        }
        StdAudio.play("piano.wav");
    }
}
