/**
 * Created by jhovanygonzalez on 4/25/16.
 */

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class c_sign
{
    private JLabel fname;
    private JLabel lname;
    private JLabel password;
    private JLabel id;
    private JLabel user_pass;


    private JTextField jfn;
    private JTextField jln;
    private JTextField jp;
    private JTextField juserp;
    private JTextField jid;


    private JLabel message_c;

    private JTextField jbank_id;
    private JTextField jpassword;

    c_sign(){

        final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;
        JFrame window = new JFrame("Sign In");
        Color db = new Color(119, 136, 159);
        Color sb = new Color(0, 191, 255);

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.getContentPane().setBackground(db);

        message_c = new JLabel("The Atlantic Caiman Bank");
        message_c.setSize(600, 40);
        message_c.setFont(new Font("Verdana", Font.ITALIC, 35));
        message_c.setForeground(sb);
        message_c.setLocation(180, 100);
        window.add(message_c);


        fname = new JLabel("First Name");
        fname.setSize(100, 30);
        fname.setLocation(50, 220);
        window.add(fname);


        jfn= new JTextField(10);
        jfn.setSize(160, 30);
        jfn.setLocation(140, 220);
        jfn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String str = jfn.getText();

            }


        });
       window.add(jfn);









        lname= new JLabel("Last Name");
        lname.setSize(100, 30);
        lname.setLocation(50, 250);
        window.add(lname);


        jln= new JTextField(10);
        jln.setSize(160, 30);
        jln.setLocation(140, 250);
        jln.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String str = jln.getText();

            }


        });
       window.add(jln);











        ///password


        user_pass= new JLabel("Password");
        user_pass.setSize(100, 30);
        user_pass.setLocation(50, 280);
        window.add(user_pass);


        juserp= new JTextField(10);
        juserp.setSize(160, 30);
        juserp.setLocation(140, 280);
        juserp.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String str = juserp.getText();

            }


        });
        window.add(juserp);











            //id


        id= new JLabel("ID");
        id.setSize(100, 30);
        id.setLocation(50, 320);
        window.add(id);


       jid= new JTextField(10);
        jid.setSize(160, 30);
        jid.setLocation(140, 320);
        jid.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String str = jid.getText();

            }


        });
        window.add(jid);





        JButton c_button1 = new JButton("Sign Up");
        c_button1.setSize(100, 30);
        c_button1.setLocation(300, 400);
        //c_button1.addActionListener();
        window.add(c_button1);






        window.setVisible(true);

    }
}
