
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBUtil {

    final private static String DRIVER = ResourceBundle.getBundle("db").getString("driver");
    final private static String SERVER = ResourceBundle.getBundle("db").getString("server");
    final private static String USER = ResourceBundle.getBundle("db").getString("user");
    final private static String PASS = ResourceBundle.getBundle("db").getString("pass");

    private DBUtil() {
    }

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(SERVER, USER, PASS);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }

    public static void close(Connection... cons) {
        if (cons == null) {
            return;
        }
        for (Connection con : cons) {
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void close(Statement... stms) {
        if (stms == null) {
            return;
        }
        for (Statement stm : stms) {
            if (stm != null) {
                try {
                    stm.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    public static void close(ResultSet... rss) {
        if (rss == null) {
            return;
        }
        for (ResultSet rs : rss) {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException ex) {
                    Logger.getLogger(DBUtil.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

}
