
package EP3;

import java.util.*;

public class KhachHang {
    private String maKhachhang;
    private String hoTen;
    private String diaChi;
    private String eMail;

    public String getMaKhachhang() {
        return maKhachhang;
    }

    public void setMaKhachhang(String maKhachhang) {
        this.maKhachhang = maKhachhang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public KhachHang() {
    }

    public KhachHang(String maKhachhang, String hoTen, String diaChi, String eMail) {
        this.maKhachhang = maKhachhang;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "maKhachhang=" + maKhachhang + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", eMail=" + eMail + '}';
    }
    
    private List<HoaDon> hoadons = new ArrayList<>();

    public List<HoaDon> getHoadons() {
        return hoadons;
    }

    public void setHoadons(List<HoaDon> hoadons) {
        this.hoadons = hoadons;
    }
    
    public void addHoaDon(HoaDon a) {
        hoadons.add(a);
        a.setKhachhang(null);
    }

    public void removeHoaDon(HoaDon a) {
        hoadons.remove(a);
        a.setKhachhang(null);
    }
}
