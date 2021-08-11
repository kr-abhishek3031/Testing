package exceptionHandling;

public class mainFile extends Exception {
    public static void main(String[] args) throws InvalidDirection {
        robot newRobot = new robot();
        newRobot.updateY(10);
        if (newRobot.getyC() != 0) {

            // throw an object of user defined exception
            throw new InvalidDirection("Invalid direction");
        } else {
            System.out.println("Moving in right direction");
        }
    }
}