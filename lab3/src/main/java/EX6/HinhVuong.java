package EX6;

public class HinhVuong {

    private double canh;
    private String color;

    public HinhVuong() {
    }

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public HinhVuong(double canh, String color) {
        this.canh = canh;
        this.color = color;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + canh + ", color=" + color + '}';
    }

    public double getChuVi() {
        return this.canh * 4;
    }

    public double getDienTich() {
        return this.canh * this.canh;
    }
}
