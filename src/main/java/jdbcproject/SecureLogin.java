package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SecureLogin {

	public static void main(String[] args) throws SQLException {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter id");
	String id=scn.nextLine();
	System.out.println("Enter username");
	String name=scn.nextLine();
	System.out.println("Enter password");
	String password=scn.nextLine();
	
	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqltuto", "root", "Mani@1998");
	StringBuilder queryBuilder=new StringBuilder();
	
//	String sql="insert into user1(id,name,password) values(?,?,?)";
	
	 String sql="update user1 set name=? where id=?";
	
	PreparedStatement pstmt=con.prepareStatement(sql);
	
	
//	pstmt.setString(1, id);
	pstmt.setString(1, name);
	pstmt.setString(2, id);
	
	
	pstmt.executeUpdate();
	
//	ResultSet rs=pstmt.executeQuery();
//	while(rs.next()) {
//		System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
//	}
	
}
}
