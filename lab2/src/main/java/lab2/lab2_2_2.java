package lab2;

import java.util.ArrayList;
import java.util.List;

public class lab2_2_2 {
    public static void main(String[] args) {
        List<NhanVien> dsnv = new ArrayList<>();
        dsnv.add(new NhanVien("nam", 34, 700));
        dsnv.add(new NhanVien("hai",34 , 650));
        dsnv.add(new NhanVien("hanh", 23, 880));
        dsnv.add(new NhanVien("huong",22 , 530));
        for (int i = 0; i < dsnv.size(); i++) {
            System.out.println(dsnv.get(i));
        }
        System.out.println();
        System.out.println("luong trung binh cac nhan vien: "+ltb(dsnv));

    }

    public static  double ltb(List<NhanVien> dsnv){
        double ltb = 0;
        for(NhanVien nv:dsnv){
            ltb+=nv.getluong();
        }
        ltb = ltb/dsnv.size();
        return ltb;


    }

    static class NhanVien{

        private String hoten;
        private double luongcb;
        private int ngaycong;
        public NhanVien(){

        }
        public NhanVien( String hoten, int ngaycong, double luongcb)
        {
            this.ngaycong = ngaycong;
            this.hoten = hoten;
            this.luongcb = luongcb;
        }

        public String getHoten(){
            return hoten;
        }
        public void setHoten(String hoten)
        {
            this.hoten = hoten;
        }
        public double getLuong(){
            return luongcb;
        }
        public void setLuong(double luongcb)
        {
            this.luongcb = luongcb;
        }
        public int getngay(){
            return ngaycong;
        }
        public void setngay(int ngaycong)
        {
            this.ngaycong = ngaycong;
        }
        public double getluong(){
            return this.ngaycong*this.luongcb;
        }

        public String toString(){
            return "NhanVien{ " + "hoten: "+ hoten+ ", ngaycong: "+ngaycong+", luongcb: "+luongcb+"luong: "+getluong()+" }";
        }


    }
}
