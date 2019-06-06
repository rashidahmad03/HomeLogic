package com.rashid;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgreSqlExample {
	public static void main(String[] args) {
		try {

			Connection connection = DriverManager.getConnection(
					"jdbc:postgresql://ec2-184-73-181-132.compute-1.amazonaws.com:5432/dccamdk5gl9f2s",
					"zdjqmlpqibpwvb", "d4f5f91c56c1fa747550114fe16e549a149580234ca628b0a024b30d44d4d3bd");

			System.out.println("Java JDBC PostgreSQL Example");
			// When this class first attempts to establish a connection, it automatically
			// loads any JDBC 4.0 drivers found within
			// the class path. Note that your application must manually load any JDBC
			// drivers prior to version 4.0.
//			Class.forName("org.postgresql.Driver"); 

			System.out.println("Connected to PostgreSQL database!");
			Statement statement = connection.createStatement();
			System.out.println("Reading car records...");
			// System.out.printf("%-30.30s %-30.30s%n", "Model", "Price");
			// ResultSet resultSet = statement.executeQuery("SELECT * FROM public.cars");
			// while (resultSet.next()) {
			// System.out.printf("%-30.30s %-30.30s%n", resultSet.getString("model"),
			// resultSet.getString("price"));
			// }

		} /*
			 * catch (ClassNotFoundException e) {
			 * System.out.println("PostgreSQL JDBC driver not found."); e.printStackTrace();
			 * }
			 */ catch (SQLException e) {
			System.out.println("Connection failure.");
			e.printStackTrace();
		}
	}
}
