package EX5;

public class HinhChuNhat {

    private double chieudai;
    private double chieurong;
    private String color;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double chieudai, double chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public HinhChuNhat(double chieudai, double chieurong, String color) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getChieudai() {
        return chieudai;
    }

    public void setChieudai(double chieudai) {
        this.chieudai = chieudai;
    }

    public double getChieurong() {
        return chieurong;
    }

    public void setChieurong(double chieurong) {
        this.chieurong = chieurong;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{"
                + "CD: =" + chieudai
                + ", CR: " + chieurong
                + ", CV: " + getChuVi()
                + ", DT: " + getDienTich() 
                + ", Color: " + color +'}';
    }

    public double getChuVi() {
        return (this.chieudai + this.chieurong) / 2;
    }

    public double getDienTich() {
        return this.chieudai * this.chieurong;
    }
}
