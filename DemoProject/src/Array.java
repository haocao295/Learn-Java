import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner ps = new Scanner(System.in);
        int[] person;
        int n;

        System.out.print("Nhap do dai cua mang: ");
        n = ps.nextInt();
        person = new int[n];
        for (int i = 0; i < person.length; i++) {
            System.out.printf("Nhap vao gia tri thu " +i + ": ");
            person[i] = ps.nextInt();
        }
        System.out.println("Mang vua nhap la: ");
        for (int i = 0; i < person.length; i++) {
            System.out.print(person[i] + "\t");
        }
    }
}
