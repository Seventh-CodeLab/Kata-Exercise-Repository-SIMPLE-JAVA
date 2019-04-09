import java.util.Scanner;

public class Main {
    static void printHeart(int n){

        if(n < 2){
            System.out.println("== Minimal heart size is 2 ==");
        } else if (n > 10){
            System.out.println("== Large hearts get a very flat top. ==");
        }

        int heartB = 0;
        for(int i = -n; i <= n-(n/3+1); i++){
            for(int j = -n; j <= n; j++) {

                //All conditions for printing the heart shape
                if (i == -n && (j == -n || j == 0 || j == n)) {
                    System.out.print(". ");
                } else if (i > 0 - n / 2 && (j == -n + heartB || j == n - heartB)) {
                    System.out.print(". ");
                } else if (i > 0 - n / 2 && j < (-n + heartB) || j > (n - heartB)){
                    System.out.print(". ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
            if(i > 0-n/2){
                heartB++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("== Input heart size ==");
        printHeart(scan.nextInt());
    }
}
