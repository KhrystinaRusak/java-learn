package lesson16;

import java.util.List;

public class StreamString {
    public static void main(String[] args) {
        // Stream<String> stream1 = Stream.of("str1", "str2", "str3");
        List<String> list = List.of("Sin", "Cos", "FIRE");
        list
                .forEach(System.out::println);
        list.stream()
                .filter(str -> str.startsWith("A"))
                //.count()
                .map(str -> "STRING: " + str)
                .forEach(System.out::println);

        System.out.println();

        list.stream().distinct()
                .forEach(System.out::println);

        System.out.println();

//        list.stream().sorted((s1, s2) -> {
//            s1.charAt(s1.length()-1) - s2.charAt(s2.length() -1);
//                }).limit(3)
//                .forEach(System.out::println);
    }
}
