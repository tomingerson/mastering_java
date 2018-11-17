/**
 * @author Created by ergouser on 16.11.18.
 */
class NissanFactory {
    NissanGTR buildNissanGTRNismo() {
        //return Car
        String differential = "differential";
        String rpm = "7000";
        String power = "441";
        String torque = "652";
        String tire = "285/";
        String rim = "10,5x20";

        return new NissanGTR(differential, rpm, torque, power, tire, rim);
    }

    NissanGTR buildNissanGTRBlack() {
        //return Car
        String differential = "differential";
        String rpm = "7000";
        String power = "441";
        String torque = "657";
        String tire = "285/";
        String rim = "10,5x20";

        return new NissanGTR(differential, rpm, torque, power, tire, rim);
    }
}
