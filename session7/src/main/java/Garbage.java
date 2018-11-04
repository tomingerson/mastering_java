

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author Created by ergouser on 17.10.18.
 */
public class Garbage {

    private static Map<Integer, byte[]> GARBAGE = new HashMap<>();

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            byte[] randomBytes = UUID.randomUUID().toString().getBytes();
            GARBAGE.put(i, randomBytes);
        }
    }
}
