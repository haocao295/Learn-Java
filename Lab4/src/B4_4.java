
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import dao.DbHelper;

public class B4_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap countrycode: ");
        String code = input.nextLine();
        try {
            String sql = "select * from city where countrycode = ? and Population < 50000";
            PreparedStatement pstmt = DbHelper.getConnection().prepareStatement(sql);
            pstmt.setString(1, code);
            ResultSet rs = pstmt.executeQuery();
            if (rs.isBeforeFirst()) {
                int i=0;
                if(i<=10){
                while (rs.next()) {
                    System.out.printf("Id=%d; Name=%s; CountryCode=%s; District=%s; Population=%d;\n",
                            rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
                    i+=1;
                    }
                }
            } else {
                System.out.println("Khong tim thay!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(B4_4.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            DbHelper.close();
        }
    }
}
