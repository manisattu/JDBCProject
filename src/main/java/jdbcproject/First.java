package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) throws SQLException {
		Connection con=null;
		
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqltuto", "root", "Mani@1998");
			Statement stmt=con.createStatement();
			String sql="create table user1(\r\n"+
						"id int not null primary key ,\r\n"+
						"name varchar(20) not null,\r\n"+
						"password varchar(20)\r\n"+")";
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
				con.close();
			}
		}
	}

}
