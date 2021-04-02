package lab1;

import  java.util.Scanner;
public class lab1_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.println("nhap do dai mang: ");
        n = input.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Nhap phan tu "+i+" la: ");
            a[i] = input.nextInt();
        }
        System.out.println("Mang dao nguoc la: ");
        for (int i = n-1; i >=0; i--) {
            System.out.print(a[i]+"\t");
        }

    }

}
