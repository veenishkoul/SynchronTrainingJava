package dbConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class RetriveDataFromDB {

	static Connection conn;

	public static void main(String[] args) throws Throwable {

		try {
			String host = "jdbc:mysql://localhost:3306/company";
			String uName = "root";
			String uPass = "password";
			// 1. connect to DB ( Open DB )
			conn = DriverManager.getConnection(host, uName, uPass);
			// 2. Execute sql
			Statement stat = conn.createStatement();
			ResultSet rs = ((java.sql.Statement) stat).executeQuery("select * from synechron");
			while (rs.next()) {
				System.out.println("Name:" + rs.getString("name") + "===" + "Location:" + rs.getString("location")
						+ "===" + "Salary:" + rs.getInt("salary"));
			}
		} catch (Throwable t) {

		} finally {
			conn.close();
			System.out.println("Done Retriving data");
		}

		// 3. CloseDB

	}

}
