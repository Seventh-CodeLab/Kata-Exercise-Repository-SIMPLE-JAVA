public abstract class Shape {
    private String color;

    Shape(String color){
        this.color = color;
    }

    public double getArea(){
        System.out.println("Shape unknown, area cannot be calculated");
        return 0;
    }

    @Override
    public String toString() {
        return "Shape[Color="+this.color+"]";
    }
}

class TestShape{
    public static void main(String[] args) {
        Shape s1 = new Rectangle("Red",4,5);
        System.out.println(s1);
        System.out.println("Area is " + s1.getArea());

        Shape s2 = new Triangle("Blue", 4,5);
        System.out.println(s2);
        System.out.println("Area is " + s2.getArea());

        // Shape s3 = new Shape("Green"); //Abstract classes cannot be instanced
        // System.out.println(s3);
        // System.out.println(s3.getArea()); //Invalid output
    }
}