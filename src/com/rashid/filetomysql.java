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

public class filetomysql {
	

	static Connection c = null;
	static Statement stmt = null;
	String result = "";
 PreparedStatement insertdata;
	public static void main(String...a) {

		try {

			Class.forName("com.mysql.cj.jdbc.Driver");  
			c=DriverManager.getConnection("jdbc:mysql://localhost:3306/digicloud","root","Nokia@123");  
			//digicloud.filemysql
			
			
			stmt = c.createStatement();
			 ResultSet rs = stmt.executeQuery("select * from filemysql");
				if(rs.next())
				{
					String flname=rs.getString(1);
					InputStream fl=rs.getBinaryStream(2);
					

					File file = new File("D:/json/helo.jpg");
					/*
					 * If file gets created then the createNewFile() method would return true or if
					 * the file is already present it would return false
					 */
					file.createNewFile();	
					OutputStream out = new BufferedOutputStream(new FileOutputStream("D:/json/helo.jpg"));

					for (int b; (b = fl.read()) != -1;) {
						out.write(b);
					}
					
				}
				System.out.println("done");
			//Part filePart = request.getPart("photo");
          //  InputStream pis = filePart.getInputStream();
			// updateUser.setBinaryStream(10, im);
			
			
			
		}

		catch (Exception e) {
			e.printStackTrace();
		//	result += (e.getClass().getName() + ": " + e.getMessage());

		}

	}

	
}
