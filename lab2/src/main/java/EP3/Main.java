package EP3;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<KhachHang> khachhangs = new ArrayList<>();
        KhachHang kh1, kh2, kh3;
        
        kh1 = new KhachHang("1","Hoang Phuong", "Khu Pho 1","@yahoo");
        kh1.addHoaDon(new HoaDon("Xoai","Ngot",5,100000));
        kh1.addHoaDon(new HoaDon("Dua","Mat",1,30000));
        
        kh2 = new KhachHang("2","Hoang Van", "Khu Pho 2","@yahoo");
        kh2.addHoaDon(new HoaDon("Xoai","Ngot",5,120000));
        kh2.addHoaDon(new HoaDon("Dua","Mat",1,31000));
        
        kh3 = new KhachHang("3","Hoang PL", "Khu Pho 3","@yahoo");
        kh3.addHoaDon(new HoaDon("Xoai","Ngot",5,1023000));
        kh3.addHoaDon(new HoaDon("Dua","Mat",1,30100));
        khachhangs.add(kh1);
        khachhangs.add(kh2);
        khachhangs.add(kh3);
        for(KhachHang khachhang:khachhangs){
           System.out.println("\n" + khachhang);
           for(HoaDon a:khachhang.getHoadons()){
                System.out.println(a);
               
           }
        }
  
    }
}
