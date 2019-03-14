public class Circle {
    private double radius = 1.0;
    private String color = "red";

    static int shapesCounter = 0;
    static int shapesCreated(){
        return shapesCounter;
    }

    Circle(){
        shapesCounter++;
        System.out.println("== New Circle created ==");
    }

    Circle(double radius){
        shapesCounter++;
        this.radius = radius;
    }

    Circle(double radius, String color){
        shapesCounter++;
        this.radius = radius;
        this.color = color;
    }

    public double getRadius(){
        return radius;
    }

    public double getArea(){
        return Math.PI*Math.pow(getRadius(),2);
    }

    public String getColor(){
        return color;
    }

    public void setRadius(Double radius){
        this.radius = radius;
    }

    public void setColor(String color){
        this.color = color;
    }

    public double compareArea(Circle c){
        if (this.getArea() > c.getArea()){
            return this.getArea() - c.getArea();
        } else {
            return  c.getArea() - this.getArea();
        }
    }

    public String toString(){
        return "Circle[radius = " + this.radius + ", color = "+ this.color + "]";
    }
}
