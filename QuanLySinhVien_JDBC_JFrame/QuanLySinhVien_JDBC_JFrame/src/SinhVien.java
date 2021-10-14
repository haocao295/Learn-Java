/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class SinhVien {

    private int ma;
    private String ten, lop;
    private boolean phai;
    private double diem;

    public SinhVien() {
    }

    public SinhVien(String ten, String lop, boolean phai, double diem) {
        this.ten = ten;
        this.lop = lop;
        this.phai = phai;
        this.diem = diem;
    }

    public SinhVien(int ma, String ten, String lop, boolean phai, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.lop = lop;
        this.phai = phai;
        this.diem = diem;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public boolean isPhai() {
        return phai;
    }

    public String getPhai() {
        return phai ? "Nam" : "Nu";
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

}
