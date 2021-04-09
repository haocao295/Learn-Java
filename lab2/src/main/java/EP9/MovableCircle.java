package EP9;

public class MovableCircle implements Movable {

    private int radius;
    private MovablePoint center;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    public MovableCircle() {
    }

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;

    }

    @Override
    public String toString() {
        return "MovableCircle{" + "radius=" + radius + ", center=" + center + '}';
    }

    @Override
    public void moveUp() {
        System.out.println("len");
    }

    @Override
    public void moveDown() {
        System.out.println("xuong");
    }

    @Override
    public void moveLeft() {
        System.out.println("phai");
    }

    @Override
    public void moveRight() {
        System.out.println("trai");
    }
    
    private MovablePoint movablePoint;

    public MovablePoint getMovablePoint() {
        return movablePoint;
    }

    public void setMovablePoint(MovablePoint movablePoint) {
        this.movablePoint = movablePoint;
    }
    
}
