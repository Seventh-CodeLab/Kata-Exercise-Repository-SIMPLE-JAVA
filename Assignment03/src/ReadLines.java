public class ReadLines {
    public static boolean doIntersect(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        //Assumes the coordinates are always straight lines
        if(ax1 != ax2 && ay1 != ay2){
            System.out.println("Line a has to be vertical or horizontal");
            return false;
        } else if (bx1 != bx2 && by1 != by2){
            System.out.println("Line b has to be vertical or horizontal");
            return false;
        } else {
            if (bx1 > ax2 || bx2 < ax1 || by1 > ay2 || by2 < ay1){
                return false;
            } else {
                return true;
            }
        }
    }
}
