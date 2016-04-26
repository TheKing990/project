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
    String c_ps;
    String c_id;
    String c_password;


    //
    String c_firstn;
    String c_lastn;
    String c_getid;
    String c_ency_pass;

    String caiman_id_log;
    String caiman_pass_log;



    void  caiman_add_id(String n){
        caiman_id_log = n;
    }
    void caiman_add_pass(String n){
        caiman_pass_log = n;
    }


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
    void add_lname(String n){
        c_ln = n;
    }
    void add_password(String n){
        c_ps = n;
    }
    void add_id(String n){
        c_id = n;
    }










    public void add_c_bank() throws Exception {
        double c_money = 0.0;
        int bank_num1 = 1;

       /// try {
           c_firstn = encrypt(c_fn);
       // } catch (Exception e) {
          //  e.printStackTrace();
      //  }

         c_lastn = encrypt(c_ln);
        c_getid = encrypt(c_id);
        c_ency_pass = encrypt(c_ps);




        while (true) {
            c_password = rnum();
            boolean c2 = c_id_check(c_password);
            if (c2 == false){
                break;
            }
        }

        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();

            String url = "jdbc:mysql://javadb.czgc4neigria.us-west-2.rds.amazonaws.com:3306/";
            String userName = "aws1";
            String password = "passw0rd";
            String dbName = "Java";
            //Statement st = conn.createStatement();
            Connection conn = DriverManager.getConnection(url + dbName , userName, password);
            if(c_fn != null&& c_ln!= null&& c_ps != null&& c_id != null)
            {
                String sql = "INSERT INTO Caiman ( ID ,Money ,fname, lname ,pword,upassword,back_number ) VALUES (?, ?, ?, ?, ?,?,?)";

                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, c_getid);
                preparedStatement.setDouble(2, c_money);
                preparedStatement.setString(3, c_firstn);
                preparedStatement.setString(4, c_lastn);
                preparedStatement.setString(5, c_password);
                preparedStatement.setString(6, c_ency_pass);
                preparedStatement.setInt(7, bank_num1);
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
