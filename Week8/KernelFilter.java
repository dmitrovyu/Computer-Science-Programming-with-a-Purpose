import edu.princeton.cs.algs4.Picture;
import edu.princeton.cs.algs4.StdOut;

import java.awt.Color;

public class KernelFilter {

    private static Picture kernel(Picture picture, double[][] weights) {
        Picture pic = new Picture(picture.width(), picture.height());
        int transSize = weights.length;
        int halfsize = weights.length / 2;

        for (int width = 0; width < picture.width(); width++) {
            for (int height = 0; height < picture.height(); height++) {
                Color pixel = picture.get(width, height);
                double r = 0;
                double g = 0;
                double b = 0;
                for (int i = 0; i < transSize; i++) {
                    for (int j = 0; j < transSize; j++) {
                        int coordX = width - halfsize + i;
                        int coordY = height - halfsize + j;
                        if (coordX < 0)
                            coordX += picture.width();
                        if (coordY < 0)
                            coordY += picture.height();
                        if (coordX > picture.width() - 1)
                            coordX -= picture.width();
                        if (coordY > picture.height() - 1)
                            coordY -= picture.height();
                        pixel = picture.get(coordX, coordY);

                        r += pixel.getRed() * weights[i][j];
                        g += pixel.getGreen() * weights[i][j];
                        b += pixel.getBlue() * weights[i][j];

                    }
                }
                int rNew = (int) Math.round(r);
                int gNew = (int) Math.round(g);
                int bNew = (int) Math.round(b);
                if (rNew < 0)
                    rNew = 0;
                if (gNew < 0)
                    gNew = 0;
                if (bNew < 0)
                    bNew = 0;
                if (rNew > 255)
                    rNew = 255;
                if (gNew > 255)
                    gNew = 255;
                if (bNew > 255)
                    bNew = 255;

                Color result = new Color(rNew, gNew, bNew);
                pic.set(width, height, result);

            }
        }

        return pic;
    }

    // Returns a new picture that applies the identity filter to the given picture.
    public static Picture identity(Picture picture) {
        double[][] identity = { { 0, 0, 0 }, { 0, 1, 0 }, { 0, 0, 0 } };
        //Picture pic2 = picture;
        Picture pic = new Picture(kernel(picture, identity));

        /*
         * for (int i = 0; i < pic.height() ; i++) {
         * for (int j = 0; j < pic.height() ; j++){
         * if (pic2.getRGB(j, i) != pic.getRGB(j, i))
         * StdOut.println(pic.get(i,j) + " : " + pic2.get(i,j));
         * }
         * }
         */

        return pic;

    }

    // Returns a new picture that applies a Gaussian blur filter to the given
    // picture.
    public static Picture gaussian(Picture picture) {
        double[][] gaussianBlur = { { 0.0625, 0.125, 0.0625 }, { 0.125, 0.25, 0.125 }, { 0.0625, 0.125, 0.0625 } };
        Picture pic = new Picture(kernel(picture, gaussianBlur));
        return pic;
    }

    // Returns a new picture that applies a sharpen filter to the given picture
    public static Picture sharpen(Picture picture) {
        double[][] sharpen = { { 0, -1, 0 }, { -1, 5, -1 }, { 0, -1, 0 } };
        Picture pic = new Picture(kernel(picture, sharpen));
        return pic;
    }

    // Returns a new picture that applies an Laplacian filter to the given picture.
    public static Picture laplacian(Picture picture) {
        double[][] laplacian = { { -1, -1, -1 }, { -1, 8, -1 }, { -1, -1, -1 } };
        Picture pic = new Picture(kernel(picture, laplacian));
        return pic;

    }

    // Returns a new picture that applies an emboss filter to the given picture.
    public static Picture emboss(Picture picture) {
        double[][] emboss = { { -2, -1, 0 },
                { -1, 1, 1 },
                { 0, 1, 2 } };
        Picture pic = new Picture(kernel(picture, emboss));
        return pic;

    }

    // Returns a new picture that applies a motion blur filter to the given picture.
    public static Picture motionBlur(Picture picture) {
        double[][] motionBlur = { { (double) 1 / 9, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, (double) 1 / 9, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 0, (double) 1 / 9, 0, 0, 0, 0, 0, 0 },
                { 0, 0, 0, (double) 1 / 9, 0, 0, 0, 0, 0 },
                { 0, 0, 0, 0, (double) 1 / 9, 0, 0, 0, 0 },
                { 0, 0, 0, 0, 0, (double) 1 / 9, 0, 0, 0 },
                { 0, 0, 0, 0, 0, 0, (double) 1 / 9, 0, 0 },
                { 0, 0, 0, 0, 0, 0, 0, (double) 1 / 9, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, (double) 1 / 9 }
        };

        Picture pic = new Picture(kernel(picture, motionBlur));
        return pic;
    }

    public static void main(String[] args) {
        Picture original = new Picture(args[0]);

        Picture pic = identity(original);
        pic.show();

        pic = gaussian(original);
        pic.show();

        pic = sharpen(original);
        pic.show();

        pic = laplacian(original);
        pic.show();

        pic = emboss(original);
        pic.show();

        pic = motionBlur(original);
        pic.show();

    }
}
