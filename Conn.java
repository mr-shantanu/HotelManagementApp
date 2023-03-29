package hotel.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conn {
	

	Connection c;
	Statement s;
	Conn(){
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/hotelmanagement","root","Saman@11");
			s = c.createStatement();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	

}
