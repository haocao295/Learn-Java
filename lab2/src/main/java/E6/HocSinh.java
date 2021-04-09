package E6;

public class HocSinh extends Nguoi {

    private String proggram;
    private int year;
    private double fee;

    public String getProggram() {
        return proggram;
    }

    public void setProggram(String proggram) {
        this.proggram = proggram;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public HocSinh() {
    }

    public HocSinh(String proggram, int year, double fee) {
        this.proggram = proggram;
        this.year = year;
        this.fee = fee;
    }

    public HocSinh(String proggram, int year, double fee, String name, String address) {
        super(name, address);
        this.proggram = proggram;
        this.year = year;
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "HocSinh{" + "proggram=" + proggram + ", year=" + year + ", fee=" + fee + '}';
    }

}
