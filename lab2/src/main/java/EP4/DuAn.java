package EP4;

import java.util.*;

public class DuAn {

    private String maDuAn;
    private String tenDuAn;
    private Date ngayBatDau;
    private Date ngayKetThuc;
    private int soNguoiThamGiaDuAn;
    private int soNguoiMaxThamGiaDuAn;
    
    public String getMaDuAn() {
        return maDuAn;
    }

    public void setMaDuAn(String maDuAn) {
        this.maDuAn = maDuAn;
    }

    public String getTenDuAn() {
        return tenDuAn;
    }

    public void setTenDuAn(String tenDuAn) {
        this.tenDuAn = tenDuAn;
    }

    public Date getNgayBatDau() {
        return ngayBatDau;
    }

    public void setNgayBatDau(Date ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }

    public Date getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(Date ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public int getSoNguoiThamGiaDuAn() {
        return soNguoiThamGiaDuAn;
    }

    public void setSoNguoiThamGiaDuAn(int soNguoiThamGiaDuAn) {
        this.soNguoiThamGiaDuAn = soNguoiThamGiaDuAn;
    }

    public int getSoNguoiMaxThamGiaDuAn() {
        return soNguoiMaxThamGiaDuAn;
    }

    public void setSoNguoiMaxThamGiaDuAn(int soNguoiMaxThamGiaDuAn) {
        this.soNguoiMaxThamGiaDuAn = soNguoiMaxThamGiaDuAn;
    }

    public DuAn() {
    }

    public DuAn(String maDuAn, String tenDuAn, Date ngayBatDau, Date ngayKetThuc, int soNguoiThamGiaDuAn) {
        this.maDuAn = maDuAn;
        this.tenDuAn = tenDuAn;
        this.ngayBatDau = ngayBatDau;
        this.ngayKetThuc = ngayKetThuc;
        this.soNguoiThamGiaDuAn = soNguoiThamGiaDuAn;
    }


    
    
}
