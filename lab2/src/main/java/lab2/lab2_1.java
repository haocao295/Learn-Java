package lab2;

public class lab2_1 {
    public static void main(String[] args) {
        HinhTron ht ;
        ht = new HinhTron(10);
        System.out.println(ht);
    }
    static class HinhTron {

       private double r;
       public HinhTron (){

       }
       public HinhTron(double r){
           this.r = r;
       }
       public double getR(){
           return r;
       }
       public void setR(double r){
           this.r = r;
       }
       public double tinhCV(){
           return 2*Math.PI*r;
       }
       public double tinhDT(){
           return Math.PI*r*r;
       }
       public String toString(){
           return "HinhTron: r=" + r + " ; CV= "+ tinhCV() + " DT= "+ tinhDT();
       }
    }

}
