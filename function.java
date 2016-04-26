//import sun.misc.BASE64Encoder;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.*;
import java.security.Key;
import java.security.SecureRandom;
import java.sql.*;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
//import sun.misc.BASE64Decoder;
//import sun.misc.BASE64Encoder;
import javax.crypto.Cipher;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class function


{
    function(){};
    String c_fn;
    String c_ln;
    String c_pin;
    String c_id;
    String c_mn;
    
 /*   private static final String ALGORITHM = "AES";
    private static final String KEY = "1Hbfh667adfDEJ78";
    public static String encrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(function.ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte [] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
        String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
        return encryptedValue64;
    }*/

    /*public static String decrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(function.ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte [] decryptedValue64 = new BASE64Decoder().decodeBuffer(value);
        byte [] decryptedByteValue = cipher.doFinal(decryptedValue64);
        String decryptedValue = new String(decryptedByteValue,"utf-8");
        return decryptedValue;
    }*/

   /* private static Key generateKey() throws Exception
    {
        Key key = new SecretKeySpec(function.KEY.getBytes(),function.ALGORITHM);
        return key;
    }*/

    void add_fname(String n){
        c_fn = n;
    }
    void add_mname(String n){
        c_mn = n;
    }
    void add_lname(String n){
        c_ln = n;
    }
    void add_pin(String n){
        c_pin = n;
    }
    void add_id(String n){
        c_id = n;
    }










    public void add_c_bank() throws Exception {
        double c_money = 0.0;
        //int pin = Integer.parseInt(c_pin);
        //int pin = 1234;
        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
            String userName = "aws1";
            String password = "passw0rd";
            String dbName = "Java";
            //Statement st = conn.createStatement();
            
            System.out.println(c_fn + " " + c_ln + " " + c_id);
            
            Connection conn = DriverManager.getConnection(url + dbName , userName, password);
            if(c_fn != null&& c_ln!= null&& c_id != null)
            {
                String sql = "INSERT INTO bank ( ID ,FirstName ,MiddleName, LastName ,CurrentBalance,PIN ) VALUES (?, ?, ?, ?, ?,?)";

                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, c_id);
                preparedStatement.setString(2, c_fn);
                preparedStatement.setString(3, c_mn);
                preparedStatement.setString(4, c_ln);
                preparedStatement.setDouble(5, c_money);
                preparedStatement.setInt(6, 9999);

                preparedStatement.executeUpdate();




                conn.close();
            }
            else{
                String message = null;
                JOptionPane.showMessageDialog(new JFrame(), message, "missing stuff",
                        JOptionPane.ERROR_MESSAGE);
            }

        }
