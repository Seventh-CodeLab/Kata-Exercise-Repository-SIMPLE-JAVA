import java.io.*;
import java.util.Vector;

public class ListOfNumbers {
    private Vector v;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        v = new Vector(SIZE);
        for (int i = 0; i < SIZE; i++) {
            v.addElement(i);
        }
    }

    public void writeList(){
        PrintWriter out = null;
        try {
            System.out.println("Entering try Statement");
            out = new PrintWriter(new FileWriter("Outputfile.txt"));
            for(int i = 0; i < (SIZE + 1); i++){
                System.out.println("Value at: " + i + " = " + v.elementAt(i));
            }
        } catch (IOException e ){
            System.err.println("Caught IOException: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Caught ArrayIndexOutofBoundsException: " + e.getMessage());
        } finally {
            if(out != null){
                out.close();
            }
        }
    }
}
