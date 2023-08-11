package lesson16;

import java.util.ArrayList;
import java.util.List;

public class Consumer {
    public static void main(String[] args) {
        List<String> collectionOfList = new ArrayList<>();
        collectionOfList.add("snake");
        collectionOfList.add("alphabet");
        System.out.println(collectionOfList);

        collectionOfList.forEach(str -> System.out.printf("next element is %s\n", str)); // System.out::println();
        collectionOfList.removeIf(str -> str.startsWith("a"));

        System.out.println(collectionOfList);
    }
}
