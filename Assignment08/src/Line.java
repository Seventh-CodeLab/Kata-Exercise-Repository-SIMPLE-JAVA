public class Line {
    private Point begin;
    private Point end;

    Line (Point begin, Point end){
        this.begin = begin;
        this.end = end;
    }

    Line (int beginX, int beginY, int endX, int endY){
        begin = new Point(beginX,beginY);
        end = new Point(endX,endY);
    }

    public String toString() {
        return "Line(" + begin + " - " + end +")";
    }

    public Point getBegin() { return begin; }
    public Point getEnd() { return end; }
    public void setBegin(Point begin) { this.begin = begin; }
    public void setEnd(Point end) { this.end = end; }

    public int getBeginX(){ return begin.getX(); }
    public int getBeginY(){ return begin.getY(); }
    public int getEndX(){ return end.getX(); }
    public int getEndY(){ return end.getY(); }

    public void setBeginX(int x) {begin.setX(x);}
    public void setBeginY(int y) {begin.setY(y);}
    public void setBeginXY(int x, int y){begin.setXY(x,y);}
    public void setEndX(int x){end.setX(x);}
    public void setEndY(int y){end.setY(y);}
    public void setEndXY(int x, int y){end.setXY(x,y);}

    public int getLength(){
        int xDiff;
        int yDiff;
        if(getBeginX() > getEndX()){
            xDiff = getBeginX() - getEndX();
        } else {
            xDiff = getEndX() - getBeginX();
        }
        if(getBeginY() > getEndY()){
            yDiff = getBeginY() - getEndY();
        } else {
            yDiff = getEndY() - getBeginY();
        }
        return (int) Math.sqrt((xDiff * xDiff)+(yDiff * yDiff));
    }

    public double getGradient(){
        //Ensure xDiff and yDiff are always positive
        int xDiff;
        int yDiff;
        if(getBeginX() > getEndX()){
            xDiff = getBeginX() - getEndX();
        } else {
            xDiff = getEndX() - getBeginX();
        }
        if(getBeginY() > getEndY()){
            yDiff = getBeginY() - getEndY();
        } else {
            yDiff = getEndY() - getBeginY();
        }

        return Math.atan2(yDiff,xDiff);
    }
}

class TestLine{
    public static void main(String[] args) {
        Line l1 = new Line(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(7,3);
        Point p2 = new Point( 10,5);
        Line l2 = new Line(p1,p2);
        System.out.println(l2);

        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
}