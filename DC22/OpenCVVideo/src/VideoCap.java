import org.opencv.core.Core;
import org.opencv.videoio.VideoCapture;

import java.awt.image.BufferedImage;

//Class to capture the video frames
public class VideoCap {

    //check for opencv libaray
    static{
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
    }

    VideoCapture cap;
    Mat2Image mat2Img = new Mat2Image();

    //create the video capturer
    VideoCap(){
        cap = new VideoCapture();
        cap.open(0);
    }

    //grap the frame
    BufferedImage getOneFrame() {
        cap.read(mat2Img.mat);
        return mat2Img.getImage(mat2Img.mat);
    }
}