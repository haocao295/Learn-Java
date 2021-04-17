package Lab3_;

public class HinhTron {

    private double r;
    private String color;
    
    public HinhTron() {
    }

    public HinhTron(double r) {
        this.r = r;
    }

    public HinhTron(double r, String color) {
        this.r = r;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getDientich() {
        return Math.PI * r * r;
    }

    public double getChuvi() {
        return 2 * Math.PI * r;
    }

    @Override
    public String toString() {
        return "R=" + r + "; DT=" + getDientich() + "; CV=" + getChuvi()+ ", Color: " + color +'}';
    }

}
