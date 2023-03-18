package SQL;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataSQL {
	private Connection conn;
	public DataSQL() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;encrypt=true;trustServerCertificate=true;databaseName=QLST;"
					+ "username = sa; password");
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
