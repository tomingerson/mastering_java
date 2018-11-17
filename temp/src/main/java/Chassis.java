/**
 * @author Created by ergouser on 16.11.18.
 */
public class Chassis {
    private final String differential;
    private final Engine enginge;

    public Chassis(String differential, String rpm, String torque, String power) {
        this.differential = differential;
        this.enginge = new Engine(rpm, torque, power);
    }

    public String getDifferential() {
        return differential;
    }

    public Engine getEnginge() {
        return enginge;
    }
}
