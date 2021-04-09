package E5;

public class hinh_tru extends hinh_tron {

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public hinh_tru() {
        super();
        this.height = 1.0;
        System.out.println("Hinh tru co()");
    }

    public hinh_tru(double height) {
        super();
        this.height = height;
        System.out.println("Hinh tru co(height)");
    }

    public hinh_tru(double height, double radius) {
        super(radius);
        this.height = height;
        System.out.println("Hinh tru co(height, radius)");
    }

    public hinh_tru(double height, double radius, String color) {
        super(radius, color);
        this.height = height;
        System.out.println("Hinh tru co(height, radius, color)");
    }

    public double thetichHinhTru(){
        return dientichHinhtron()*height;
    }

    @Override
    public String toString() {
        return "hinh_tru{" + "radius=" + super.getRadius() + ", color=" + super.getColor() + "height=" + height + '}';
    }
    
}
