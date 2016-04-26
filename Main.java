import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.PrintWriter;
import java.sql.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException
	{
		// TODO Auto-generated method stub
       		Atm m =  new Atm();
		
		//should be able to connect to temporary database from anywhere using this connection
		String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
		String userName = "aws1";
		String password = "passw0rd";
		String dbName = "Java";

		PrintWriter pChecker = new PrintWriter("session.txt"); //create and or wipe out any previously left content
		pChecker.close();
		
		
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection connection = DriverManager.getConnection(url + dbName, userName, password);
        Statement st = connection.createStatement();

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
		
	    //If you get this it works
	    System.out.println("Test complete");
	}

}
