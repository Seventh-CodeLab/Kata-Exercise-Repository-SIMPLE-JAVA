public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius){
        this.center = new MovablePoint(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle[Radius="+this.radius+", "+center.toString()+"]";
    }

    @Override
    public void moveUp() {
        this.center.y += center.ySpeed;
    }

    @Override
    public void moveDown() {
        this.center.y -= center.ySpeed;
    }

    @Override
    public void moveRight() {
        this.center.x += center.xSpeed;
    }

    @Override
    public void moveLeft() {
        this.center.x -= center.xSpeed;
    }
}
