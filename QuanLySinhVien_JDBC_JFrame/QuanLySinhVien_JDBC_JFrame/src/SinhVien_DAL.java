
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SinhVien_DAL {

    public static ArrayList<SinhVien> getAll() {
        ArrayList<SinhVien> dsSV = new ArrayList();
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getConnection();
            stm = con.createStatement();
            rs = stm.executeQuery("Select * From sinhvien_tbl");
            while (rs.next()) {
                int ma = rs.getInt("ma");
                String ten = rs.getString("ten");
                String lop = rs.getString("lop");
                boolean phai = rs.getBoolean("phai");
                double diem = rs.getDouble("diem");
                SinhVien sv = new SinhVien(ma, ten, lop, phai, diem);
                dsSV.add(sv);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs);
            DBUtil.close(stm);
            DBUtil.close(con);
        }
        return dsSV;
    }
    
    public static int insert(SinhVien sv) {
        int ret = 0;
        Connection con = null;
        PreparedStatement pstm = null;
        ResultSet rs = null;
        try {
            con = DBUtil.getConnection();
            pstm = con.prepareStatement("Insert into sinhvien_tbl (ten, lop, phai, diem) Values (?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            pstm.setString(1, sv.getTen());
            pstm.setString(2, sv.getLop());
            pstm.setBoolean(3, sv.isPhai());
            pstm.setDouble(4, sv.getDiem());
            int count = pstm.executeUpdate();
            if (count > 0){
                rs = pstm.getGeneratedKeys();
                if (rs.next()){
                    ret = rs.getInt(1);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(rs);
            DBUtil.close(pstm);
            DBUtil.close(con);
        }
        return ret;
    }
    
    public static int delete(SinhVien sv) {
        int ret = 0;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = DBUtil.getConnection();
            pstm = con.prepareStatement("Delete From sinhvien_tbl where ma = ?");
            pstm.setInt(1, sv.getMa());
            ret = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pstm);
            DBUtil.close(con);
        }
        return ret;
    }
    
    public static int update(SinhVien sv) {
        int ret = 0;
        Connection con = null;
        PreparedStatement pstm = null;
        try {
            con = DBUtil.getConnection();
            pstm = con.prepareStatement("Update sinhvien_tbl Set ten = ?, lop = ?, phai = ?, diem = ? where ma = ?");
            pstm.setString(1, sv.getTen());
            pstm.setString(2, sv.getLop());
            pstm.setBoolean(3, sv.isPhai());
            pstm.setDouble(4, sv.getDiem());
            pstm.setInt(5, sv.getMa());
            ret = pstm.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(pstm);
            DBUtil.close(con);
        }
        return ret;
    }
}
