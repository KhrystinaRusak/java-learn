package lesson15;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class IntroductionOfTime {
    public static void main(String[] args) {
        /*Date date = new Date();
        System.out.println(date);
        SimpleDateFormat dateFormat = new SimpleDateFormat("EE");
        System.out.println(dateFormat.format(date));
        Date dateInWeek = new Date(date.getTime() + 7*24*60*60*1000);
        System.out.println(dateInWeek);*/

        LocalDateTime dateTime = LocalDateTime.now();

        System.out.println(dateTime.getDayOfWeek());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMM yyyy");
        System.out.println(dateTimeFormatter);
    }
}
