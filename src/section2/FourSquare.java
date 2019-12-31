package section2;

import java.awt.Color;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;



public class FourSquare {
	
	// 2. Create a new Robot
Robot Billy = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
Billy.setSpeed(101);
		// 5. Set the pen width to 5
Billy.penDown();
Billy.setPenWidth(100);
		// 6. Use a for loop to repeat steps #7 to #8, four times...
 for(int i = 0; i<9999999; i++) {
			// 7. Set the pen color to random
	Billy.setPenColor(Color.yellow);
			// 1. Call the drawSquare() method
	drawSquare();
			// 8. Turn the robot 90 degrees to the right
Billy.turn(5);} 

 }

	
	void drawSquare() {

		/* 3. Fill in the code to draw a square inside the method below. */
		Billy.move(200);
		Billy.turn(90);
		Billy.move(200);
		Billy.turn(90);
		Billy.move(200);
		Billy.turn(90);
		Billy.move(200);
		Billy.turn(90);
		
		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



