
package E5;

public class Main {

    public static void main(String[] args) {
       hinh_tru htr1 = new hinh_tru();
       
       System.out.println(" Ban kinh: "+ htr1.getRadius()
       + "\n Chieu cao la: "+ htr1.getHeight()
       + "\n Mau: "+ htr1.getColor()
       + "\n Dien Tich Hinh Tron: "+htr1.dientichHinhtron()
       + "\n The Tich Hinh Tru: "+htr1.thetichHinhTru());
    
       hinh_tru htr2 = new hinh_tru(3.0, 5.0);
       
       System.out.println(" Ban kinh: "+ htr2.getRadius()
       + "\n Chieu cao la: "+ htr2.getHeight()
       + "\n Mau: "+ htr2.getColor()
       + "\n Dien Tich Hinh Tron: "+htr2.dientichHinhtron()
       + "\n The Tich Hinh Tru: "+htr2.thetichHinhTru());
    }
    
}
