/**
 * Created by jhovanygonzalez on 4/25/16.
 */
import sun.misc.BASE64Encoder;

import java.security.Key;
import java.security.SecureRandom;
import java.sql.*;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

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










    private static final String ALGORITHM = "AES";
    private static final String KEY = "1Hbfh667adfDEJ78";

    public static String encrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(function.ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);
        byte [] encryptedByteValue = cipher.doFinal(value.getBytes("utf-8"));
        String encryptedValue64 = new BASE64Encoder().encode(encryptedByteValue);
        return encryptedValue64;

    }

    public static String decrypt(String value) throws Exception
    {
        Key key = generateKey();
        Cipher cipher = Cipher.getInstance(function.ALGORITHM);
        cipher.init(Cipher.DECRYPT_MODE, key);
        byte [] decryptedValue64 = new BASE64Decoder().decodeBuffer(value);
        byte [] decryptedByteValue = cipher.doFinal(decryptedValue64);
        String decryptedValue = new String(decryptedByteValue,"utf-8");
        return decryptedValue;

    }

    private static Key generateKey() throws Exception
    {
        Key key = new SecretKeySpec(function.KEY.getBytes(),function.ALGORITHM);
        return key;
    }

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
        int pin = Integer.parseInt(c_pin);








        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
            String userName = "aws1";
            String password = "passw0rd";
            String dbName = "Java";
            //Statement st = conn.createStatement();
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
                preparedStatement.setInt(6, pin);

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




    void caiman_log(){

    }



}

