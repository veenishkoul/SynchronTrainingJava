package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class WritingDataToDB {

	static Connection conn;

	public static void main(String[] args) throws Throwable {

		try {
			String host = "jdbc:mysql://localhost:3306/company";
			String uName = "root";
			String uPass = "password";
			// 1. connect to DB ( Open DB )
			conn = DriverManager.getConnection(host, uName, uPass);
			// 2. Execute sql
			PreparedStatement prestat = conn.prepareStatement("insert into synechron values('Radha','Indore',35000)");
			prestat.executeUpdate();
		} catch (Throwable t) {

		} finally {
			conn.close();
			System.out.println("Done writing data");
		}

		// 3. CloseDB

	}

}
