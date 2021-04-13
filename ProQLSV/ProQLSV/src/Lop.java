
import java.util.ArrayList;

public class Lop {
    private String ten;
    private ArrayList<SinhVien> dsSV;

    public Lop() {
        dsSV = new ArrayList<>();
    }

    public Lop(String ten) {
        this.ten = ten;
        dsSV = new ArrayList<>();
    }

    public Lop(String ten, ArrayList<SinhVien> dsSV) {
        this.ten = ten;
        this.dsSV = dsSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public ArrayList<SinhVien> getDsSV() {
        return dsSV;
    }

    public void setDsSV(ArrayList<SinhVien> dsSV) {
        this.dsSV = dsSV;
    }
    
    public SinhVien laySV(int index){
        return this.dsSV.get(index);
    }
    
    public void themSV(SinhVien sv){
        this.dsSV.add(sv);
    }
    
    public void xoaSV(SinhVien sv){
        this.dsSV.remove(sv);
    }

    @Override
    public String toString() {
        return ten;
    }
}
