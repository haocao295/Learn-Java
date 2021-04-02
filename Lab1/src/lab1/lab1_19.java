package lab1;
import java.util.Scanner;
public class lab1_19 {

    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            int n;

            System.out.println("nhap do dai 2 mang : ");
            n = input.nextInt();

            int a[] = new int[n];
            for (int i = 0; i < a.length; i++) {
                System.out.println("Nhap phan tu " + i + " la: ");
                a[i] = input.nextInt();
            }
        int b[] = new int[n];
        for (int j = 0; j < b.length; j++) {
            System.out.println("Nhap phan tu " + j + " la: ");
            b[j] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i]==b[j]){
                    count++;
                }
            }
        }
        if(count == n){
            System.out.println("true!");
        }
        else System.out.println("false!");



    }
}
