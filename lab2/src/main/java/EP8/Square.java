package EP8;

public class Square extends Rectangle {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(double side, double width, double length, String color, boolean filled) {
        super(width, length, color, filled);
        this.side = side;
    }

    @Override
    public void setLength(double length) {
        super.setLength(length); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setWidth(double width) {
        super.setWidth(width); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Square{" + "color=" + super.getColor() + ", filled=" + super.isFilled() + "side=" + side + '}';
    }

}
