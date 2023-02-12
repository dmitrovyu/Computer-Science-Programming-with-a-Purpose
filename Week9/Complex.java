
import edu.princeton.cs.algs4.StdOut;

public class Complex {
    private final double re;
    private final double im;
    public Complex (double real, double imag) {
        re = real;
        im = imag;
    }
    public String toString() {
        return re + " + " + im + "i";
    }
    public Complex plus(Complex b) {
        double real = this.re + b.re;
        double imag = this.im + b.im;
        return new Complex(real, imag);
    }
    public Complex times (Complex b) {
        double real = this.re*b.re - this.im*b.im;
        double imag = this.im*b.re + this.re*b.im;
        return new Complex(real, imag);
    }
    public double abs(){
     return Math.sqrt(re*re+ im*im);
    }

    public static void main(String[] args) {
        Complex a = new Complex(3.0, 4.0);
        Complex b = new Complex(-2.0, 3.0);
        StdOut.println("a = " + a);
        StdOut.println("b = " + b);
        StdOut.println("a * b = " + a.times(b));


    }
}
