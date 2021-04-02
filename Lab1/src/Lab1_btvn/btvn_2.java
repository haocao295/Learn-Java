package Lab1_btvn;

import java.util.Scanner;

public class btvn_2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("nhap so nhi phan : ");
        String binaryString =input.nextLine();
        System.out.println("so thap phan la : "+Integer.parseInt(binaryString,2));
    }
}
