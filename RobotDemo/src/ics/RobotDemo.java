package ics;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

public class RobotDemo {
    City burlington = new City();
    Robot robot = new Robot(burlington, 2, 4, Direction.EAST, 0);
    public void main(String[] args) {
        robot.move();
        robot.turnLeft();
        robot.move();
        robot.move();
        robot.move();
        robot.turnLeft();
        robot.turnLeft();
        robot.move();
    }
}
