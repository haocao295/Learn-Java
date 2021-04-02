package Lab1_btvn;

import java.util.Scanner;

public class btvn_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = scanner.nextLine().trim().replaceAll(" +", " ");
        // trim = xoa khoang cach 2 dau
        // replaceall = thay the tat ca 
        StringBuilder result = new StringBuilder();  // tao phuong thuc string
        int count = 0;

        for(int i =str.length() -1; i >= 0; i--) {
            if(str.charAt(i) == ' ' || i == 0) {
                String words = str.substring(i+1, i+1+count);
                result.append(words).append(" "); //append = them vao
                count = 0;
            }
            count++;
        }
        System.out.println("chuoi duoc dao: "+result);
    }
}
