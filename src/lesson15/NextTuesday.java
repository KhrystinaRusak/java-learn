package lesson15;

import java.time.LocalDate;

public class NextTuesday {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        // date.plusDays(8);
        int numOfDay = date.getDayOfWeek().ordinal() + 1;
        int daysTillEndOfWeek = 7 - numOfDay;
        System.out.println(numOfDay);
        System.out.println(daysTillEndOfWeek);
    }
}
