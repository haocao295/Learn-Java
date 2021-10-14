
import java.sql.*;

public class B4_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/labjdbc", "root", "");
            Statement stmt = con.createStatement();
            String sql = "select name, district, population from city where population <= 100000";
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(rs.getString("name") + " - "
                        + rs.getString("district") + " - " + rs.getDouble("population"));
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
