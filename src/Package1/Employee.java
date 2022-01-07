package Package1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {
	
	Connection con;

	public Employee(Connection con) {
		super();
		this.con = con;
	}
	
	public void getName() throws Exception
	{
		String query="select * from employee";
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("name ane and id of employee");
		while(rs.next())
		{
			System.out.println("id is: "+rs.getInt(1)+"name:"+rs.getString(1)+" brand is :"+rs.getString(2));
		}
	}

}
