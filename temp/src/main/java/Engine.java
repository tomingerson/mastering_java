/**
 * @author Created by ergouser on 16.11.18.
 */
public class Engine {
    private final String rpm;
    private final String torque;
    private final String power;

    public Engine(String rpm, String torque, String power) {
        this.rpm = rpm;
        this.torque = torque;
        this.power = power;
    }

    public String getRpm() {
        return rpm;
    }

    public String getTorque() {
        return torque;
    }

    public String getPower() {
        return power;
    }
}
