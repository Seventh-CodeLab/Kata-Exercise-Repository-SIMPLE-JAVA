import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.imgproc.Imgproc;

import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;

public class Mat2Image {
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME); //check if we have the correct opencv library
    }

    //Variables
    Mat mat = new Mat(); //mat object to be able to do easy things with our frames, it represents an n-dimensional dense numerical single-channel or multi-channel array
    BufferedImage img; //The frame we manipulate

    //default constructor
    public Mat2Image() {
    }

    //constructor
    public Mat2Image(Mat mat) {
        getSpace(mat);
    }

    //get color space of image, for conversion to mat
    public void getSpace(Mat mat) {
        int type = 0;
        if (mat.channels() == 1) {
            type = BufferedImage.TYPE_BYTE_GRAY;
        } else if (mat.channels() == 3) {
            type = BufferedImage.TYPE_3BYTE_BGR;
        }
        this.mat = mat;
        int w = mat.cols();
        int h = mat.rows();
        if (img == null || img.getWidth() != w || img.getHeight() != h || img.getType() != type)
            img = new BufferedImage(w, h, type);
    }

    BufferedImage getImage(Mat mat){

        //A set of different image manipulations

        //Reverses Red and Blue color values
        Imgproc.cvtColor(mat,mat,Imgproc.COLOR_RGB2BGR);

        //Hue Saturation Lighting to Blue Green Red values
        Imgproc.cvtColor(mat,mat,Imgproc.COLOR_HLS2BGR);

        //Re-reverses Blue and Red color values
        Imgproc.cvtColor(mat,mat,Imgproc.COLOR_BGR2RGB);

        //Sets colors to grayscale
        Imgproc.cvtColor(mat,mat,Imgproc.COLOR_RGB2GRAY);


        getSpace(mat);
        WritableRaster raster = img.getRaster();
        DataBufferByte dataBuffer = (DataBufferByte) raster.getDataBuffer();
        byte[] data = dataBuffer.getData();
        mat.get(0, 0, data);
        return img;
    }
}