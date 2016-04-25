/**
 * Created by jhovanygonzalez on 4/25/16.
 */
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
    public  void add_c_bank()
    {
        double money = 0.0;

        try{
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "jdbc:mysql://localhost:3306/carmax" ;
            Connection conn = DriverManager.getConnection(url,"root","1234qwer");
            //Statement st = conn.createStatement();
            if(v != null&& b!= null&& model != null&& y != null&& m != null&& p != null && c!= null)
            {
                String sql = "INSERT INTO cars ( vin ,brand ,model, year ,mileage,price,color ) VALUES (?, ?, ?, ?, ?,?,?)";

                PreparedStatement preparedStatement = conn.prepareStatement(sql);
                preparedStatement.setString(1, v);
                preparedStatement.setString(2, b);
                preparedStatement.setString(3, model);
                preparedStatement.setInt(4, year);
                preparedStatement.setInt(5, mil);
                preparedStatement.setInt(6, pri);
                preparedStatement.setString(7, c);
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


}
