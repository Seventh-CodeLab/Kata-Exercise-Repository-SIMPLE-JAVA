public class Rectangle extends Shape{
    protected double width;
    protected double length;

    public Rectangle(){}
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return this.getLength()*this.getWidth();
    }

    @Override
    public double getPerimeter() {
        return (this.getLength()*2) + (this.getWidth()*2);
    }

    @Override
    public String toString() {
        return "Rectangle[Width="+this.getWidth()+",Length="+this.getLength()+", "+super.toString()+"]";
    }
}
