public class Point {
    private int x;
    private int y;

    Point (int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point: (" + x + "," + y + ")";
    }

    public int getX(){
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y){
        setX(x);
        setY(y);
    }
}

class TestPoint{
    public static void main(String[] args) {
        Point p1 = new Point(10,20);
        System.out.println(p1);

        p1.setXY(100,10);

        System.out.println(p1.getX());
        System.out.println(p1.getY());

        System.out.println(p1);
    }
}