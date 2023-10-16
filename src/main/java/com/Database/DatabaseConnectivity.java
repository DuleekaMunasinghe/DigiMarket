package com.Database;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Connect to DB");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store","root", "selenium@123");
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT customer_id, first_name, last_name FROM customers"); // Established the connection 
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+ "\t" + rs.getString(2)+ "\t" + rs.getString(3));
			}
			con.close();
		} catch (Exception e) {
			System.out.println("Got an exception");
			System.out.println(e);
		}
	}

}

/*
package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DatabaseConnectivity {

    public static void main(String[] args) {
        System.out.println("Connect to DB");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sql_store", "root", "Az7i*29sadlm1");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT customer_id, first_name, last_name FROM customers");

            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + " " + rs.getString(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Got an exception");
            System.out.println(e);
        }
    }
}
*/