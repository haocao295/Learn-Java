package domain;

import java.util.HashSet;
import java.util.Set;

public class Lop implements java.io.Serializable {

    private int malop;
    private String tenlop;
    private Set<Sinhvien> sinhviens = new HashSet<>(0);

    public Lop() {
    }

    public Lop(int malop) {
        this.malop = malop;
    }

    public Lop(int malop, String tenlop, Set<Sinhvien> sinhviens) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.sinhviens = sinhviens;
    }

    public Lop(int malop, String tenlop) {
        this.malop = malop;
        this.tenlop = tenlop;
    }

    public int getMalop() {
        return this.malop;
    }

    public void setMalop(int malop) {
        this.malop = malop;
    }

    public String getTenlop() {
        return this.tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public Set<Sinhvien> getSinhviens() {
        return this.sinhviens;
    }

    public void setSinhviens(Set<Sinhvien> sinhviens) {
        this.sinhviens = sinhviens;
    }

    @Override
    public String toString() {
        return tenlop;
    }

}
