package lab2;

import java.util.ArrayList;
import java.util.List;

public class lab2_2 {


    public static void main(String[] args) {
        List<SinhVien> dssv = new ArrayList<>();
        dssv.add(new SinhVien("111", "Nam", 7));
        dssv.add(new SinhVien("112", "Hai", 6));
        dssv.add(new SinhVien("113", "Hanh", 8));
        dssv.add(new SinhVien("114", "Hoa", 5));
        for (int i = 0; i < dssv.size(); i++) {
            System.out.println(dssv.get(i));
        }
        System.out.println();
        System.out.println("dtb lon nhat:"+ maxDtb(dssv));

    }

    public static  double maxDtb(List<SinhVien> dssv){
        double max=0;
        for (SinhVien sv: dssv) {
            if(sv.getDtb()>max)
                max=sv.getDtb();
        }
        return max;
    }

    static class SinhVien{
        private String mssv ;
        private String hoten;
        private double dtb;
        public SinhVien(){

        }
        public SinhVien(String mssv, String hoten, double dtb)
        {
            this.mssv = mssv;
            this.hoten = hoten;
            this.dtb = dtb;
        }
        public String getMssv(){
            return mssv;
        }
        public void setMssv(String mssv)
        {
            this.mssv = mssv;
        }
        public String getHoten(){
            return hoten;
        }
        public void setHoten(String hoten)
        {
            this.hoten = hoten;
        }
        public double getDtb(){
            return dtb;
        }
        public void setDtb(double dtb)
        {
            this.dtb = dtb;
        }

        public String toString(){
            return "SinhVien{ " + "mssv: "+ mssv+ ", hoten: "+hoten+", dtb: "+dtb+"}";
        }


    }
}
