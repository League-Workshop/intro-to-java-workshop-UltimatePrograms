package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		Robot BB8 = new Robot();
		BB8.setPenColor(Color.BLUE);
		BB8.penDown();
		BB8.miniaturize();
		BB8.setSpeed(999);
		for (int i = 0; i < 4; i++) {
			BB8.move(100);
			BB8.turn(90);
		}
	}
}
