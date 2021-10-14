package domain;

public class Sinhvien implements java.io.Serializable {

    private Integer mssv;
    private Lop lop;
    private String hoten;
    private Double dtb;

    public Sinhvien() {
    }

    public Sinhvien(Lop lop) {
        this.lop = lop;
    }

    public Sinhvien(Lop lop, String hoten, Double dtb) {
        this.lop = lop;
        this.hoten = hoten;
        this.dtb = dtb;
    }

    public Integer getMssv() {
        return this.mssv;
    }

    public void setMssv(Integer mssv) {
        this.mssv = mssv;
    }

    public Lop getLop() {
        return this.lop;
    }

    public void setLop(Lop lop) {
        this.lop = lop;
    }

    public String getHoten() {
        return this.hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public Double getDtb() {
        return this.dtb;
    }

    public void setDtb(Double dtb) {
        this.dtb = dtb;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "mssv=" + mssv + ", lop=" + lop + ", hoten=" + hoten + ", dtb=" + dtb + '}';
    }

}
