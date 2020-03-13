/* Author: Matt Cruickshank
Class: ICS4U

Project: Challenge Day, Rover
Input: Strings and numbers representing commands and co-ordinates
Processing: Move the rover
Output: Current position of the rover
*/

package ics;

public class Rover {

    private int xPos;
    private int yPos;

    private boolean started;

    private RoverDirection direction;

    public Rover() {
        this(0, 0, RoverDirection.NORTH);
    }

    public Rover(int xPos, int yPos, RoverDirection direction) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.direction = direction;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public boolean isStarted() {
        return started;
    }

    public void setStarted(boolean started) {
        this.started = started;
    }

    public RoverDirection getDirection() {
        return direction;
    }

    public void setDirection(RoverDirection direction) {
        this.direction = direction;
    }

    public void start() {
        started = true;
    }

    public void stop() {
        started = false;
    }

    public void turnRight() {
        if (started) {
            if (direction == RoverDirection.NORTH) {
                direction = RoverDirection.EAST;
            } else if (direction == RoverDirection.EAST) {
                direction = RoverDirection.SOUTH;
            } else if (direction == RoverDirection.SOUTH) {
                direction = RoverDirection.WEST;
            } else {
                direction = RoverDirection.NORTH;
            }
        } else {
            System.out.println("The robot has not yet started. Please start the robot to move.");
        }
    }

    public void turnLeft() {
        if (started) {
            if (direction == RoverDirection.NORTH) {
                direction = RoverDirection.WEST;
            } else if (direction == RoverDirection.EAST) {
                direction = RoverDirection.NORTH;
            } else if (direction == RoverDirection.SOUTH) {
                direction = RoverDirection.EAST;
            } else {
                direction = RoverDirection.SOUTH;
            }
        } else {
            System.out.println("The robot has not yet started. Please start the robot to move.");
        }
    }

    public void forward() {
        forward(1);
    }

    public void forward(int n) {
        if (started) {
            if (direction == RoverDirection.NORTH) {
                yPos+=n;
            } else if (direction == RoverDirection.EAST) {
                xPos+=n;
            } else if (direction == RoverDirection.SOUTH) {
                yPos-=n;
            } else {
                xPos-=n;
            }
        }
    }

    public void printPosition() {
        switch (direction) {
            case NORTH:
                System.out.println("Current Position is (" + xPos + ", " + yPos + ") facing north.");
                break;
            case EAST:
                System.out.println("Current Position is (" + xPos + ", " + yPos + ") facing east.");
                break;
            case SOUTH:
                System.out.println("Current Position is (" + xPos + ", " + yPos + ") facing south.");
                break;
            case WEST:
                System.out.println("Current Position is (" + xPos + ", " + yPos + ") facing west.");
                break;
            default:
                System.out.println("Current Position is (" + xPos + ", " + yPos + ") facing an unknown direction.");
        }
    }
}
