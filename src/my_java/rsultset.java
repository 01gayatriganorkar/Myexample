package my_java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class rsultset {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","");
			Statement st= conn.createStatement();
			String query="select * from student";
			ResultSet rs=st.executeQuery(query);
while(rs.next()) {
	String sname=rs.getString(1);
	int srn=rs.getInt(2);
int smb=rs.getInt(3); 
System.out.println(sname+"  "+srn+"  "+smb);

}
conn.close();

		}catch (Exception e) {
			System.out.println(e);
		}

	}

}
