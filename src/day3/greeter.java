package day3;

import javax.swing.JOptionPane;

public class greeter {
	public static void main(String[] args) {
	String name=JOptionPane.showInputDialog("Whats your name?");
	System.out.println("hello "+ name );
	String age=JOptionPane.showInputDialog("How old are you?");
			System.out.println("You are "+age+" years old.");
	}

}
