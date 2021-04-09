package E7;

public class Point3D extends Point2D {

    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D() {
    }

    public Point3D(float z, float x, float y) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Point3D{" + "x=" + super.getX() + ", y=" + super.getY() + ", z=" + z + '}';
    }

}
