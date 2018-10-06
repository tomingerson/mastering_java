package session4.lecture;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class InitBlock {

    static List list = new ArrayList();

    static {
        Random sr = new SecureRandom();
        for (int i = 0; i < 100; i++) {
            list.add(sr.nextLong());
        }
    }
}
