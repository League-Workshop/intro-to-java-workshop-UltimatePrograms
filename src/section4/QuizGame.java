package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		Integer score = 0;

		// 2. Ask the user a question
		String ans = JOptionPane.showInputDialog("What is Harry Potter's middle name?.");
		// 3. Use an if statement to check if their answer is correct
		if (ans.equalsIgnoreCase("james")) {
			speak("correct");
			score++;
		} else {
			speak("incorrect");
			score = 0;

		}
		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.
// 3. Use an if statement to check if their answer is correct
		// 6. After all the questions have been asked, print the user's score
		String q = JOptionPane.showInputDialog("Who is the grimm?");
		
		if (q.equalsIgnoreCase("sirius")) {
			speak("correct");
			score++;
		} else {
			speak("incorrect");
			score = 0;
		}
String r = JOptionPane.showInputDialog("What is madam promfrey's first name?");
		
		if (r.equalsIgnoreCase("Poppy")) {
			speak("correct");
			score++;
		} else {
			speak("incorrect");
			score = 0;
		}
		
		speak (score.toString());
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}