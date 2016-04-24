import java.io.*;
import java.util.Scanner;
import java.sql.*;


public class Project extends MenuBeta 
{ //START OF MAIN CLASS

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, IOException
	{ //START OF MAIN FUNCTION
		
		System.out.println("Welcome to the bank of the Internet!");
		System.out.println();
		System.out.println();	
		System.out.println("Do you have an account with us? (Enter yes for login ");
		System.out.print(" or no for registration: ");
		
		//.........General variables..................................
		String answer;
		//MenuBeta obj2 = new MenuBeta();
		Scanner in = new Scanner(System.in);
		answer = in.nextLine(); //grab user response
		Boolean loop = true;
		//............................................................
		
		while (loop) //make sure user gives appropriate response (main loop)
		{ //START OF WHILE LOOP (Appropriate response)
			if (answer.equals("yes") || answer.equals("YES") || answer.equals("Yes")) //user has an account, so proceed with login
				{ //START OF MAIN IF
				
				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&
				// Create a named constant for the URL.
				// NOTE: This value is specific for Java DB.
				final String DB_URL = "jdbc:mysql://localhost:3306/projectdata";
				Class.forName("com.mysql.jdbc.Driver").newInstance(); 

				try
				{
					// Create a connection to the database.
					Connection connection = DriverManager.getConnection(DB_URL ,"root", "qwer1234"); 
					System.out.println("Connection created to ProjectData.");

					// Create a Statement object.
					Statement stmt = connection.createStatement();
					
					loginProcessAndMainFunction(stmt);
					
					connection.close();
					System.out.println("Connection closed.");
				}

				//Else if connection not established
				catch(Exception ex) 
				{
					System.out.println("ERROR: " + ex.getMessage());
				}
				loop = false; //break out of loop (main loop)
				//&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&

			}//END OF MAIN IF 

			else if (answer.equals("no") || answer.equals("No") || answer.equals("NO"))
			{//-------Walkthrough registration---------------------------------------------------------------------------------------------
				//START OF MAIN ELSE IF	
				ResultSet result3;
				final String DB_URL = "jdbc:mysql://localhost:3306/projectdata"; //database location

				Class.forName("com.mysql.jdbc.Driver").newInstance(); 

				try
				{
					// Create a connection to the database.
					Connection connection = DriverManager.getConnection(DB_URL ,"root", "Ip25252525"); 
					System.out.println("Connection created to ProjectData.");
					// Create a Statement object.
					Statement stmt = connection.createStatement();
					registrationProcess(stmt);
					
					//keyboard.close();
					connection.close();
					System.out.println("Connection closed.");
				}

				//Else if connection not established
				catch(Exception ex) 
				{
					System.out.println("ERROR: " + ex.getMessage());
				}
				loop = false; //break out of main loop
				//----Walkthrough registration----------------------------------------------------------------------------

			} //END OF MAIN ELSE IF

			else
			{ //START OF MAIN ELSE
				System.out.print("Incorrect response. Please try again...: ");
				answer = in.nextLine();
			} //END OF MAIN ELSE

		} //END OF WHILE LOOP (Appropriate response loop)
		
		
	}//END OF MAIN FUNCTION

}//END OF MAIN CLASS
