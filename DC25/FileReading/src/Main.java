import java.io.*;

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
                                //If you have a file this big, why are you using this.
                                return l + "EB"; //Exabyte
                            } else { return  l + "PB"; } //Petabyte
                        } else { return l + "TB"; } //Terabyte
                    } else { return  l + "GB"; } //Gigabyte
                } else { return  l + "MB"; } //Megabyte
            } else { return l + "KB"; } //Kilobyte
        } else { return l + "B"; } //Byte
    }

    // Line counter
    public static void fileLines(String filepath){
        BufferedReader reader;
        String line;        // Contains the temporary line to count
        int linenr = 1;     // Tells which line is being read now
        int charCount = 0;  // Counts the characters in the line
        int charTotal = 0;  // Contains a total of all the characters in the document
        try{
            reader = new BufferedReader( new FileReader(filepath));
            while ((line = reader.readLine()) != null){
                // For loop counts the characters in a line. Including spaces.
                for(int i = 0; i < line.length(); i++){
                    charCount++;
                }

                //Prints out character counts.
                if (charCount > 0) {
                    System.out.println(" == Line " + linenr + ": " + charCount + " characters.");
                } else {
                    System.out.println(" == Line " + linenr + ": Empty");
                }

                charTotal += charCount;  //Add the count to the total

                charCount = 0; //Reset the char counter for the next line
                linenr++;
            }
            //Print out total characters in file.
            System.out.println("  === Total: " + charTotal + " characters -");

        } catch (FileNotFoundException e){
            System.err.println("!ERROR File not found");
        } catch (IOException e){
            System.err.println("!ERROR Unable to read file");
        }
    }
}
