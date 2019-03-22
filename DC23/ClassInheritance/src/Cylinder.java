public class Cylinder extends Circle {
    private double height = 1.0;

    Cylinder(){}

    Cylinder(double height){
        super();
        this.height = height;
    }

    Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }

    Cylinder(double radius, double height, String color){
        super(radius,color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (2*Math.PI*this.getRadius()*height)+(super.getArea()*2);
    }

    public double getVolume(){
        return super.getArea()*height;
    }

    @Override
    public String toString() {
        return "Cylinder[radius="+getRadius()+",height="+height+",color="+getColor()+"]";
    }

//    //Alternative toString
//    @Override
//    public String toString() {
//        return "Cylinder[height="+height+",part of "+ super.toString() +"]";
//    }

}
