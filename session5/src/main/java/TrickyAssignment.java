
/**
 * @author Created by ergouser on 10.10.18.
 */
public class TrickyAssignment {
    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            Integer i1 = i;
            Integer i2 = i;
            System.out.println("" + i + " == " + i + ": " + (i1 == i2));
        }
    }
}
