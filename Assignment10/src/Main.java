public class Main {
    private static void testAbstractShape(){
        Shape s1 = new Circle(5.5,"RED",false);
        System.out.println(s1);
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());
        System.out.println(s1.getColor());
        System.out.println(s1.isFilled());
        //System.out.println(s1.getRadius()); //Cant run without cast

        Circle c1 = (Circle)s1;
        System.out.println(c1);
        System.out.println(c1.getArea());
        System.out.println(c1.getPerimeter());
        System.out.println(c1.getColor());
        System.out.println(c1.isFilled());
        System.out.println(c1.getRadius());

        // Shape s2 = new Shape(); //Abstract classes cannot be instanced
        Shape s3 = new Rectangle(1.0,2.0,"RED",false);
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println(s3.getColor());
        //System.out.println(s3.getLength()); //Cant run without cast

        Rectangle r1 = (Rectangle)s3;
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getPerimeter());
        System.out.println(r1.getColor());
        System.out.println(r1.getLength());

        Shape s4 = new Square(6.6);
        System.out.println(s4);
        System.out.println(s4.getArea());
        System.out.println(s4.getColor());
        //System.out.println(s4.getSide()); //Can't run without cast

        Rectangle r2 = (Rectangle)s4; //Downcast from Shape to Rectangle
        Square sq1 = (Square)r2; //Downcast again from Rectangle to Square
        System.out.println(sq1);
        System.out.println(sq1.getArea());
        System.out.println(sq1.getColor());
        System.out.println(sq1.getSide());
        System.out.println(sq1.getLength());
    }

    static void testMovables(){
        Movable m1 = new MovablePoint(5,6,10,15);
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1,2,3,4,20);
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);

        Movable m3 = new MovableRectangle(4,5,1,1,10,10);
        System.out.println(m3);
        m3.moveLeft();
        m3.moveUp();
        System.out.println(m3);
    }

    public static void main(String[] args) {
        testAbstractShape();
        System.out.println(); // Some space
        testMovables();

        //The main difference between abstract classes and interfaces is the level of abstraction provided by each.
        //Interfaces are always 100% abstract while abstract classes can have adjusted abstraction levels by choice.
        //Interfaces also serve as useful tools for developers to always know what methods are required in classes.
    }
}
