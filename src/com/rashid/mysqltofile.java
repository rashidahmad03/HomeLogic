package com.rashid;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysqltofile {

	static Connection c = null;
	static Statement stmt = null;
	String result = "";
	PreparedStatement insertdata;

	public static void main(String... a) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/digicloud", "root", "Nokia@123");
			stmt = c.createStatement();
			ResultSet rs = stmt.executeQuery("select * from filemysql");
			while(rs.next()) {
				String flname=rs.getString(1);
				InputStream fl = rs.getBinaryStream(2);
				File file = new File("D:/json/"+flname);
				file.createNewFile();
				OutputStream out = new BufferedOutputStream(new FileOutputStream("D:/json/"+flname));
				for (int b; (b = fl.read()) != -1;) {
					out.write(b);
				}

			}
			System.out.println("done");

		}

		catch (Exception e) {
			e.printStackTrace();

		}

	}

}
