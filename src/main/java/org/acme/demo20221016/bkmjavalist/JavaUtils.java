package org.acme.demo20221016.bkmjavalist;

import java.math.BigDecimal;
import java.util.List;

public class JavaUtils {
    private JavaUtils() {
        // only static method
    }

    // for better type safety integrating to/from DMN, you might consider alternatively Java array, e.g.: BigDecimal[], instead of List.
    public static BigDecimal sum(List<BigDecimal> numbers) {
        return numbers.stream().reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
