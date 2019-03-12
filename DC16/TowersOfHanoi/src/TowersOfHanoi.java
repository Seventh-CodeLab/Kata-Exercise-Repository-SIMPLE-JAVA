import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TowersOfHanoi {
    // Represents the poles of the challenge
    private ArrayList<Integer> pole1 = new ArrayList<>();
    private ArrayList<Integer> pole2 = new ArrayList<>();
    private ArrayList<Integer> pole3 = new ArrayList<>();

    public void newTowers(){
        //Creates a tower of the specified height
        System.out.println("=== How many discs do you have ===");
        Scanner scan = new Scanner(System.in);

        //WARNING: NUMBERS ABOVE 15 WILL TAKE TIME
        int n = Integer.parseInt(scan.nextLine());

        //Adds discs into the starting pole in descending order
        for(int i = n; i > 0; i--){
            pole1.add(i);
        }
        solve(n,pole1,pole2,pole3);
    }

    public void solve(int n, ArrayList start, ArrayList end, ArrayList auxiliary){

        //If N is 1 or more
        if (n > 0){
            //Recursive call that puts all but the last disc into the aux pole
            solve(n-1,start,auxiliary,end);

            // Get the last disc that has not been used yet.
            end.add(start.get(start.size()-1));
            start.remove(start.size()-1);

            //Print out the progress
            System.out.println("==============================");;
            System.out.println("Start Pole:" + Arrays.toString(start.toArray()));
            System.out.println("End Pole:" + Arrays.toString(end.toArray()));
            System.out.println("Auxiliary Pole:" + Arrays.toString(auxiliary.toArray()));

            // Second recursive call that moves auxiliary discs to the end
            solve(n-1, auxiliary, end, start);
        }
    }
}