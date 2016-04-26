import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
	{
		// TODO Auto-generated method stub
       		Atm m =  new Atm();
		
		//should be able to connect to temporary database from anywhere using this connection
		String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
		String userName = "aws1";
		String password = "passw0rd";
		String dbName = "Java";



            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection connection = DriverManager.getConnection(url + dbName, userName, password);
            Statement st = connection.createStatement();

            //should work like regular sql, maybe a bit slower though.
            st.executeUpdate("update bank set firstname = 'Jane' where pin = '7777'");

            ResultSet rs = st.executeQuery("select * from bank");
            //table has 6 columns (in order): ID(20 Varchar), FirstName(20 varchar), MiddleName(20 varchar), LastName(20 varchar), CurrentBalance(double),
            //and PIN(int). If you want me to modify the table in any way let me know. Other banks can be individual tables or databases, let me know what you
            //would prefer.
	    while(rs.next())
	    {
		System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+rs.getString(4)
		+" "+ rs.getString(5) + " " + rs.getString(6));
	    }
	    System.out.println();
		
	    rs = st.executeQuery("select * from bank2");
	    while(rs.next())
	    {
		System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+rs.getString(4)
		+" "+ rs.getString(5) + " " + rs.getString(6));
      	    }	
		System.out.println();
		
	    rs = st.executeQuery("select * from bank3");
	    while(rs.next())
	    {
		System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+rs.getString(4)
		+" "+ rs.getString(5) + " " + rs.getString(6) );
	    }
	    System.out.println();


		
	    //If you get this it works
	    System.out.println("Test complete");
	}

}
