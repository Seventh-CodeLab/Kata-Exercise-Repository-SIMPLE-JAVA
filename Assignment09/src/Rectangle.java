public class Rectangle extends Shape{
    private int length;
    private int width;

    Rectangle(String color, int length, int width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea(){
        return this.width * this.length;
    }

    @Override
    public String toString() {
        return "Rectangle[Length="+this.length+", Width="+this.width+super.toString()+"]";
    }
}
