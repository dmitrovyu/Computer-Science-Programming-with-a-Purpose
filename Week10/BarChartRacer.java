import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdAudio;
import edu.princeton.cs.algs4.StdDraw;

public class BarChartRacer {
 
    public static void main(String[] args) {
        //StdAudio.playInBackground("under.mid");

        String fileName = args[0];
        int m = Integer.parseInt(args[1]);
        In in = new In(fileName);

        StdDraw.setCanvasSize(1000,700);
        StdDraw.enableDoubleBuffering();

        String nameTitle = in.readLine();
        String labelX = in.readLine();
        String sourceData = in.readLine();

        BarChart chart = new BarChart(nameTitle,labelX,sourceData);

        while (in.hasNextLine()) {
            in.readLine();
            int noOfRec = Integer.parseInt(in.readLine());

            Bar[] bars = new Bar[noOfRec];

            for (int i=0; i<noOfRec; i++ ) {
                String rec = in.readLine();
                String[] recArray = rec.split(",");

                String caption = recArray[0];
                chart.setCaption(caption);

                String name = recArray[1];
                int value = Integer.parseInt(recArray[3]);
                String cat = recArray[4];

                bars[i] = new Bar(name,value,cat);
            }
            Arrays.sort(bars);

            for (int i =noOfRec-1; i>noOfRec-m-1; i-- ) {
                chart.add(bars[i].getName(), bars[i].getValue(), bars[i].getCategory());

            }
            StdDraw.clear();
            chart.draw();
            StdDraw.show();
            StdDraw.pause(50);
            chart.reset();
        }
        chart.reset();
        
    }
    
}
