
// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
	public static void main(String[]args) {
		String lname=JOptionPane.showInputDialog("What is your last name?");
		String fname=JOptionPane.showInputDialog("What is your first name?");
		String bday=JOptionPane.showInputDialog("what is your birthday and what is your gender?");
		String dest=JOptionPane.showInputDialog("Where is your destination?");
		JOptionPane.showMessageDialog(null, "Here is your bording pass and have a grate day.");
	JOptionPane.showMessageDialog(null, lname);
	JOptionPane.showMessageDialog(null, fname);
	JOptionPane.showMessageDialog(null, bday);
	JOptionPane.showMessageDialog(null, dest);
	JOptionPane.showMessageDialog(null, "Good-buy");
	}
}



/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/

