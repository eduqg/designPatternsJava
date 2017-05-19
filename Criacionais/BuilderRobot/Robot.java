public class Robot implements RobotPlan {
    private String head;
    private String torso;

    public void setHead(String head) {
        this.head = head;
    }
    public void setTorso(String torso) {
        this.torso = torso;
    }
    public String getHead() {
        return this.head;
    }
    public String getTorso() {
        return this.torso;
    }
}