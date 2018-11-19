package de.fh_kiel.mastering_java.patterns.immutable;

import java.util.Date;
import java.util.StringJoiner;

/**
 * Demo on how to change the state of an object from outside the object's scope.
 *
 * @author Created by tom on 19.11.2018.
 */
class DateHack {

    private final Date date;

    DateHack(Date date) {
        this.date = date;
    }

    public static void main(String[] args) {
        DateHack dh = new DateHack(new Date());
        dh.getDate().setTime(1111111L);

        System.out.println(dh);
    }

    Date getDate() {
        return new Date(date.getTime());
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", DateHack.class.getSimpleName() + "[", "]")
                .add("date=" + date)
                .toString();
    }

}
