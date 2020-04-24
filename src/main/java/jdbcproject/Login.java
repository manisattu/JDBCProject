package jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) throws SQLException {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter user name");
		String name=scn.nextLine();
		System.out.println("Enter password");
		String password=scn.nextLine();
		
		Connection con=null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysqltuto", "root", "Mani@1998");
			Statement stmt=con.createStatement();
			StringBuilder queryBuilder=new StringBuilder();
			queryBuilder.append("select * from user1 where name='")
			.append(name)
			.append("'")
			.append(" and password='")
			.append(password)
			.append("'");
			
			System.out.println(queryBuilder.toString());
			
			ResultSet rs=stmt.executeQuery(queryBuilder.toString());
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
