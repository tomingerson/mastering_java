package session8;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Demo of Arrays, increasing in size
 *
 * @author Created by tom on 20.10.2018.
 */
class RandomCollection {

    private SecureRandom sr = new SecureRandom();

    /**
     * collect random ints between 0 and 100 into an array until X percent of the
     * content is larger than 50.
     *
     * @param percent how many percent of the collected content should be above 50
     * @return array of ints between 0 and 100 filled with at least {@code percent}
     * numbers larger than 50
     */
    Integer[] collectRandomNumbersArr(Double percent) {
        Integer[] result = new Integer[1];
        result[0] = sr.nextInt(101);

        while (!checkValuesLarger50(result, percent)) {
            result = Arrays.copyOf(result, result.length + 1);
            result[result.length - 1] = sr.nextInt(101);
        }

        return result;
    }

    private boolean checkValuesLarger50(Integer[] toCheck, Double percent) {
        long count50 = 0L;
        for (Integer value : toCheck) {
            if (value > 50) {
                count50++;
            }
        }
        return ((double) count50 / toCheck.length * 100.0) >= percent;
    }

    /**
     * collect random ints between 0 and 100 into a list until X percent of the
     * content is larger than 50.
     *
     * @param percent how many percent of the collected content should be above 50
     * @return List of ints between 0 and 100 filled with at least {@code percent}
     * numbers larger than 50
     */
    List<Integer> collectRandomNumbersLi(Double percent) {
        List<Integer> result = new ArrayList<>();
        result.add(sr.nextInt(101));

        while (!checkValuesLarger50(result, percent)) {
            result.add(sr.nextInt(101));
        }
        return result;
    }

    private boolean checkValuesLarger50(List<Integer> toCheck, Double percent) {
        long count50 = 0L;
        for (Integer value : toCheck) {
            if (value > 50) {
                count50++;
            }
        }
        return ((double) count50 / toCheck.size() * 100.0) >= percent;
    }

    void xxx(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            Integer element = list.get(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer element = iterator.next();
        }

        for (Integer element : list) {
        }
    }
}
