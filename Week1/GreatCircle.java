/************
 *  Given the latitude and longitude (in degrees) of two points compute
 *  the great circle distance in km between them. The
 *  following formula assumes that sin, cos, and arcos are comptued
 *  in degrees, so need to convert back and forth between radians.
 * @author Dejan Dmitrovic
*************/
public class GreatCircle {
    
    public static void main(String[] arg) {
        double x1 = Math.toRadians(Double.parseDouble(arg[0]));
        double y1 = Math.toRadians(Double.parseDouble(arg[1]));
        double x2 = Math.toRadians(Double.parseDouble(arg[2]));
        double y2 = Math.toRadians(Double.parseDouble(arg[3]));
        final double r = 6371.0;
        double distance;
        double first = Math.pow(Math.sin((x2 - x1) / 2), 2);
        double second = Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2 - y1) / 2), 2);
        distance = 2 * r * Math.asin(Math.sqrt(first + second));

        System.out.println(distance + " kilometers");

    }

}
