
package E7;


public class Main {

    
    public static void main(String[] args) {
        Point2D p2a = new Point2D(1,2);
        System.out.println(p2a);
        Point2D p2b = new Point2D();
        System.out.println(p2b);
        
        p2a.setX(3);
        p2a.setY(4);
        System.out.println(p2a);
        System.out.println("Diem x: "+p2a.getX());
        System.out.println("Diem y: "+p2a.getY());
        
        Point3D p3a = new Point3D(12,42,22);
        System.out.println(p3a);
        Point3D p3b = new Point3D();
        System.out.println(p3b);
        
        p3a.setX(22);
        p3a.setY(12);
        p3a.setZ(42);
        System.out.println(p3a);
        System.out.println("Diem x: "+p3a.getX());
        System.out.println("Diem y: "+p3a.getY());
        System.out.println("Diem z: "+p3a.getZ());
    }
    
}
