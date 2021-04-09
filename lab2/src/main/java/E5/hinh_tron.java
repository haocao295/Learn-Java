package E5;

public class hinh_tron {

    private double radius;
    private String color;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public hinh_tron() {
        this.radius = 1.0;
        this.color = "red";
        System.out.println("Hinh tron co()");
    }

    public hinh_tron(double radius) {
        this.radius = radius;
        this.color = "red";
        System.out.println("Hinh tron co(radius)");
    }

    public hinh_tron(double radius, String color) {
        this.radius = radius;
        this.color = color;
        System.out.println("Hinh tron co(radius, color)");
    }

    @Override
    public String toString() {
        return "hinh_tron{" + "radius=" + radius + ", color=" + color + '}';
    }

    public double dientichHinhtron() {
        return Math.PI * radius * radius;
    }
}
