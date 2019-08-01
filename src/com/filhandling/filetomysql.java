package com.filhandling;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class filetomysql {

	public static void main(String... a) {

		try {
			Connection c = null;
			Statement stmt = null;
			
			PreparedStatement insertdata;

			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/digicloud?useSSL=false", "root", "Nokia@123");
			// digicloud.filemysql

			stmt = c.createStatement();
			File file = new File("D:/json/hello.jpg");
			InputStream in = new FileInputStream("D:/json/hello.jpg");
			insertdata = c.prepareStatement("insert into filemysql values(?,?)");
			insertdata.setString(1, file.getName());
			insertdata.setBinaryStream(2, in);

			int rs = insertdata.executeUpdate();
			if (rs > 0) {
				System.out.println(rs);

			}

		}

		catch (Exception e) {
			e.printStackTrace();
			// result += (e.getClass().getName() + ": " + e.getMessage());

		}

	}

}
