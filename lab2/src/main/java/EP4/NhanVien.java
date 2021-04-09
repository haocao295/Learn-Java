package EP4;

public class NhanVien {

    private String msnv;
    private String hoTen;
    private int luong;

    public String getMsnv() {
        return msnv;
    }

    public void setMsnv(String msnv) {
        this.msnv = msnv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    public NhanVien() {
    }

    public NhanVien(String msnv, String hoTen, int luong) {
        this.msnv = msnv;
        this.hoTen = hoTen;
        this.luong = luong;
    }

}
