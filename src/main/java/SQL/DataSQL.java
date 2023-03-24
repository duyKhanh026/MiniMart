package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import DataMM.NhanVien;

public class DataSQL{
	private Connection conn;
	public DataSQL() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=QLST;"
					+ "username = sa; password=123456");
			
		} catch (Exception e) {
            e.printStackTrace();
		}
	}
	public ArrayList<NhanVien> getListNhanVien(){
        ArrayList<NhanVien> list = new ArrayList<NhanVien>();
        String sql = "SELECT * FROM NhanVien";
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            	NhanVien s = new NhanVien();
                s.setMaNV(rs.getString("MaNV"));
                s.setHotenNV(rs.getString("HotenNV"));
                //s.setPassword(rs.getString("Passwordd")); // on working....
                //s.setPhai(rs.getBoolean("GioiTinh")); // should be this
                s.setPhai(rs.getString("Phai"));
                s.setDiachi(rs.getString("DiaChi"));
                s.setNgaySinh(rs.getDate("NgaySinh"));
                s.setDiachiMail(rs.getString("DiaChiMail"));
                s.setSDT(rs.getString("Sdt"));
                s.setMaNQL(rs.getString("MaNQL"));
                list.add(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
	public static void main(String[] args) {
		DataSQL sql = new DataSQL();
		ArrayList<NhanVien> DS1 = sql.getListNhanVien();
		for (int i = 0;i < DS1.size(); i++) {
			NhanVien t = new NhanVien();
			t = DS1.get(i);
			System.out.println(t.getMaNV() + "  "
					 + t.getHotenNV() + " " + t.getNgaySinh());
		}
	}
}
