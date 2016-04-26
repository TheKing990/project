import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.*;




public class Atm extends JFrame
{
	private JButton button1;
	private JButton button2;
	private JLabel messageLabel1;
	private JButton secrect_bank;
    private JButton eu_and_asia;
	
	public Atm()
	{
		final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;
		JFrame window = new JFrame("Bank of the Internet");
		Color db = new Color(119, 136, 159);
		Color sb = new Color(0, 191, 255);
		
		window.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(null);
		window.getContentPane().setBackground(db);
		//window.setVisible(true);
		
		button1 = new JButton("Log In");
		button1.setSize(100, 30);
		button1.setLocation(250, 400);
		button1.addActionListener(new Button1Clicked());
		window.add(button1);
		
		button2 = new JButton("Sign Up");
		button2.setSize(100, 30);
		button2.setLocation(400, 400);
		button2.addActionListener(new Button2Clicked());
		window.add(button2);
		
		messageLabel1 = new JLabel("Bank of the Internet");
		messageLabel1.setSize(410, 40);
		messageLabel1.setFont(new Font("Verdana", Font.ITALIC, 40));
		messageLabel1.setForeground(sb);
		messageLabel1.setLocation(180, 250);
		window.add(messageLabel1);





		
		window.setVisible(true);
	}
	
	private class Button1Clicked implements ActionListener
	{
			public void actionPerformed(ActionEvent e)
			{
				new log_in();
			}
	} 
	
	private class Button2Clicked implements ActionListener
	{
			public void actionPerformed(ActionEvent e)
			{
				new c_sign();
			}
	}

   




}

class log_in
{

    private JLabel bank_id;
    private JLabel password;
    private JLabel message_c;

    private JTextField jbank_id;
    private JTextField jpassword;

    log_in() {
       // admin_log me  = new admin_log();
        final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;
        JFrame window = new JFrame("Log In");
        Color db = new Color(119, 136, 159);
        Color sb = new Color(0, 191, 255);

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.getContentPane().setBackground(db);

        message_c = new JLabel("The Internet Bank");
        message_c.setSize(600, 40);
        message_c.setFont(new Font("Verdana", Font.ITALIC, 35));
        message_c.setForeground(sb);
        message_c.setLocation(180, 230);
        window.add(message_c);

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
               // me.add_id(str);


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
              //  me.add_pass_(str1);

            }


        });


        window.add(jpassword);


        

        window.setVisible(true);


    }
}


class c_sign
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


        function fuc = new function();

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
                String str1 = jfn.getText();
                fuc.add_fname(str1);

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
                String str2 = jln.getText();
                fuc.add_lname(str2);

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
                String str3 = juserp.getText();
                fuc.add_password(str3);

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
                String str4 = jid.getText();
                fuc.add_id(str4);

            }


        });
        window.add(jid);





        JButton c_button1 = new JButton("Sign Up");
        c_button1.setSize(100, 30);
        c_button1.setLocation(300, 400);
        //c_button1.addActionListener();
        c_button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                try
                {
                    fuc.add_c_bank();
                } catch (InstantiationException e1) {
                    e1.printStackTrace();
                } catch (IllegalAccessException e1) {
                    e1.printStackTrace();
                } catch (ClassNotFoundException e1) {
                    e1.printStackTrace();
                } catch (SQLException e1) {
                    e1.printStackTrace();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }

                new Atm();
            }
        });


        window.add(c_button1);






        window.setVisible(true);

    }
}






