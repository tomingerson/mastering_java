package de.fh_kiel.mastering_java.streams.lecture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Showcase of breaking functionality.
 *
 * @author Created by tom on 03.12.2018.
 */
public class Breaks {

    private static void breaks() {
        List<Integer> underlyingList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));

        underlyingList.stream()
                .map(i -> 2 * i)
                .forEach(underlyingList::add);
    }

    private static List<String> nullpointer() {
        var list = List.of("one", null, "three");
        return list.stream().filter(s -> s.length() > 0).collect(Collectors.toList());
    }

    private static Predicate<String> isBad() throws MyException {
        throw new MyException();
    }

    private static Predicate<String> isGood() {
        return s -> s.length() > 0;
    }

    private static List<String> errorhandle() {
        return List.of("one", "two", "three").stream()
                .filter(Objects::nonNull).filter(isGood())
                .filter(s -> {
                            try {
                                return isBad().test(s);
                            } catch (MyException ex) {
                                ex.printStackTrace();
                            }
                            return false;
                        }
                ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        //breaks();
        //System.out.println(nullpointer());
        //System.out.println(errorhandle());
    }


    private static class MyException extends Exception {
    }
}
