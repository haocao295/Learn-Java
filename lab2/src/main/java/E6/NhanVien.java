package E6;

public class NhanVien extends Nguoi {

    private String school;
    private double pay;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    public NhanVien() {
    }

    public NhanVien(String school, double pay) {
        this.school = school;
        this.pay = pay;
    }

    public NhanVien(String school, double pay, String name, String address) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "school=" + school + ", pay=" + pay + '}';
    }

}
