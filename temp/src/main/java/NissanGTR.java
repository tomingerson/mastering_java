class NissanGTR {
    private final Chassis chassis;
    private final Wheel wheel_front_left;

    public NissanGTR() {
        this.chassis = new Chassis("differential", "7000", "657", "441");
        this.wheel_front_left = new Wheel("225/ZR20", "10,5x20");
    }

    public NissanGTR(String differential, String rpm, String torque, String power, String tire, String rim) {
        this.chassis = new Chassis(differential, rpm, torque, power);
        this.wheel_front_left = new Wheel(tire, rim);
    }

    public Chassis getChassis() {
        return chassis;
    }

    public Wheel getWheel_front_left() {
        return wheel_front_left;
    }
}