public class Circle {
    private double radius = 1.0;
    private String color = "Red";

    Circle(){}

    Circle(double radius){
        this();
        this.radius = radius;
    }

    Circle(double radius, String color){
        this(radius);
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea(){
        return Math.PI*Math.pow(radius,2);
    }

    @Override
    public String toString() {
        return "Circle[radius="+radius+",color="+color+"]";
    }
}
