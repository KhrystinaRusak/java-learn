package lesson14.hometask14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Пользователь вводит набор чисел в виде одной строки с клавиатуры.
 * Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
 * Вывести результат на экран. При решении использовать коллекции.
 * */
public class Collection1 {
    public static void main(String[] args) {
        System.out.println("Input the array of numbers in one line from the keyword: ");
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        List<String> myString = new ArrayList<String>();
        for (int i = 0; i < inputString.length(); i++) {
            myString.add(String.valueOf(inputString.charAt(i)));
        }
        ((ArrayList<String>) myString).trimToSize();
        System.out.println("Original LinkedList: " + inputString);
        System.out.println("Modified LinkedList: " + myString);
    }
}
