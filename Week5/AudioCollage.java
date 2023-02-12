import edu.princeton.cs.algs4.StdAudio;

public class AudioCollage {

    public static double[] amplify(double[] a, double alfa) {
        double[] b = new double[a.length];
        for (int i = 0; i < b.length; i++) {
            b[i] = b[i] * alfa;

        }
        return b;

    }

    public static double[] reverse(double[] a) {
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[a.length - 1 - i] = a[i];
        }
        return b;
    }

    public static double[] mix(double[] a, double[] b) {
        int max = 0;
        if (a.length > b.length)
            max = a.length;
        else
            max = b.length;
        double[] c = new double[max];
        for (int i = 0; i < max; i++) {
            if (i < a.length && i < b.length)
                c[i] = a[i] + b[i];
            else if (i > a.length)
                c[i] = b[i];
            else if (i > b.length)
                c[i] = a[i];

        }
        return c;

    }

    public static double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        for (int j = 0; j < b.length; j++) {
            c[a.length + j] = b[j];

        }
        return c;
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        int size = (int) (a.length / alpha);
        double[] c = new double[size];
        for (int i = 0; i < size; i++) {
            c[i] = a[(int) (i * alpha)];
        }
        return c;
    }

    public static void main(String[] args) {

        double alpha = 0.5;
        double[] chimes = StdAudio.read("chimes.wav");
        double[] pianoSound = StdAudio.read("piano.wav");
        double[] singerSound = StdAudio.read("singer.wav");
        double[] cowSound = StdAudio.read("cow.wav");
        double[] buzzer = StdAudio.read("buzzer.wav");
        StdAudio.play(amplify(chimes, alpha));
        StdAudio.play(reverse(pianoSound));
        StdAudio.play(merge(singerSound, chimes));
        StdAudio.play(mix(cowSound, chimes));
        StdAudio.play(changeSpeed(buzzer, alpha));

    }

}