//
        catch (Exception e) {


            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());

        }
    }






    String rnum()
    {
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        int len = 10;
        StringBuilder sb = new StringBuilder( len );
        for( int i = 0; i < len; i++ )
            sb.append( AB.charAt( rnd.nextInt(AB.length()) ) );
        return sb.toString();
    }






    String getWelcomeInfo(String id, String pin) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
    	String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
        String userName = "aws1";
        String password = "passw0rd";
        String dbName = "Java";

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(url + dbName , userName, password);
        Statement stmt = conn.createStatement();
        
        String query = "select * from bank where id = '" + id + "';";
        ResultSet rs = stmt.executeQuery(query);
        rs.next();
        
    	return "Welcome " + rs.getString(2) + " " + rs.getString(4);
    }

    String getAccountInfo(String id, String pin) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
    	String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
        String userName = "aws1";
        String password = "passw0rd";
        String dbName = "Java";

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(url + dbName , userName, password);
        Statement stmt = conn.createStatement();
    	
        String query = "select * from bank where id = '" + id + "';";
        ResultSet rs = stmt.executeQuery(query);
        rs.next();
        
        String str = String.format("ID: %-20s \nFirst Name: %-20s \nMiddle Name: %-20s \nLast Name: %-20s "
        		+ "\nBalance: %-20s \nPIN: %-4s", rs.getString(1), rs.getString(2),rs.getString(3),
    		rs.getString(4), rs.getString(5), rs.getString(6));
        
    	return str;
    }
    
    String getBalance(String id, String pin) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
    	String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
        String userName = "aws1";
        String password = "passw0rd";
        String dbName = "Java";

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(url + dbName , userName, password);
        Statement stmt = conn.createStatement();
    	
        String query = "select * from bank where id = '" + id + "';";
        ResultSet rs = stmt.executeQuery(query);
        rs.next();
    	
        System.out.println(rs.getString(5));
        
    	return ""+rs.getString(5);
    }
    
    void withdraw(double n, String id, String pin) throws InstantiationException, IOException, IllegalAccessException, ClassNotFoundException, SQLException
    {
    	String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
        String userName = "aws1";
        String password = "passw0rd";
        String dbName = "Java";

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(url + dbName , userName, password);
        Statement stmt = conn.createStatement();
    	
        String query = "select * from bank where id = '" + id + "';";
        ResultSet rs = stmt.executeQuery(query);
        rs.next();
        n = rs.getInt(5)- n;
        
        stmt.executeUpdate("UPDATE bank SET currentbalance = "+ n +" WHERE id = '" + id + "';");
        FileWriter fSession = new FileWriter("session.txt", true); //used for keeping track of current activity
		PrintWriter session = new PrintWriter (fSession);
		session.println("Funds withdrawn");
		session.println(n);
		session.close();
    }
    
    void deposit(double n, String id, String pin) throws InstantiationException, IOException, IllegalAccessException, ClassNotFoundException, SQLException
    {
	    String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
	    String userName = "aws1";
	    String password = "passw0rd";
	    String dbName = "Java";
	
	    Class.forName("com.mysql.jdbc.Driver").newInstance();
	    Connection conn = DriverManager.getConnection(url + dbName , userName, password);
	    Statement stmt = conn.createStatement();
		
	    String query = "select * from bank where id = '" + id + "';";
	    ResultSet rs = stmt.executeQuery(query);
	    rs.next();
	    n = rs.getInt(5)+ n;
	    
	    stmt.executeUpdate("UPDATE bank SET currentbalance = "+ n +" WHERE id = '" + id + "';");
	    FileWriter fSession = new FileWriter("session.txt", true); //used for keeping track of current activity
		PrintWriter session = new PrintWriter (fSession);
		session.println("Funds deposited");
		session.println(n);
		session.close();
    }
    
    void transferFunds(String id, String pin, Double Amnt, String oid) throws InstantiationException, IOException, IllegalAccessException, ClassNotFoundException, SQLException
    {
    	String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
        String userName = "aws1";
        String password = "passw0rd";
        String dbName = "Java";

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(url + dbName , userName, password);
        Statement stmt = conn.createStatement();
		
        Double add = Amnt;
        
	    String query = "select * from bank where id = '" + id + "';";
	    ResultSet rs1 = stmt.executeQuery(query);
	    rs1.next();
	    Amnt = rs1.getInt(5)- Amnt; 
	    stmt.executeUpdate("UPDATE bank SET currentbalance = "+ Amnt +" WHERE id = '" + id + "';");
	    
	    query = "select * from bank where id = '" + oid + "';";
	    ResultSet rs2 = stmt.executeQuery(query);
	    rs2.next();
	    add = rs2.getInt(5)+ add; 
	    stmt.executeUpdate("UPDATE bank SET currentbalance = "+ add +" WHERE id = '" + oid + "';");
	    
	    FileWriter fSession = new FileWriter("session.txt", true); //used for keeping track of current activity
		PrintWriter session = new PrintWriter (fSession);
		session.println("Funds transferred");
		session.println(Amnt);
		session.close();
    }
    
    boolean c_id_check(String n) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
        String check = n;
        boolean c1;
        String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
        String userName = "aws1";
        String password = "passw0rd";
        String dbName = "Java";

        Class.forName("com.mysql.jdbc.Driver").newInstance();
        Connection conn = DriverManager.getConnection(url + dbName , userName, password);


        final String queryCheck = "SELECT * from Caiman WHERE pword = ?";
        final PreparedStatement ps = conn.prepareStatement(queryCheck);
        ps.setString(1, check);
        final ResultSet resultSet = ps.executeQuery();
        if(resultSet.next()) {
            final int count = resultSet.getInt(1);
            c1 =true;
        }
        else{
            c1 =false;
        }
        conn.close();
        return c1;

    }

    

}