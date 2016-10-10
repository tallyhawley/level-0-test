import javax.swing.JOptionPane;

/**
 * Write a program that asks the user for their age. 
 * Tell them which year they were born. 
 * If they are over 30, tell them they are too old to play this game.
 **/

public class CodingExercise2 {
	public static void main(String[] args){
		String strage = JOptionPane.showInputDialog("Let's play a game. How old are you?");
		int age = Integer.parseInt(strage);
		if(age>30){
			JOptionPane.showConfirmDialog(null, "You are too old to play this game.");
		}
		else{
			JOptionPane.showConfirmDialog(null, "I lied. There is no game.");
		}
	}
}
