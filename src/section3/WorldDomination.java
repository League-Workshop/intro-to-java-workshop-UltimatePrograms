package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
		String code = JOptionPane.showInputDialog("Do you know code.");
		// 2. If they say "yes", tell them they will rule the world.
		if (code.equalsIgnoreCase("yes")) {
			speak("You will rule the world.");

		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			speak("I wish you good luck washing dishes.");

		}
	}

static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	}
	 catch (Exception e) {
		 e.printStackTrace();
	 }
}
}