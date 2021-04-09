package E1;

public class NhanVien {

    private String hoTen;
    private int ngayCong;
    private double luongCB;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int ngayCong, double luongCB) {
        this.hoTen = hoTen;
        this.ngayCong = ngayCong;
        this.luongCB = luongCB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen() {
        this.hoTen = hoTen;
    }

    public int getNgayCong() {
        return ngayCong;
    }

    public void setNgayCong() {
        this.ngayCong = ngayCong;
    }

    public double getLuongCB() {
        return luongCB;
    }

    public void setLuongCB() {
        this.luongCB = luongCB;
    }

    public double getLuong() {

        return this.ngayCong * this.luongCB;
    }

    @Override
    public String toString() {
        return "Ho ten: " + this.hoTen + "\n"
                + "So ngay cong: " + this.ngayCong + "\n"
                + "Luong co ban: " + this.luongCB + "\n"
                + "Tong luong: " + this.getLuong();
    }
}
