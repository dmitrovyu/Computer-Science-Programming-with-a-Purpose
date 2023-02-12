import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdIn;

public class WorldMap {
    public static void main (String[] args){
        int x0 = StdIn.readInt();
        int y0 = StdIn.readInt();
        StdDraw.setCanvasSize(x0,y0);
        StdDraw.setXscale(0, x0);
        StdDraw.setYscale(0, y0);

        while(!StdIn.isEmpty()) {
            String name = StdIn.readString();
            int noOfVertices = StdIn.readInt();
            double[] x1 = new double[noOfVertices];
            double[] y1 = new double[noOfVertices];
            for (int i = 0; i < noOfVertices; i++){
                x1[i] = StdIn.readDouble();
                y1[i] = StdIn.readDouble();
                
            }
            StdDraw.polygon(x1, y1);
           
        }

    }
}

