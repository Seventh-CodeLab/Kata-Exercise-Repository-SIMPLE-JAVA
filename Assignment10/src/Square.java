public class Square extends Rectangle {
    Square(){}
    Square(double side){
        super(side,side);
    }
    Square(double side, String color, boolean filled){
        super(side,side,color,filled);
    }

    public double getSide(){
        return super.getWidth();
    }

    public void setSide(double side){
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public String toString() {
        return "Square[Side="+this.getSide()+", "+super.toString()+"]";
    }
}
