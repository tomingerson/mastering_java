package de.fh_kiel.mastering_java.patterns.builder;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

/**
 * @author Created by tom on 18.11.2018.
 */
public class UserMain {

    User_Plain createUserPlain_1() {
        return new User_Plain("Doe", "John", LocalDate.of(1990, Month.AUGUST, 3));
    }

    User_Plain createUserPlain_2() {
        return new User_Plain("Doe", "John", "swordfish", true);
    }

    User_Plain createUserPlain_3() {
        return new User_Plain("Doe", "John", "swordfish", true, false, true,
                LocalDate.of(1990, Month.AUGUST, 3), LocalDateTime.of(2018,
                Month.NOVEMBER, 21, 18, 45));
    }

    User_Builder_Plain createUserBuilder() {
        return new User_Builder_Plain.UserBuilderImpl("Doe", "John",
                LocalDate.of(1990, Month.AUGUST, 3)).setActive(true)
                .setAdmin(true).setMarried(false).setPassword("swordfish")
                .setRegistered(LocalDateTime.of(2018, Month.NOVEMBER, 21, 18, 45))
                .build();
    }

    User_Builder_Fluent createUserBuilderFluent() {
        return new User_Builder_Fluent.UserBuilderImpl("Doe", "John",
                LocalDate.of(1990, Month.AUGUST, 3)).active(true)
                .admin(true).married(false).password("swordfish")
                .registered(LocalDateTime.of(2018, Month.NOVEMBER, 21, 18, 45))
                .build();
    }
}
