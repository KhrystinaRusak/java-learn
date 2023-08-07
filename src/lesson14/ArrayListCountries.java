package lesson14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCountries {
    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add("Belarus");
        countries.add("Andora");
        countries.add("KNDR");

        countries.set(1, "the Ukraine");
        printList(countries);

        countries.remove(2);
        System.out.println(countries.indexOf("The Ukraine"));
        System.out.println(countries.contains("Belarus"));

        LinkedList<String> countries2 = new LinkedList<>(countries);


        countries2.addFirst("Spain");
        countries2.addLast("China");
        countries2.addFirst(("Greece"));
        printList(countries2);


    }

    private static void printList(List<String> countries) {
        for (String country : countries) {
            System.out.print(country + ", ");
        }
        System.out.println();
    }
}
