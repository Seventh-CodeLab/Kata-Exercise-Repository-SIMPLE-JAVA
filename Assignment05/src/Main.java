import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Time Conversion
        Scanner scan = new Scanner(System.in);
        System.out.println("== Please input seconds ==");
        Time t = Time.convertSeconds(scan.nextInt());
        System.out.println(t.toString());


        System.out.println("\n======== Date =========");
        //Date Conversion and Checker

        Date d1 = new Date(12,3,2001);
        Date.printDate(d1);

        Date d2 = new Date(14, 7, 1789);
        System.out.println("Difference between " + Date.getDate(d1) + " and " + Date.getDate(d2));
        System.out.println(Date.dayDiff(d1,d2));
    }
}
