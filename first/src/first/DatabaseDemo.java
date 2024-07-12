package first;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class DatabaseDemo {
	public static void main(String args[])
	{
		//fetch the class in the bracket and store in the driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","1502");
			//Statement statement = connection.createStatement();
			//int row=statement.executeUpdate("insert into Students values(19,'harsh','pokhara');");
			//System.out.println(row);//output 1-no of rows added
			PreparedStatement preparedStatement = connection.prepareStatement("insert into students(Roll_no,sname, address) values(?,?,?)");
			/*preparedStatement.setInt(1, 15);
      		preparedStatement.setString(2, "Anj");
      		preparedStatement.setString(3, "kv nagar");
      		int rows = preparedStatement.executeUpdate();
      		System.out.println(rows);*/
            ResultSet resultSet = preparedStatement.executeQuery("select * from students");
			
			while(resultSet.next()) {
				int id = resultSet.getInt("Roll_no");
				String name = resultSet.getString("sname");
				String place = resultSet.getString("address");
				System.out.println(name + " ====> " + place);
				System.out.println();
			}
		}catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
	}

}
