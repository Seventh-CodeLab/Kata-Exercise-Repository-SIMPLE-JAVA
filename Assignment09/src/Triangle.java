public class Triangle extends Shape{
    private int base;
    private int height;

    Triangle(String color, int base, int height){
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea(){
        return (this.base * this.height) / 2;
    }

    @Override
    public String toString() {
        return "Triangle[Base="+this.base+", Height="+this.height+super.toString()+"]";
    }
}
