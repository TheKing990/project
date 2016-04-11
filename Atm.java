import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;



/*
 * kasjflajfjalksfjlasjfjaf
 * fanklsflasjfjasfas
 * jflajfalksjflasjf
 * fajflasjflajsflajs
 * jfajsflkajfjaslkfjlas
 * jfjalfjslfjlksajfklasjfksajfoksfjlkasjf
 */

public class Atm {
	private JButton button1;
	private JButton button2;
	private JLabel messageLabel1;
	
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
	
	public static void main(String [] args)
	{
		new Atm();
	}
}

