package lab1;

import java.util.Scanner;

public class lab1_18 {
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
        int temp;
        for (int i = 0 ; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                }
            }
        }
        System.out.println("Mang dao nguoc la: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"\t");
        }

    }

}
