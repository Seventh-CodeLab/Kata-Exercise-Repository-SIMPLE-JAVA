public class DistanceCalc {
    public static int getDistance(int x1, int y1, int x2, int y2){
        int distance = (int) Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1 - y2),2));
        return distance;
    }
}
