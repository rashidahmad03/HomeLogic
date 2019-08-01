package com.filhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

public class readfileinfolder {
	static Connection c = null;
	static Statement stmt = null;
	static PreparedStatement insertdata;
	
	public static void main(String[] args) {
		File folder = new File("G:\\pic");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://localhost:3306/digicloud?useSSL=false", "root", "Nokia@123");
			insertdata = c.prepareStatement("insert into filemysql (filename, filedata) values(?,?)");
			}
			catch(Exception sss)
			{
				sss.getStackTrace();
			}
		Map<String, String> mpls = new HashMap();
		for (File s : folder.listFiles()) {
			
			mpls.put(s.getName(), s.getPath());
			
		}
		for (String k : mpls.keySet())
		{
			//insertdb(mpls.get(k),k);
		
		System.out.println(k + "  *****  " + mpls.get(k));
		}
	}

	static void insertdb(String filname,String name) {
		try {
			System.out.println(name);
			InputStream in = new FileInputStream(filname);
			insertdata.setString(1, name);
			insertdata.setBinaryStream(2, in);
			int rs = insertdata.executeUpdate();
			if (rs > 0) {
				System.out.println(rs);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
