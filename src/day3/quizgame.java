package day3;

import javax.swing.JOptionPane;

public class quizgame {
	public static void main(String[] args) {
		int score=0;
		String question1 = JOptionPane.showInputDialog("What is the core of Harry Potter's wand? ");
		if (question1.equals("phoenix feather")) {
			JOptionPane.showMessageDialog(null, "impressive");
score+=10;
		} else {
			JOptionPane.showMessageDialog(null, "wrong, the answer is phoenix feather.");
		}
		String question2 = JOptionPane.showInputDialog("What is the name of Harry Potter's parents?Put the mom first and include thier last name. ");
		if (question2.equals("Lily and James Potter")) {
			JOptionPane.showMessageDialog(null, "perfect");
score+=10;
		} else {
			JOptionPane.showMessageDialog(null, "wrong, the answer is Lily and James Potter");
		}
		String question3 = JOptionPane.showInputDialog("What is the full name of the wizard who told Harry Potter he was a wizard?");
		if (question3.equals("Rubeus Hagrid")) {
			JOptionPane.showMessageDialog(null, "how do you do it? ");
score+=10;
		} else {
			JOptionPane.showMessageDialog(null, "wrong, the correct answer is Rubeus Hagrid");
		}
		String question4 = JOptionPane.showInputDialog("What is the name of the creature which pulls the carigesat Hogwarts and only people who have seen death can see?");
		if (question4.equals("threastrials")) {
			JOptionPane.showMessageDialog(null, "exalent");
score+=10;
		} else {
			JOptionPane.showMessageDialog(null, "incorrect, the real answer in threastrials");
		}
		String question5 = JOptionPane.showInputDialog(
				"Whats the name of the evil wizard which curses Harry Potter? Use his real name, his fake name, and the name his followers call him.(in this order)");
		if (question5.equals("Tom Riddle, Lord Voldemort,and The Dark Lord")) {
			JOptionPane.showMessageDialog(null, "amazing");
score+=150;
		} else {
			JOptionPane.showMessageDialog(null, "sorry the answer is Tom Riddle, Lord Voldemort,and The Dark Lord");
		}
		
		JOptionPane.showMessageDialog(null, "Your score is "+ score);
	}
}
