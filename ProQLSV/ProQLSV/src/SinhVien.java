
public class SinhVien {

    private int msv;
    private String ten;
    private boolean phai;

    public SinhVien() {
    }

    public SinhVien(int msv, String ten, boolean phai) {
        this.msv = msv;
        this.ten = ten;
        this.phai = phai;
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public boolean isPhai() {
        return phai;
    }

    public String getPhai() {
        return phai ? "Nam" : "Nữ";
    }

    public void setPhai(boolean phai) {
        this.phai = phai;
    }

}
