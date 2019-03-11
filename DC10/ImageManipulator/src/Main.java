import java.awt.image.BufferedImage;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Input an Image Filepath ===");
        //User input filepath ‪D:/Bilder/Sample.png
        // D:/Dropbox/Image Macro/Reaction Moods/Transparent/Aonene.png
        BufferedImage img = new ImageManipulator().JavaImageIO(scan.nextLine());
        selectManipulation(img);
    }

    private static void selectManipulation(BufferedImage img){
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Pick a manipulation from the list ==");
        String[] manipulation = {"None", "Grayscale","Invert","Horizontal Flip","Vertical Flip","Color Remover"};
        for(int i = 0; i < manipulation.length; i++) {
            System.out.println("== Manipulation number - "+ (i+1) + " = " + manipulation[i]);
        }
        System.out.println("=== Type the NUMBER of your selection: ===");
        int userSelection = Integer.parseInt(scan.nextLine());
        BufferedImage changedImg = null;
        switch (userSelection){
            case 1:
                changedImg = new ImageManipulator().DoNothing(img);
                break;
            case 2:
                changedImg = new ImageManipulator().Grayscalify(img,img.getWidth(),img.getHeight());
                break;
            case 3:
                changedImg = new ImageManipulator().Inversion(img,img.getWidth(),img.getHeight());
                break;
            case 4:
                changedImg = new ImageManipulator().FlipHorizontal(img,img.getWidth(), img.getHeight());
                break;
            case 5:
                changedImg = new ImageManipulator().FlipVertical(img,img.getWidth(),img.getHeight());
                break;
            case 6:
                System.out.println("=== Lul I haven't implemented this yet ===");
            default:
                System.out.println(" =!= No valid selection made =!=");
        }
        System.out.println("=== Do you want to apply another manipulation to the image? (Y/N) ===");
        String newManipPrompt = scan.nextLine();
        if (newManipPrompt.toUpperCase().charAt(0) == 'Y'){
            selectManipulation(changedImg);
        } else {
            System.out.println("*=== Image manipulation complete ===*");
        }
    }
}
