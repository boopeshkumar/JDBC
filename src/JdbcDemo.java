import java.sql.*;
public class JdbcDemo {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/boopeshdb";
		String uname="root";
		String pwd="Boopesh1234*#";
		String query="select LastName from Persons where PersonID=1";
		String query1="select * from Persons";
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pwd);
		Statement st=con.createStatement();
		Statement st1=con.createStatement();
		ResultSet rs= st.executeQuery(query1);
		ResultSet rs1=st1.executeQuery(query);
		rs1.next();
		String lname= rs1.getString("LastName");
		System.out.println(lname);
		rs.next();
		String Data = rs.getInt(1)+" : "+rs.getString(3)+" "+rs.getString(2)+" : "+rs.getString(4)+" : "+rs.getString(5);
		System.out.println(Data);		
		st.close();
		st1.close();
		con.close();

	}

}
