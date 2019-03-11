import java.util.Scanner;

public class PigEars {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(pigEar(0));
        System.out.println(pigEar(2));
        System.out.println(pigEar(5));
        System.out.println("How many pigs do you have?");
        System.out.println("These pigs have " + pigEar(scan.nextInt()) + " ears in total."); // User input
    }

    //Recursion practice
    public static int pigEar(int pigsToCount){
        int earsOnAPig = 2;
        if (pigsToCount == 0){
            return 0;
        } else if(pigsToCount == 1) {
            return earsOnAPig;
        }
        pigsToCount -= 1;
        return earsOnAPig + pigEar(pigsToCount);
    }
}
