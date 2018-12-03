package de.fh_kiel.mastering_java.streams.lecture;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Collecting statistical data using downstream collectors.
 *
 * @author Created by tom on 03.12.2018.
 */
public class Statistics {
    Map<CollectorsShowcase.Address, Optional<CollectorsShowcase.Person>> oldestByAddress() {
        return new CollectorsShowcase().getDetectives().stream()
                .collect(
                        Collectors.groupingBy(
                                CollectorsShowcase.Person::getAddress,
                                Collectors.maxBy(Comparator.comparingInt(CollectorsShowcase.Person::getAge))
                        )
                );
    }

    Double average() {
        return IntStream.range(0, 10).boxed()
                .collect(
                        Collectors.averagingInt(Integer::intValue)
                );
    }
}
