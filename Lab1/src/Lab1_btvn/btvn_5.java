package Lab1_btvn;

import java.util.Scanner;

public class btvn_5 {
    public static void main(String[] args)
    {  
        String str;
        int counter[] = new int[256];
        Scanner input = new Scanner(System.in);
        System.out.print("nhap chuoi: ");
        str = input.nextLine();
        for (int i = 0; i < str.length(); i++){
            counter[str.charAt(i)]++;
        }
        char array[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            array[i] = str.charAt(i);
            int flag = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j])
                    flag++;
            }
            if (flag == 1)
                System.out.println("Số lần xuất hiện của " + str.charAt(i)
                        + " trong chuỗi:" + counter[str.charAt(i)]);
        }
        
    }
    
}