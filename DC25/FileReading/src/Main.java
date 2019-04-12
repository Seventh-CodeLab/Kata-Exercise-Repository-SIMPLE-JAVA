import java.io.*;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        testFile("mediumfile.txt");
        testFile("smallfile.txt");
    }

    // Test both methods
    public static void testFile(String filepath){
        File file = new File(filepath);
        System.out.println("========: "  + file.getPath() + " :=========");
        if(file.exists()){
            System.out.println("= The file is: " + fileSize(file));
        } else {
            System.out.println("!ERROR File doesn't exist");
        }
        fileLines(filepath);
        System.out.println(); //Console spacing
    }

    // Size Checker
    public static String fileSize(File f){
        //Get filesize in bytes
        long l = f.length();
        if (l > 1024){
            if (l > Math.pow(1024,2)){
                if (l > Math.pow(1024,3)){
                    if (l > Math.pow(1024,4)){
                        if(l > Math.pow(1024,5)){
                            if ( l > Math.pow(1024,6)){
                                    //If you have a file this big, who are you. Nobody in the world can store it
                                return l /Math.pow(1024,6) + "EB"; //Exabyte
                            } else { return  l/Math.pow(1024,5) + "PB"; } //Petabyte
                        } else { return l/Math.pow(1024,4) + "TB"; } //Terabyte
                    } else { return  l/Math.pow(1024,3) + "GB"; } //Gigabyte
                } else { return  l/Math.pow(1024,2) + "MB"; } //Megabyte
            } else { return l/1024 + "KB"; } //Kilobyte
        } else { return l + "B"; } //Byte
    }

    // Line counter
    public static void fileLines(String filepath){
        BufferedReader reader;
        String line;        // Contains the temporary line to count
        int linenr = 1;     // Tells which line is being read now
        int charCount;  // Counts the characters in the line
        int charTotal = 0;  // Contains a total of all the characters in the document
        try{
            reader = new BufferedReader( new FileReader(filepath));
            while ((line = reader.readLine()) != null){
                // For loop counts the characters in a line. Including spaces.
                charCount = line.length();

                //Prints out character counts.
                if (charCount > 0) {
                    System.out.println(" == Line " + linenr + ": " + charCount + " characters.");
                } else {
                    System.out.println(" == Line " + linenr + ": Empty");
                }

                charTotal += charCount;  //Add the count to the total
                linenr++;
            }
            //Print out total characters in file.
            System.out.println(" ==== Total: " + charTotal + " characters ====");
            reader.close();
        } catch (FileNotFoundException e){
            System.err.println("!ERROR File not found");
        } catch (IOException e){
            System.err.println("!ERROR Unable to read file");
        }

    }
}
