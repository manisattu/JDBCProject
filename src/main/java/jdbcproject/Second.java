package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Second {

	public static void main(String[] args) throws SQLException  {
		Connection con=null;
		try {
//			registering drivers is internal and below shows getting connection
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqltuto", "root", "Mani@1998");
//			creating statement
			Statement stmt=con.createStatement();
			String sql="insert into user1(id,name,password) values(2,'name2','pass2')";
//			executing statement by using stmt.executeUpdate()
			stmt.executeUpdate(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(con!=null) {
//				then finally closing the connection
				con.close();
			}
		}
		
		
	}

}
