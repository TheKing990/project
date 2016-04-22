
public class Main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
       		Atm m =  new Atm();
		
		//should be able to connect to temporary database from anywhere using this connection
		String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
		String userName = "aws1";
		String password = "passw0rd";
		String dbName = "Java";
		
		Class.forName("com.mysql.jdbc.Driver").newInstance();
		Connection connection = DriverManager.getConnection(url + dbName , userName, password);
		Statement st = connection.createStatement();
	
		//should work like regular sql, maybe a bit slower though.
		st.executeUpdate("update bank set firstname = 'Jane' where pin = '7777'");
		
		ResultSet rs = st.executeQuery("select * from bank");
		//table has 5 columns (in order): id(12 Varchar), pin(4 varchar), balance(int), lastname(25 varchar), and firstname(25 varchar).
		//if you want me to modify the table in any way let me know. Other banks can be individual tables or databases, let me know what you
		//would prefer.
		while(rs.next())
		{
			System.out.println(rs.getString(1) +" "+ rs.getString(2) +" "+ rs.getString(3) +" "+rs.getString(4)
			+" "+ rs.getString(5));
		}
		
		connection.close();
		
		//If you get this it works
		System.out.println("Test complete");
	}

}
