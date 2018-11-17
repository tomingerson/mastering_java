/**
 * @author Created by ergouser on 16.11.18.
 */
public class Wheel {
    private final String tire;
    private final String rim;

    public Wheel(String tire, String rim) {
        this.tire = tire;
        this.rim = rim;
    }

    public String getTire() {
        return tire;
    }

    public String getRim() {
        return rim;
    }
}
