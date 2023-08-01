package lesson15.hometask15;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.*;
import java.util.stream.Collectors;

public class task2 {
    public static void main(String[] args) {
        String[] input = {"some", "elements", "!?"};
        List<String> elements = Arrays.asList(input);
        String search = "!?";
        String results = elements.stream().filter(s -> s.equalsIgnoreCase(search)).collect(Collectors.joining(", "));
        System.out.println("The result is " + results);

        // - используя Predicate определить, содержит ли строка восклицательные знаки и не содержит ли вопросительные знаки.
        Predicate<String> p = s -> s.equalsIgnoreCase(search);
        Predicate<String> combined = p.or(s -> s.equals("!?"));
        String result = elements.stream().filter(combined).collect(Collectors.joining(", "));
        System.out.println("The result is " + result);

//  - используя Function реализовать лямбду, которая возвращает последний символ в строке.
        String str = "I feel like i'm drawing.";
        Function<String, Boolean> function = Boolean::valueOf;
        System.out.println(function.apply("TRUE"));

//  - используя Consumer реализовать лямбду, которая выводит последний символ в строке.
        Consumer<String> formatter = x -> System.out.println("The last symbol from the string " + str.substring(str.length() - 1));
        formatter.accept(str);
//  - используя UnaryOperator реализовать лямбду, которая возвращает подстроку с 1 по 3 индекс, если длина строки больше 4 и иначе null.
        UnaryOperator<String> uo = s -> str.substring(0, 2);
        //  - используя Supplier написать метод, который возвращает строку "JAVA is the BEST".
        Supplier<String> supplier = () -> {
            Scanner sc = new Scanner(System.in);
            String userInput = sc.nextLine();
            return userInput;
        };
    }
}
