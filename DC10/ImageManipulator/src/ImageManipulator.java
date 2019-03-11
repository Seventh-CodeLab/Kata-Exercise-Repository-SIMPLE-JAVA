import java.awt.image.BufferedImage;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageManipulator {
    public BufferedImage JavaImageIO(String filePath){

        BufferedImage image = null;
        File file = null;

        try {
            file = new File(filePath);
            image = ImageIO.read(file);
        } catch (IOException e){
            System.out.println(e);
        }

        return image;
    }

    //Do nothing to the image
    public BufferedImage DoNothing (BufferedImage img){
        return printImage(img);
    }

    //Convert to a Grayscale image
    public BufferedImage Grayscalify(BufferedImage img, int width, int height){
        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                int px = img.getRGB(x,y);
                int r = (px>>16)&0xff; //Default Red
                int g = (px>>8)&0xff; //Default Green
                int b = px&0xff; //Default Blue
                int a = (px>>24)&0xff; //Default Alpha

                int avgRGB = (r+g+b)/3;
                px = (a<<24)|(avgRGB<<16)|(avgRGB<<8)|(avgRGB);

                img.setRGB(x, y, px);
            }
        }
        System.out.println("=== Image has been converted to Grayscale ===");
        return printImage(img);
    }

    public BufferedImage Inversion(BufferedImage img, int width, int height){
        for (int y = 0; y < height; y++){
            for (int x = 0; x < width; x++){
                int px = img.getRGB(x,y);
                int r = (px>>16)&0xff; //Default Red
                int g = (px>>8)&0xff; //Default Green
                int b = px&0xff; //Default Blue
                int a = (px>>24)&0xff; //Default Alpha

                int invR = 255 - r;
                int invG = 255 - g;
                int invB = 255 - b;

                px = (a<<24)|(invR<<16)|(invG<<8)|(invB);

                img.setRGB(x, y, px);
            }
        }
        System.out.println("=== Image colors have been Inverted ===");
        return printImage(img);
    }

    public BufferedImage FlipHorizontal(BufferedImage img, int width, int height){
        for (int y = 0; y < height; y++){
            for (int x = 0; x < (width/2); x++){
                int px = img.getRGB(x,y);
                int flipPx = img.getRGB((width-1) - x, y);
                //No color changing
                img.setRGB((x),(y),flipPx);
                img.setRGB(((width-1) - x),(y),px);
            }
        }
        System.out.println("=== Image has been flipped horizontally ===");
        return printImage(img);
    }

    public BufferedImage FlipVertical(BufferedImage img, int width, int height){
        for (int y = 0; y < (height/2); y++){
            for (int x = 0; x < width; x++){
                int px = img.getRGB(x,y);
                int flipPx = img.getRGB(x, (height-1) - y);
                //No color changing
                img.setRGB((x),(y),flipPx);
                img.setRGB((x),((height-1) - y),px);
            }
        }
        System.out.println("=== Image has been flipped vertically ===");
        return printImage(img);
    }

    public BufferedImage ColorFilter (BufferedImage img, int width, int height){
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int px = img.getRGB(x,y);

                int r = (px>>16)&0xff; //Default Red
                int g = (px>>8)&0xff; //Default Green
                int b = px&0xff; //Default Blue
                int a = (px>>24)&0xff; //Default Alpha

                px = (a << 24) | (r << 16) | (g << 8) | (b);
                img.setRGB(x, y, px);

                //TO BE DONE

            }
        }
        System.out.println("=== Greenscreen applied to the image ===");
        return printImage(img);
    }

    private BufferedImage printImage(BufferedImage img){
        File file = null;
        BufferedImage changedImage = null;
        try{
            file = new File("OutputFile.png");
            ImageIO.write(img,"png", file);
            System.out.println("=== New version of image output to: OutputFile.png ===");
            changedImage = ImageIO.read(file);
        }catch (IOException e){
            System.out.println(e);
        }
        return changedImage;
    }

}
