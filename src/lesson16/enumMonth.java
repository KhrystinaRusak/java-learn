package lesson16;

import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class enumMonth {
    public static void main(String[] args) {
        Map<Month, Integer> numOfDaysInMonths = new HashMap<>();
        numOfDaysInMonths.put(Month.MARCH, 31);
        numOfDaysInMonths.put(Month.OCTOBER, 30);
        numOfDaysInMonths.compute(Month.MARCH, (key, value) -> value * 3);
        numOfDaysInMonths.computeIfPresent(Month.MARCH, (key, value) -> value * 3);
        System.out.println(numOfDaysInMonths);

        Random random = new Random();
        Month[] months = Month.values();
        for (Month month : months) {
            numOfDaysInMonths.computeIfAbsent(month, key -> random.nextInt(1, 31));
        }


    }
}
