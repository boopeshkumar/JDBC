import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class JdbcInsert {

	public static void main(String[] args) throws Exception {
		String url="jdbc:mysql://localhost:3306/boopeshdb";
		String uname="root";
		String pwd="Boopesh1234*#";
		String query1="select * from Persons";
		String query2="insert into Persons values (2,'Boopesh','Kumar','Vengamedu','Karur')";
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con= DriverManager.getConnection(url,uname,pwd);
		Statement st=con.createStatement();
		Statement st1=con.createStatement();
		ResultSet rs= st.executeQuery(query1);
		int count =st1.executeUpdate(query2);
		System.out.println(count+"row affected");
		while(rs.next()) {
			String Data = rs.getInt(1)+" : "+rs.getString(3)+" "+rs.getString(2)+" : "+rs.getString(4)+" : "+rs.getString(5);
			System.out.println(Data);
		}
		
		st.close();
		st1.close();
		con.close();

	}

}
