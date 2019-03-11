import java.io.*;

public class CountExtension {
    public static void main(String[] args) {
        BufferedReader reader;

        int jpegN = 0;
        int pngN = 0;
        int gifN = 0;

        try {
            reader = new BufferedReader(new FileReader("images.txt"));
            String ln = reader.readLine();

            while (ln != null){
                System.out.println(ln);
                if (ln.length() > 0) {
                    switch (ln.substring(ln.length() - 4).toLowerCase()) {
                        case ".png":
                            pngN++;
                            break;
                        case "jpeg":
                            jpegN++;
                            break;
                        case ".gif":
                            gifN++;
                            break;
                        default:
                    }
                }
                ln = reader.readLine();
            }
            reader.close();
        } catch (IOException e){
            e.printStackTrace();
        }

        System.out.println("jpeg: " + jpegN + "\npng: " + pngN + "\ngif: " + gifN);
    }
}