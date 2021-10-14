import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class B4_1 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        try (BufferedWriter br = new BufferedWriter(new FileWriter("data1.txt"))) {
            System.out.println("Nhap noi dung file: ");
            String content = input.nextLine();
            br.write(content);
            System.out.println("Done!");
        } catch (IOException ex) {
            Logger.getLogger(B4_1.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Doc noi dung file vua tao
        
        //Doc noi dung file vua tao

    }
}
