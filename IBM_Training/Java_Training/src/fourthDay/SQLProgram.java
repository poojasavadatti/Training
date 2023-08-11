package fourthDay;

import java.sql.*;



public class SQLProgram {



	public static void main(String[] args) throws Exception {

		//inner join-common 

		//left join - all the record from left table and matching record from right table

	


	Class.forName("com.mysql.cj.jdbc.Driver");//it is used to get instance of com.mysql.cj.jdbc.Driver class

	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/training","root","Varshaks@123");

    

	Statement stmt=con.createStatement();

	ResultSet rs=stmt.executeQuery("select count(*) as recordcounts from employee where salary>1000");

//	System.out.println(rs.next());

	rs.next();

	System.out.println(rs.getInt("recordcounts"));

while(rs.next()) {

	System.out.print(rs.getString("FirstName"));

	System.out.println("-----"+rs.getString("lastname"));

//	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));

}



ResultSet joins=stmt.executeQuery("select e.firstname as dept,e.lastname,e.salary, e.deptId from employee e inner join dept d on \r\n"

		+ "d.deptid=e.deptId where d.deptid=78");

while(joins.next()) {

	System.out.println(joins.getString("dept"));

}

con.close();

}

}

//driver initialisation

//connection - url,dbname, username,password

//statement

//resultset

//rs