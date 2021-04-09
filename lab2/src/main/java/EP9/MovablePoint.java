package EP9;

import java.util.*;

public class MovablePoint implements Movable {

    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(int xSpeed) {
        this.xSpeed = xSpeed;
    }

    public int getySpeed() {
        return ySpeed;
    }

    public void setySpeed(int ySpeed) {
        this.ySpeed = ySpeed;
    }

    public MovablePoint() {
    }

    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
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
    
   private List<MovableCircle> movableCircle = new ArrayList<>();

    public List<MovableCircle> getMovableCircle() {
        return movableCircle;
    }

    public void setMovableCircle(List<MovableCircle> movableCircle) {
        this.movableCircle = movableCircle;
    }
    public void addMovableCircle(MovableCircle b) {
            movableCircle.add(b);
            b.setMovablePoint(null);
        }

        public void removeMovableCircle(MovableCircle b) {
            movableCircle.remove(b);
            b.setMovablePoint(null);
        }

}
