import java.awt.Color;
import edu.princeton.cs.algs4.Picture;

public class BlackPicture {

    public static void main(String[] args) {
        
    Picture pic = new Picture(300,300);
    for (int i = 0; i<300; i++) {
        for (int j = 0; j <300; j++){
            
           if ( i%4 == 0) pic.set(i, j, Color.white);
                else pic.set(i, j, Color.black);
        }
    }
    pic.save("black.png");
    
    }

}