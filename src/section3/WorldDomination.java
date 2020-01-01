package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String answer = JOptionPane.showInputDialog(null, "Are you friends with Putin?");
		// 2. If they say "yes", tell them they will rule the world.
if(answer.contentEquals("yes")
		) {
	JOptionPane.showMessageDialog(null, "Prepare to take over the world");
	}
else {
	JOptionPane.showMessageDialog(null, "Prepare to spend your life washing dishes");
	}
}
		// 3. Otherwise, wish them good luck washing dishes.

	}


