package section2;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		// 1. Create a new Robot
		Robot Bill = new Robot();
	Bill.changeRobot("https://i.kym-cdn.com/photos/images/original/001/134/408/565.png");	
		// 5. Set your robot's pen down 
		Bill.penDown();
		// 3. Set the robot to go at max speed (100)
		Bill.setSpeed(100);
		// 4. Use a for loop to repeat steps #7 to #8, 75 times
		for(int i = 0;i<1000000; i++) {
			// 7. Change the pen color to random
		Bill.setRandomPenColor();
			// 6. Move the robot 5 times the loop counter (5*i)
		Bill.move(101/100*i);
			// 2. Turn the robot 360/7 degrees to the right
		Bill.turn(360/7);
			// 8. Set the pen width to i
		Bill.setPenWidth(i);	
	}	
}
}