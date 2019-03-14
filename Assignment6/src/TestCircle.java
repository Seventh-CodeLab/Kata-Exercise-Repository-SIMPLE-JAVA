public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("C1 Radius: " + c1.getRadius());
        System.out.println("C1 Area: " + c1.getArea());

        Circle c2 = new Circle(3.0);
        System.out.println("C2 Radius: " + c2.getRadius());
        System.out.println("C2 Area: " + c2.getArea());

        Circle c3 = new Circle(5.0, "Blue");
        System.out.println("C3 Radius: " + c3.getRadius());
        System.out.println("C3 Color: " + c3.getColor());

        // You cannot access instance variables directly
        // due to their private access.
        // It means they can only be accessed inside of
        // their own instance, and not externally.
        // If they were set to "Public", you could access them.

        c3.setColor("Green");
        c3.setRadius(4.5);
        System.out.println("C3 Radius: " + c3.getRadius());
        System.out.println("C3 Color: " + c3.getColor());

        System.out.println("== Area comparison C3 C2 ==");
        System.out.println(c3.compareArea(c2));

        System.out.println(c3.toString());

        System.out.println("Circles made: " + Circle.shapesCreated());

        // Circle tests complete, new test below ==
        System.out.println("==== Square test below ====");
        Square s1 = new Square();
        System.out.println(s1.toString());

        System.out.println(Square.shapesCreated());

        Square s2 = new Square(5.0);
        System.out.println("Square 2:" + s2.getSquare());
        System.out.println("Square 2:" + s2.getCube());

        s2.setLength(7.0);
        System.out.println("Square 2:" + s2.getSquare());
        System.out.println("Square 2:" + s2.getCube());

        System.out.println(Square.shapesCreated());
    }
}
