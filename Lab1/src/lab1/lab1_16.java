package lab1;
import java.nio.charset.CharsetEncoder;
import java.util.Scanner;
public class lab1_16 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Nhập vào một chuỗi bất kỳ: ");
        chuoi = input.nextLine();

        // duyệt từ đầu đến cuối chuỗi
        for (int i = 0; i < chuoi.length(); i++) {
            // trả về ký tự tại vị trí thứ i trong chuỗi
            // và gán vào cho biến kyTu
            kyTu = chuoi.charAt(i);

            // kiểm tra ký tự tại vị trí i có phải khoảng trắng không
            if (Character.isSpace(kyTu)) {
                count1++;
            }
            if(Character.isAlphabetic(kyTu)){
                count2++;
            }
            if(Character.isDigit(kyTu)){
                count3++;
            }
        }

        System.out.println("Số khoảng trắng có trong chuỗi " + chuoi
                + " = " + count1);
        System.out.println("Số ký tự chữ cái có trong chuỗi " + chuoi
                + " = " + count2);
        System.out.println("Số ký tự chữ số có trong chuỗi " + chuoi
                + " = " + count3);
    }
    }

