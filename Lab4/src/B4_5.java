import dao.DbHelper;
import domain.City;
import java.sql.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class B4_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap district: ");
        String district = input.nextLine();
        try {
            String sql = "select * from city where district = ?";
            PreparedStatement pstmt = DbHelper.getConnection().prepareStatement(sql);
            pstmt.setString(1, district);
            ResultSet rs = pstmt.executeQuery();
            if (rs.isBeforeFirst()) {
                while (rs.next()) {
                    City city = City.fromResult(rs);
                    System.out.println(city);
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
