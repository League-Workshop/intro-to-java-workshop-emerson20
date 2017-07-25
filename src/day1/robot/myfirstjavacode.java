package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class myfirstjavacode {
public static void main(String[] args) {
	Robot putt =new Robot();
	putt.penDown();
	putt.setSpeed(10);
	putt.setPenWidth(10);
	for(int i=0; i<4; i++){
		putt.setRandomPenColor();
		putt.move(150);
		putt.turn(90);
	}
}
}
