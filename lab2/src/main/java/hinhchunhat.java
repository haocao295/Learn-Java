

public class hinhchunhat {

    private int chieudai;
    private int chieurong;

    private int getChieudai() {
        return chieudai;
    }

    private int getChieurong() {
        return chieurong;
    }

    public void setChieudai(int chieuDai) {
        this.chieudai = chieudai;
    }

    public void setChieurong(int chieuRong) {
        this.chieurong = chieurong;
    }

    public hinhchunhat(int chieudai, int chieurong) {
        this.chieudai = chieudai;
        this.chieurong = chieurong;
    }

    public double tinhCV() {
        return (this.chieudai + this.chieurong) * 2;
    }
    
    public double tinhDT(){
        return (this.chieudai*this.chieurong);
    }
}
