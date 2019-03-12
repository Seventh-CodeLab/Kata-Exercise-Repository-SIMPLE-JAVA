import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class TowersOfHanoi {
    private ArrayList<Integer> pole1 = new ArrayList<>();
    private ArrayList<Integer> pole2 = new ArrayList<>();
    private ArrayList<Integer> pole3 = new ArrayList<>();

    public void newTowers(){
        System.out.println("=== How many discs do you have ===");
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        for(int i = n; i > 0; i--){
            pole1.add(i);
        }
        solve(n,pole1,pole2,pole3);
    }

    public void solve(int n, ArrayList start, ArrayList end, ArrayList auxiliary){
        if (n > 0){
            solve(n-1,start,auxiliary,end);
            end.add(start.get(start.size()-1));
            start.remove(start.size()-1);

            System.out.println("==============================");;
            System.out.println("Start Pole:" + Arrays.toString(start.toArray()));
            System.out.println("End Pole:" + Arrays.toString(end.toArray()));
            System.out.println("Auxiliary Pole:" + Arrays.toString(auxiliary.toArray()));

            solve(n-1, auxiliary, end, start);
        }
    }
}