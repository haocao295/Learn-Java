package lab1;

import java.util.Scanner;
class lab1_13 {
    static boolean checkPerfectSquare(double x)
    {
        double sq = Math.sqrt(x);
        return ((sq - Math.floor(sq)) == 0);
    }
    public static void main(String[] args)
    {
        System.out.print("Nhập vào số cần kiểm tra:");
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();
        scanner.close();
        if (checkPerfectSquare(n))
            System.out.println(n+ " Là số chính phương");
        else
            System.out.println(n+ " Không phải là số chính phương");
    }
}