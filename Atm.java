import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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

           //bank 2
        secrect_bank = new JButton("Caiman Bank");
        secrect_bank.setSize(100,40);
        secrect_bank.setLocation(200,550);
        secrect_bank.addActionListener(new secrect_back2());
        window.add(secrect_bank);
    


        //back 3
        eu_and_asia = new JButton("EU and Asia Bank");
        eu_and_asia.setSize(150,40);
        eu_and_asia.setLocation(400,550);
        eu_and_asia.addActionListener(new eu_and_asia2());
        window.add(eu_and_asia);





		
		window.setVisible(true);
	}
	
	private class Button1Clicked implements ActionListener
	{
			public void actionPerformed(ActionEvent e)
			{
				//log in process
			}
	} 
	
	private class Button2Clicked implements ActionListener
	{
			public void actionPerformed(ActionEvent e)
			{
				//sign up process
			}
	}

    private class secrect_back2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new Caiman_bank_class();

        }
    }

    private class eu_and_asia2 implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
           new  Eu_Asia_bank_class();
        }
    }




}

class Caiman_bank_class
{
    //private JButton secrect_bank;
    //private JButton eu_and_asia;


    private JLabel message_c;;


    public Caiman_bank_class()
    {
        final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;
        //final int WINDOW_WIDTH2 = 800, WINDOW_HEIGHT2 = 700;
        JFrame c_window = new JFrame("Caiman Bank");
        Color db1 = new Color(119, 136, 159);
        Color sb1 = new Color(0, 191, 255);

        c_window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        c_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c_window.setLayout(null);
        c_window.getContentPane().setBackground(db1);
        //window.setVisible(true);

        JButton c_button1 = new JButton("Log In");
        c_button1.setSize(100, 30);
        c_button1.setLocation(250, 400);
        c_button1.addActionListener(new caimain_log());

        c_window.add(c_button1);

        JButton c_button2 = new JButton("Sign Up");
        c_button2.setSize(100, 30);
        c_button2.setLocation(400, 400);
        c_button2.addActionListener(new caimain_sign());

        c_window.add(c_button2);

        message_c = new JLabel("The Atlantic Caiman Bank");
        message_c.setSize(600, 40);
        message_c.setFont(new Font("Verdana", Font.ITALIC, 35));
        message_c.setForeground(sb1);
        message_c.setLocation(180, 230);
        c_window.add(message_c);


        JButton back = new JButton("Go Back");
        back.setSize(100,30);
        back.setLocation(0,0);
        back.addActionListener(new back_button_click());
        c_window.add(back);



        c_window.setVisible(true);


    }
    private class back_button_click implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            new Atm();
        }
    }

    private class caimain_log implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            new log_in();
        }
    }

    private class caimain_sign implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            new c_sign();
        }
    }











}

    class Eu_Asia_bank_class {



        public Eu_Asia_bank_class()
        {
            final int WINDOW_WIDTH = 800, WINDOW_HEIGHT = 700;

            JFrame e_a_window = new JFrame("Eu and Asia Bank");
            Color db2 = new Color(119, 136, 159);
            Color sb2 = new Color(0, 191, 255);

            e_a_window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
            e_a_window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            e_a_window.setLayout(null);
            e_a_window.getContentPane().setBackground(db2);


            JButton e_a_button1 = new JButton("Log In");
            e_a_button1.setSize(100, 30);
            e_a_button1.setLocation(250, 400);
            e_a_window.add(e_a_button1);

            JButton e_a_button2 = new JButton("Sign Up");
            e_a_button2.setSize(100, 30);
            e_a_button2.setLocation(400, 400);

            e_a_window.add(e_a_button2);

            JButton back = new JButton("Go Back");
            back.setSize(100,30);
            back.setLocation(0,0);
            back.addActionListener(new back_button_click());
            e_a_window.add(back);



            JLabel message_e_a = new JLabel("EU and Asia International Bank");
            message_e_a.setSize(600, 40);
            message_e_a.setFont(new Font("Verdana", Font.ITALIC, 35));
            message_e_a.setForeground(sb2);
            message_e_a.setLocation(180, 250);
            e_a_window.add(message_e_a);





            e_a_window.setVisible(true);


        }
        private class back_button_click implements ActionListener
        {
            public void actionPerformed(ActionEvent e)
            {
                new Atm();
            }
        }


    }
