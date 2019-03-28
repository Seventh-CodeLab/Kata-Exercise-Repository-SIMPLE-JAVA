public class LineSub extends Point{
    Point end;

    LineSub(int beginX, int beginY, int endX, int endY){
        super(beginX,beginY);
        this.end = new Point(endX,endY);
    }

    LineSub(Point begin, Point end){
        super(begin.getX(),begin.getY());
        this.end = end;
    }

    @Override
    public String toString() {
        return "LineSub(" + super.toString() + " - " + end.toString() + ")";
    }

    public Point getBegin(){ return new Point(super.getX(),super.getY());}
    public Point getEnd() { return  end; }
    public void setBegin(int x,int y){ super.setXY(x,y); }
    public void setEnd(int x, int y){ setEnd(x,y); }

    public int getBeginX(){ return super.getX(); }
    public int getBeginY(){ return super.getY(); }
    public int getEndX(){ return end.getX(); }
    public int getEndY(){ return end.getY(); }

    public void setBeginX(int x) {super.setX(x);}
    public void setBeginY(int y) {super.setY(y);}
    public void setBeginXY(int x, int y){super.setXY(x,y);}
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

class TestLineSub{
    public static void main(String[] args) {
        LineSub l1 = new LineSub(0, 0, 3, 4);
        System.out.println(l1);

        Point p1 = new Point(7,3);
        Point p2 = new Point( 10,5);
        LineSub l2 = new LineSub(p1,p2);
        System.out.println(l2);

        System.out.println(l1.getLength());
        System.out.println(l1.getGradient());

        System.out.println(l2.getLength());
        System.out.println(l2.getGradient());
    }
}
