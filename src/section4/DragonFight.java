package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Put all of the game code inside the main method (below) 
	public static void main(String[] args) {
		
		ImageIcon Kermit = new ImageIcon("src/Kermit .jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the ferocious Kermit to take its treasure!", "Person", 0, Kermit);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
	int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
	int dragonHealth = 300;
		// 4. Create a variable to hold the damage the player's attack does each round
	int playerDamage = 20;
		// 5. Create a variable to hold the damage the dragon's attack does each round
	int dragonDamage = 10;
	
	Random rand = new Random();
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
			Kermit = new ImageIcon("src/Kermit .jpg");
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String answer = JOptionPane.showInputDialog("Do you want to yell, kick, throw mud, or use ninja stars?");
		// 9. If they typed in "yell":
		if(answer.equals ("yell") ) {
			//-- Find a random number between 0 and 10 and store it in dragonDamage
			dragonDamage = rand.nextInt(10+1);
			//-- Subtract that number from the dragon's health variable 
			dragonHealth = dragonHealth - dragonDamage;
			JOptionPane.showMessageDialog(null, "Kermit is at " + dragonHealth + " health.");
		}
		
		// 10. If they typed in "kick":
		if(answer.contentEquals("kick") ) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			dragonDamage = rand.nextInt(15-10+1) + 5;
			//-- Subtract that number from the dragon's health variable
			dragonHealth = dragonHealth - dragonDamage;
			JOptionPane.showMessageDialog(null, "Kermit is at " + dragonHealth + " health.");
		}
		
		if(answer.contentEquals("throw mud") ) {
			dragonDamage = rand.nextInt(30 + 1);
			dragonHealth = dragonHealth - dragonDamage;
			JOptionPane.showMessageDialog(null, "Kermit is at " + dragonHealth + " health.");
		}
		
		if(answer.contentEquals("use ninja stars") ) {
			dragonHealth = dragonHealth / 12/10;
			JOptionPane.showMessageDialog(null, "Kermit is at " + dragonHealth + " health.");
		}
		
		if(answer.contentEquals("shoot gun") ) {
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			dragonDamage = rand.nextInt(99999);
			//-- Subtract that number from the dragon's health variable
			dragonHealth = dragonHealth - dragonDamage;
			JOptionPane.showMessageDialog(null, "Kermit is at 0 health.");
		}
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		playerDamage = rand.nextInt(10+1);
		// 12. Subtract this number from the player's health
		playerHealth = playerHealth - playerDamage;
		JOptionPane.showMessageDialog(null, "You are at " + playerHealth + " health.");
		
		
		
		// 13. If the user's health is less than or equal to 0
		if(playerHealth <= 0) {
			//-- Tell the user that they lost
			JOptionPane.showMessageDialog(null, "you lose! Kermit the frog eats you for dinner.");
		}
		// 14. Else if the dragon's health is less than or equal to 0
		if(dragonHealth <= 0) {
			JOptionPane.showMessageDialog(null, "you win! You feel guilty for killing Kermit the frog.");
		}
			//-- Tell the user that the dragon is dead and they took a ton of gold!
			
	   //  15.  Else
			
			//-- Pop up a message that tells the their current health and the dragon's currently health (Bonus: Also display the amount of health that was lost for each player this round)
			
		}
	}
	
}

