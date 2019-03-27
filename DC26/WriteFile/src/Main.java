import java.io.*;

public class Main {
    public static void main(String[] args) {
        //Task A: Append text to end of file
        writeFile("test.txt");

        //Task B: Read select text at start of file
        readLines("testTwo.txt", 5);

        //Task C: Rewrite the first set of lines of file
        replaceLines("testThree.txt", 3);
    }

    public static void writeFile(String filePath){
        try {
            FileWriter writer = new FileWriter(filePath,true);
            writer.write("\nAppend this text to the end of the file.");
            writer.close();
        } catch (IOException e){
            System.out.println("File not found");
        }
    }

    public static void readLines(String filePath, int n){
        try {
            FileReader reader = new FileReader(filePath);
            LineNumberReader lnRead = new LineNumberReader(reader);

            for (int i = 0; i < n; i++) {
                lnRead.setLineNumber(i);
                System.out.println(lnRead.readLine()); //Reads the first couple lines exclusive n
            }
        } catch (IOException e){
            System.out.println(e);
        }
    }

    public static void replaceLines(String filePath, int n){
        try {
            //First read and create a temporary copy of the file
            FileReader reader = new FileReader(filePath);
            LineNumberReader lnRead = new LineNumberReader(reader);

            File temp = new File("temp.txt");
            FileWriter tempWrite = new FileWriter(temp,true);

            String line = lnRead.readLine();
            while (line != null){
                tempWrite.write(line + "\n");
                line = lnRead.readLine();
            }
            //Close unnecessary readers and writers
            tempWrite.close();
            reader.close();
            lnRead.close();

            //This section clears the original file of it's contents
            PrintWriter clearFile = new PrintWriter(filePath);
            clearFile.print("");
            clearFile.close();


            FileWriter originWrite = new FileWriter(filePath,true);

            //Replaces the first lines with whatever is inside of the write
            for (int i = 0; i < n; i++){
                originWrite.write("This is a replacement line\n");
                //Replacement string ^
            }

            //Re-applies every line after the replacement point (n)
            FileReader tempReader = new FileReader("temp.txt");
            LineNumberReader templnRead = new LineNumberReader(tempReader);
            String tempLine = templnRead.readLine();
            while (tempLine != null){
                if(templnRead.getLineNumber() <= n){
                    System.out.println("Line replaced");
                    tempLine = templnRead.readLine();
                } else {
                    originWrite.write(tempLine + "\n");
                    tempLine = templnRead.readLine();
                }
            }

            //Close everything to make sure it writes.
            originWrite.close();
            tempReader.close();
            templnRead.close();

            //Lastly, delete the temporary file (Prints true if deletion was successful)
            System.out.println(temp.delete());

        } catch (IOException e){
            System.out.println(e);
        }
    }
}
