/**************************
* Takes four arguments on input for CMYK color, calculates and prints the same color as RGB.
*
* @author Dejan Dmitrovic
***************************/


public class CMYKtoRGB {
    public static void main(String[] arg) {
        double cyan = Double.parseDouble(arg[0]);
        double magenta = Double.parseDouble(arg[1]);
        double yellow = Double.parseDouble(arg[2]);
        double black = Double.parseDouble(arg[3]);
        double white =  (1 - black);
        double red =  (255 * white * (1 - cyan));
        double green =  (255 * white * (1 - magenta));
        double blue =  (255 * white * (1 - yellow));
        System.out.println("red = " + Math.round(red));
        System.out.println("green = " + Math.round(green));
        System.out.println("blue = " + Math.round(blue));

    }

}
