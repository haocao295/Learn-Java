package lab2;

public class lab2_1_2 {
    public static void main(String[] args) {
        HinhChuNHat hcn = new HinhChuNHat(20, 10 );
        System.out.println(hcn);
    }
    static class HinhChuNHat {

        private double a, b;

        public HinhChuNHat(double a, double b) {
            this.a = a;
            this.b = b;
        }


        public double getCD(){
            return a ;
        }
        public double getCR(){
            return b ;
        }

        public void setCD(double a, double b){
            this.b = b;
            this.a = a;
        }
        public double tinhCV(){
            return (this.a+this.b)*2;
        }
        public double tinhDT(){
            return this.a*this.b;
        }
        public String toString(){
            return "HinhChuNhat: a=" + a + " b= "+b+ " ; CV= "+ tinhCV() + " DT= "+ tinhDT();
        }
    }



}
