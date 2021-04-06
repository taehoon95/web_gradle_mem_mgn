package web_gradle_mem_mgn.ds;

import java.sql.Connection;

import javax.naming.InitialContext;
import javax.sql.DataSource;

public class JndiDs {
	private static DataSource ds;
	
	private JndiDs() {}
	
	static {
		try {
			InitialContext ic = new  InitialContext(); // 1. JNDI 서버 객체 생성
			ds = (DataSource) ic.lookup("java:comp/env/jdbc/web_member_mgn"); // 2. lookup()
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection() {
		try {
			return ds.getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
