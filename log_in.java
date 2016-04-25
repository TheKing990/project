import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by jhovanygonzalez on 4/25/16.
 */
class log_in extends JFrame
{

    private JLabel bank_id;
    private JLabel password;

    private JTextField jbank_id;
    private JTextField jpassword;

    log_in() {
        admin_log me  = new admin_log();
        final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;
        JFrame window = new JFrame("Log In");
        Color db = new Color(119, 136, 159);
        Color sb = new Color(0, 191, 255);

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.getContentPane().setBackground(db);

        JButton c_button1 = new JButton("Sign in");
        c_button1.setSize(100, 30);
        c_button1.setLocation(300, 400);
        //c_button1.addActionListener();
        window.add(c_button1);


        bank_id = new JLabel("Bank Account");
        bank_id.setSize(100, 30);
        bank_id.setLocation(50, 400);
        window.add(bank_id);

        jbank_id = new JTextField(10);
        jbank_id.setSize(160, 30);
        jbank_id.setLocation(140, 400);
        jbank_id.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String str = jbank_id.getText();
                me.add_id(str);


            }


        });
        window.add(jbank_id);



        password = new JLabel("Password");
        password.setSize(100, 30);
        password.setLocation(50, 450);
        window.add(password);

        jpassword = new JTextField(10);
        jpassword.setSize(160, 30);
        jpassword.setLocation(140, 450);

        jpassword.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
               String str1 = jpassword.getText();
                me.add_pass_(str1);

            }


        });


        window.add(jpassword);









        window.setVisible(true);


    }
}

class admin_log{
    String pass;
    String id;
    public admin_log(){};

    void add_id(String id1){
        id = id1;
    }
    void add_pass_(String p){
        pass = p;
    }
}

