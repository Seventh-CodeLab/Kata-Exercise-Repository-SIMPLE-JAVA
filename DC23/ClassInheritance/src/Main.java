public class Main {
    public static void main(String[] args) {
        testCylinder();
    }

    static void testCylinder(){
        Cylinder cy1 = new Cylinder();
        System.out.println(cy1.getArea() + "²");
        System.out.println(cy1.getVolume() + "³");
        System.out.println(cy1.toString() + "\n");
        cy1.setHeight(10);
        System.out.println(cy1.getArea() + "²");
        System.out.println(cy1.getVolume() + "³");

        Cylinder cy2 = new Cylinder(7.0);
        System.out.println(cy2.getArea() + "²");
        System.out.println(cy2.getVolume() + "³");
        System.out.println(cy2.toString() + "\n");
        cy2.setHeight(10);
        System.out.println(cy2.getArea() + "²");
        System.out.println(cy2.getVolume() + "³");


        Cylinder cy3 = new Cylinder(5.0,7.0);
        System.out.println(cy3.getArea() + "²");
        System.out.println(cy3.getVolume() + "³");
        System.out.println(cy3.toString() + "\n");
        cy3.setHeight(10);
        System.out.println(cy3.getArea() + "²");
        System.out.println(cy3.getVolume() + "³");
    }
}
