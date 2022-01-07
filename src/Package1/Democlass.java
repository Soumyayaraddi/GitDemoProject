package Package1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Democlass {
	
	public static void main(String[] args) throws Exception {
	String url="jdbc:mysql://localhost:3306/project1?useSSL=false";
	String uname="root";
	String pass="root";
	String query="select first_name from employee_details";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con=DriverManager.getConnection(url,uname,pass);
	Employee em=new Employee(con);
	em.getName();
	

	}

}
