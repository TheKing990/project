/**
 * Created by jhovanygonzalez on 4/25/16.
 */
import java.security.SecureRandom;
import java.sql.*;

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




    public  void add_c_bank() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException
    {
        double c_money = 0.0;
        int bank_num1 = 1;
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
                preparedStatement.setString(1, c_id);
                preparedStatement.setDouble(2, c_money);
                preparedStatement.setString(3, c_fn);
                preparedStatement.setString(4, c_ln);
                preparedStatement.setString(5, c_password);
                preparedStatement.setString(6, c_ps);
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



}
