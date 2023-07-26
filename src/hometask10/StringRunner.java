package hometask10;

import java.util.Scanner;

public class StringRunner {
    private static String inputString;

    public static void main(String[] args) {
        System.out.println("Input the string: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.next();
        StringMethods(inputString);
        getNumberOfDocument(inputString);
    }

    public static String StringMethods(String inputString) {
        System.out.println("Using method endsWith " + inputString.charAt(inputString.length() - 1));
        System.out.println("Using method endsWith " + inputString.endsWith("!!!"));
        System.out.println("Using method startsWith " + inputString.startsWith("I like"));
        System.out.println("Using method contains " + inputString.contains("Java"));
        System.out.println("Using method indexOf " + inputString.indexOf("I like Java!!!"));
        System.out.println("Using method replace " + inputString.replace("a", "o"));
        System.out.println("Using method toUpperCase " + inputString.toUpperCase());
        System.out.println("Using method toLowerCase " + inputString.toLowerCase());
        System.out.println("Using method substring " + "Java".substring(0, 3));
        return inputString;
    }

    public static String getNumberOfDocument(String inputString) {
//        Номер документа имеет формат xxxx-yyy-xxxx-yyy-xyxy, где x — это число, а y — это буква.
        inputString.format(inputString);
        int x = 0;
        char y = ' ';
//        - Вывести на экран в одну строку два первых блока по 4 цифры.
        System.out.println("The first two blocks of numbers " + inputString.indexOf(x, 4));
//        - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
//        - Вывести на экран только одни буквы из номера документа в формате
//        yyy/yyy/y/y в нижнем регистре.
//                - Вывести на экран буквы из номера документа в формате
//        "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью
//                класса StringBuilder).
//                - Проверить содержит ли номер документа последовательность abc и
//        вывети сообщение содержит или нет(причем, abc и ABC считается
//                одинаковой последовательностью).
//                - Проверить начинается ли номер документа с последовательности
//        555.
//                - Проверить заканчивается ли номер документа на
//        последовательность 1a2b.
        return inputString;
    }
}
