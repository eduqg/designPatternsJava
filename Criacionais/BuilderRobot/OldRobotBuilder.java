public class OldRobotBuilder implements RobotBuilder {
    private Robot robot;

    public OldRobotBuilder() {
        this.robot = new Robot();
    }
    public void buildHead() {
        robot.setHead("Iron Head");
    }
    public void buildTorso() {
        robot.setTorso("Tin Torso");
    }
    public Robot getRobot() {
        return this.robot;
    }
}