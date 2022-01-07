package Package1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class MobileDetails {

	
	Connection con;

	public MobileDetails(Connection con) {
		super();
		this.con = con;
	}
	
	public void betweenamerAndPrice() throws Exception
	{
		String query="select name,brand from mobile_details where (price  between 10000 and 20000) and (camer between 30 and 50)";
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("name and brand of the mobile price between 10000 and 20000 & camer between 30 and 50");
		while(rs.next())
		{
			System.out.println("name:"+rs.getString(1)+" brand is :"+rs.getString(2));
		}
	}
	public void AppleIphone13() throws Exception
	{
		String query="select name,brand,camer,price from mobile_details where name='Iphone 13'";
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("brand and camer of Apple iphone");
		while(rs.next())
		{
			System.out.println("name"+rs.getString(1)+"brand:"+rs.getString(2)+" camer is :"+rs.getInt(3)+" price is :"+rs.getInt(4));
		}
	}
	public void BigScreenDisplay() throws Exception
	{
		String query="select name,brand from mobile_details where display=(select max(display) from mobile_details)";
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("Name and brand of the mobile of big screen display");
		while(rs.next())
		{
			System.out.println("name"+rs.getString(1)+"brand:"+rs.getString(2));
		}
	}




public void MaxcamerMinPrice() throws Exception
	{
		String query="select * from mobile_details where camer=(select max(camer) from mobile_details) and (select min(price) from mobile_details)";
		Statement st=this.con.createStatement();
		ResultSet rs=st.executeQuery(query);
		System.out.println("details of mobile where highest camer and lowest price");
		while(rs.next())
		{
			System.out.println("name :"+rs.getString(1)+" brand:"+rs.getString(2)+" price :"+rs.getInt(3)+" memory :"+rs.getInt(4)+" camer :"+rs.getInt(5)+" display"+rs.getDouble(6));
		}
	}

}
