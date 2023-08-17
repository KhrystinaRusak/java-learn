package hometask10;

import java.text.MessageFormat;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        System.out.println("Input the string from the keyword:");
        Scanner sc = new Scanner(System.in);
        String inputStr = sc.next();
        //StringMethods(inputStr);
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
            String[] inputStrBlock = inputStr.split("-");
            System.out.println(inputStrBlock + " is valid integer of numbers");
            // Вывести на экран в одну строку два первых блока по 4 цифры.
            System.out.println("The first blocks are "+inputStr.substring(0,4)+" and "+inputStr.substring(5,9));
           // - Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
            System.out.println("The number of document, where blocks consist of three characters replace on * "+inputStr.replace("yyy", "*"));
            // - Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
            System.out.println("The numbers from document in the format yyy/yyy/y/y in LowerCase "+inputStr.trim().toLowerCase().contains("yyyy/yyy/y/y"));
//                - Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью класса StringBuilder).
            StringBuilder newStr = new StringBuilder(inputStr.trim().toUpperCase());
            System.out.println("The chars from the string in format \"Letters:yyy/yyy/y/y\" in UpperCase "+newStr);
//                - Проверить содержит ли номер документа последовательность abc и вывеcти сообщение содержит или нет(причем, abc и ABC считается
//                одинаковой последовательностью).
            System.out.println("The string contain abc without differences between UpperCase and LowerCase is "+inputStr.trim().toLowerCase().contains("abc"));
//                - Проверить начинается ли номер документа с последовательности 555.
            System.out.println("The number of document is starts with 555 "+inputStr.startsWith("555"));
//          - Проверить заканчивается ли номер документа на последовательность 1a2b.
            System.out.println("The number of document is end with 1a2b "+inputStr.endsWith("1a2b"));
        } catch (Exception e) {
            System.out.println(inputStr + " isn't a numbers of string or have too short length");
        }
    }
}
