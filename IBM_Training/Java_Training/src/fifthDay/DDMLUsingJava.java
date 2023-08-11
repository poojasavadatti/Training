package fifthDay;



import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.ResultSet;

import java.sql.SQLException;

import java.sql.Statement;



public class DDMLUsingJava {



	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");//it is used to get instance of com.mysql.cj.jdbc.Driver class

		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Varshaks@123");

	    

		Statement stmt=con.createStatement();

		/*String createQuery="create table registration(id integer, first_name varchar(30), last_name varchar(30),gender varchar(2),age integer)";

		int ret=stmt.executeUpdate(createQuery);

		System.out.println(ret);

		*/

		/*

		String insertQuery="insert into employee values(11,'Anil','r','anil@ibm.com','7576573',120000,65)";

		int query=stmt.executeUpdate(insertQuery);

		System.out.println(query);

		*/

		String updateQuery=" update employee set salary=2000000";

		int query=stmt.executeUpdate(updateQuery);

		System.out.println(query);

		

//execute update to modify

		//executequery to fetch record

	}



}

