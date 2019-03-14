public class Square {
    private double length = 2.0;

    static int shapesCounter = 0;
    static int shapesCreated(){
        return shapesCounter;
    }

    Square(){
        shapesCounter++;
        System.out.println("== New Square Created ==");
    }

    Square(double length){
        shapesCounter++;
        this.length = length;
    }

    public double getSquare(){
        return length*length;
    }

    public double getCube(){
        return length*length*length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public String toString(){
        return "Square =[edgelengths = " + this.length + "]";
    }
}
