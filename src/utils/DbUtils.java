package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtils {

	private static Connection cn;

	public static void openConnection() throws SQLException {
		String url = "jdbc:mysql://localhost:3306/dac22?useSSL=false&allowPublicKeyRetrieval=true";
		// get cn from DriverManager : class
		cn = DriverManager.getConnection(url, "root", "root");
	}

	// add a getter for getting FIXED db connection
	public static Connection getCn() {
		return cn;
	}
	
	public static void closeConnection() throws SQLException {
		
		if(cn != null) {
			cn.close();;
		}
	}

}
