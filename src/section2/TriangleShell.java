package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
Robot Joe = new Robot();
	
	void go() {
		
		Joe.changeRobot("https://tr.rbxcdn.com/39a0f17caecc92d3addf77ec05227921/420/420/Hat/Png");

		Joe.penDown();
		// 6. Make the robot go as fast as possible
		Joe.setSpeed(100);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int length = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
for(int i = 0; i<60;i++) {
			// 9. Change the color of the pen to a random color
	Joe.setPenWidth(25);
	Joe.setRandomPenColor();
			// 8. Increase the length variable by 10
	 length = length + 50;
			// 5. call your drawTriangle() method using your length variable
	drawTriangle(length);
			// 10. Turn the robot 6 degrees to the right
		Joe.turn(6);
		}	
	}

	/* 2. fill in the method below to draw a triangle. Use the length variable when you call move(). */
	private void drawTriangle(int length) {
		
		Joe.turn(120);
		Joe.move(length);
		Joe.turn(120);
		Joe.move(length);
		Joe.turn(120);
		Joe.move(length);
		
		
	}

	
	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
