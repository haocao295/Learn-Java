
package EP3;

public class HoaDon {
    private String tenHang;
    private String moTa;
    private int soluongHangduocmua;
    private double giaMathang;

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getSoluongHangduocmua() {
        return soluongHangduocmua;
    }

    public void setSoluongHangduocmua(int soluongHangduocmua) {
        this.soluongHangduocmua = soluongHangduocmua;
    }

    public double getGiaMathang() {
        return giaMathang;
    }

    public void setGiaMathang(double giaMathang) {
        this.giaMathang = giaMathang;
    }

    public HoaDon() {
        this.soluongHangduocmua=0;
        this.giaMathang=0;
    }

    public HoaDon(String tenHang, String moTa, int soluongHangduocmua, double giaMathang) {
        this.tenHang = tenHang;
        this.moTa = moTa;
        this.soluongHangduocmua = soluongHangduocmua;
        this.giaMathang = giaMathang;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "tenHang=" + tenHang + ", moTa=" + moTa + ", soluongHangduocmua=" + soluongHangduocmua + ", giaMathang=" + giaMathang + '}';
    }
    private KhachHang khachhang;

    public KhachHang getKhachhang() {
        return khachhang;
    }

    public void setKhachhang(KhachHang khachhang) {
        this.khachhang = khachhang;
    }
    
    public double getThanhtien(){
        if(this.giaMathang > 0 && this.soluongHangduocmua > 0)
            return (this.giaMathang*this.soluongHangduocmua);
        return 0;
    }
}
