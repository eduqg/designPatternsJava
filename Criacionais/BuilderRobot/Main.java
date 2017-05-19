/* A customer ordering a pizza. */
public class Main {
    public static void main(String[] args) {
        RobotBuilder oldStyle  = new OldRobotBuilder();

        RobotEngineer robotEngineer = new RobotEngineer(oldStyle);

        robotEngineer.makeRobot();

        Robot firstRobot = robotEngineer.getRobot();

        System.out.println(firstRobot.getHead());
        System.out.println(firstRobot.getTorso());

    }
}
