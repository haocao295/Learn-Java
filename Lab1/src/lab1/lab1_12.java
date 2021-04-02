package lab1;

import java.util.Scanner;
public class lab1_12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n;
        System.out.println("Nhap vao so can ktra: ");
        n = input.nextInt();

        if(n%3==0 && n%5==0)
            System.out.println(n+" la boi so cua 3 va 5 ");
        else
            System.out.println(n+" khong phai la boi chung cua 3 va 5");
    }



}
