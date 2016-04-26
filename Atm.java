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
        function fuc2 = new function();
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



        bank_id = new JLabel("ID");
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
              fuc2.search_id(str);
		

            }


        });
        window.add(jbank_id);



        password = new JLabel("Pin");
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
                fuc2.search_pin(str1);

            }


        });


        window.add(jpassword);






        JButton c_button1 = new JButton("Sign in");
        c_button1.setSize(100, 30);
        c_button1.setLocation(300, 400);
        c_button1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                boolean log_or_not = fuc2.log_return();
                if(log_or_not == true){
                    new userMenu(jbank_id.getText(), jpassword.getText());
        	    window.dispose();	
                   // new Atm();
                }
            }
        });
        window.add(c_button1);





        window.setVisible(true);


    }
}


class c_sign
{
    private JLabel fname;
    private JLabel lname;
    private JLabel mname;
    private JLabel id;
    private JLabel user_pass;
    private JLabel pin;


    private JTextField jfn;
    private JTextField jln;
    private JTextField jmn;
    private JTextField jp;
    private JTextField juserp;
    private JTextField jid;


    private JLabel message_c;

    private JTextField jbank_id;
    private JTextField jpassword;

    c_sign(){


        function fuc = new function();

        final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;
        JFrame window = new JFrame("Sign UP");
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






        mname = new JLabel("Middle Name");
        mname.setSize(100, 30);
        mname.setLocation(50, 250);
        window.add(mname);


        jmn= new JTextField(10);
        jmn.setSize(160, 30);
        jmn.setLocation(140, 250);
        jmn.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String str8 = jmn.getText();
                fuc.add_mname(str8);

            }


        });
        window.add(jmn);










        lname= new JLabel("Last Name");
        lname.setSize(100, 30);
        lname.setLocation(50, 280);
        window.add(lname);


        jln= new JTextField(10);
        jln.setSize(160, 30);
        jln.setLocation(140, 280);
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


        pin= new JLabel("Pin");
        pin.setSize(100, 30);
        pin.setLocation(50, 340);
        window.add(pin);


        jp= new JTextField(10);
        jp.setSize(160, 30);
        jp.setLocation(140, 340);
        jp.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
                String str3 = jp.getText();
               fuc.add_pin(str3);

            }


        });
        window.add(jp);











        //id


        id= new JLabel("ID");
        id.setSize(100, 30);
        id.setLocation(50, 310);
        window.add(id);


        jid= new JTextField(10);
        jid.setSize(160, 30);
        jid.setLocation(140, 310);
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
    
    class userMenu
{
    private JLabel message_c;
    
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;

    userMenu(String id, String pin) {
    	
    	function f = new function();
    	
        final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;
        JFrame window = new JFrame("User Menu");
        Color db = new Color(119, 136, 159);
        Color sb = new Color(0, 191, 255);

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.getContentPane().setBackground(db);

        System.out.println(id + " " + pin);
        
       	String str = "";
		try {
			str = f.getWelcomeInfo(id,  pin);
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
        
        message_c = new JLabel(str);
        message_c.setSize(700, 50);
        message_c.setFont(new Font("Verdana", Font.ITALIC, 35));
        message_c.setLocation(180, 200);
        window.add(message_c);
        
        button1 = new JButton("Account Summary");
		button1.setSize(200, 30);
		button1.setLocation(250, 250);
		button1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						//new log_in();
						//Account Summary
						
						window.setVisible(false);
						String summary = "";
						try {
							summary = f.getAccountInfo(id, pin);
						} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
								| SQLException e1) {
							e1.printStackTrace();
						}
						
						JOptionPane.showMessageDialog(null,
								 summary,
								 "Account Summary",
								 JOptionPane.PLAIN_MESSAGE); 
						window.setVisible(true);
					
					}
				});
		window.add(button1);
        
		button2 = new JButton("Withdrawel");
		button2.setSize(200, 30);
		button2.setLocation(250, 300);
		button2.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
						//user user id to change password
						//Prompt with balance and prompt
						String balance = "";
						try {
							balance = f.getBalance(id, pin);
						} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
								| SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						String wAmnt = JOptionPane.showInputDialog(null, "Balance: " + balance +"\nWithdraw: ", "0.0"); 
				        	double num = Double.parseDouble(wAmnt);
						
						try {
							f.withdraw(num, id, pin);
						} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
								| SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
		window.add(button2);
		
		button3 = new JButton("Deposit");
		button3.setSize(200, 30);
		button3.setLocation(250, 350);
		button3.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						//new log_in();
						//window.dispose();
						String balance = "";
						try {
							balance = f.getBalance(id, pin);
						} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
								| SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						String wAmnt = JOptionPane.showInputDialog(null, "Balance: " + balance +"\nDeposit: ", "0.0"); 
				        double num = Double.parseDouble(wAmnt);
						
						try {
							f.deposit(num, id, pin);
						} catch (InstantiationException | IllegalAccessException | ClassNotFoundException
								| SQLException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					}
				});
		window.add(button3);
		
		button4 = new JButton("Current Session Log");
		button4.setSize(200, 30);
		button4.setLocation(250, 400);
		button4.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						new log_in();
						window.dispose();
					
					}
				});
		window.add(button4);
		
		button5 = new JButton("Transfer Funds");
		button5.setSize(200, 30);
		button5.setLocation(250, 450);
		button5.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						
					//	window.setVisible(false);
						new transfer(id, pin);
						//window.setVisible(true);
					}
				});
		window.add(button5);

		button6 = new JButton("Log Off");
		button6.setSize(200, 30);
		button6.setLocation(250, 500);
		button6.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{//Already Works
						new log_in();
						window.dispose();
					
					}
				});
		window.add(button6);
       // display();
        
        
        window.setVisible(true);
    }
}

class transfer
{
    
    private JButton button1;
    private JTextField t1;
    private JTextField t2;

    transfer(String id, String pin) {
    	
    	function f = new function();
    	
        final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;
        JFrame window = new JFrame("Transfer Funds");
        Color db = new Color(119, 136, 159);
       // Color sb = new Color(0, 191, 255);

        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLayout(null);
        window.getContentPane().setBackground(db);
        
        t1 = new JTextField(10);
        t1.setSize(160, 30);
        t1.setLocation(400, 350);
        t1.setText("0.0");
        t1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
               //Get $amnt
 

            }


        });
        window.add(t1);
        
        t2 = new JTextField(10);
        t2.setSize(160, 30);
        t2.setLocation(400, 250);
        t2.setText("id");
        t2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent arg0)
            {
               //Get other user id
 

            }


        });
        window.add(t2);
        
        button1 = new JButton("Transfer");
		button1.setSize(100, 30);
		button1.setLocation(250, 400);
		button1.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent e)
					{
						//new log_in();
						window.dispose();
						//transfer function
		
							try {
								f.transferFunds(id, pin, Double.parseDouble(t1.getText()), t2.getText());
							} catch (NumberFormatException | InstantiationException | IllegalAccessException
									| ClassNotFoundException | SQLException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
							}
				
					}
				});
		window.add(button1);
        
        window.setVisible(true);
    }
}
}






