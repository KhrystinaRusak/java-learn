package hometask10;

import java.text.MessageFormat;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Input the string from the keyword:");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        StringMethods(inputStr);
        numberOfDocument(inputStr);
    }

    public static void StringMethods(String inputStr) {
        // 1.1) Распечатать последний символ строки. Используем метод String.charAt().
        System.out.println(MessageFormat.format("The last symbol of the string {0}", inputStr.charAt(inputStr.length() - 1)));
        // Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
        System.out.println("Determines whether a string ends with the characters !!! " + inputStr.endsWith("!!!"));
        // Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
        System.out.println("The string starts with I like " + inputStr.startsWith("I like"));
        // Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
        System.out.println("The string contain the Java " + inputStr.contains("Java"));
        // Найти позицию подстроки “Java” в строке “I like Java!!!”.
        System.out.println("Find the positions " + inputStr.indexOf("Java"));
        // Заменить все символы “а” на “о”.
        System.out.println("Replace the symbols from a to o " + inputStr.replace("a", "o"));
        // Преобразуйте строку к верхнему регистру.
        System.out.println("String in the UpperCase " + inputStr.toUpperCase());
        // Преобразуйте строку к нижнему регистру.
        System.out.println("String in the LowerCase " + inputStr.toLowerCase());
        // Вырезать строку Java c помощью метода String.substring().
        System.out.print("Cut the string " + inputStr.substring(0, inputStr.length() - 1));
    }

    public static void numberOfDocument(String inputStr) {
//        На вход передать строку (будем считать, что это номер документа).
//        Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
        try {
            Integer.parseInt(inputStr);
            System.out.println(inputStr + " is valid integer of numbers");
        } catch (NumberFormatException e) {
            System.out.println(inputStr + " is not a numbers string");
        }
//        - Вывести на экран в одну строку два первых блока по 4 цифры.
//        - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
//        - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
//                - Вывести на экран буквы из номера документа в формате
//        "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
//                - Проверить содержит ли номер документа последовательность abc и вывеcти сообщение содержит или нет(причем, abc и ABC считается
//                одинаковой последовательностью).
//                - Проверить начинается ли номер документа с последовательности 555.
//          - Проверить заканчивается ли номер документа на последовательность 1a2b.
//                Все эти методы реализовать в отдельном классе в статических методах, которые на вход (входным параметром) будут принимать вводимую на вход программы строку.
    }
}
