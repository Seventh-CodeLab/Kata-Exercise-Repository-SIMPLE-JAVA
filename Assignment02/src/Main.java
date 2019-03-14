import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        //Calculate time from seconds
        System.out.println(TimeCalc.getTime(0));
        System.out.println(TimeCalc.getTime(59));
        System.out.println(TimeCalc.getTime(60));
        System.out.println(TimeCalc.getTime(100));
        System.out.println(TimeCalc.getTime(3600));
        System.out.println(TimeCalc.getTime(4000));

        //Read X and Y and display distance
        System.out.println(DistanceCalc.getDistance(6,4,8,5));
    }
}
