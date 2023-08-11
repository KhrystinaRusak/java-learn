package lesson18.Counter.hometask;

import java.util.Arrays;
import java.util.Scanner;

import static lesson18.Counter.hometask.AddToListTwoThread.MaxArray;
import static lesson18.Counter.hometask.AddToListTwoThread.MinArray;

public class AddToListRunner {

    //        Пользователь вводит с клавиатуры значения для добавления в список.
//        После чего запускаются два потока.
//        Первый поток находит максимум в массиве, второй — минимум.
//        Результаты вычислений возвращаются в метод main().
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input from the keyword double numbers:");
        String stringInput = sc.nextLine();
        double[] Array = new double[stringInput.length()];
        Arrays.parallelSetAll(Array, index -> Math.random() + index);

        var thread1 = new Thread(String.valueOf(MaxArray(stringInput)));
        //thread1.sleep(10);
        var thread2 = new Thread(String.valueOf(MinArray(stringInput)));

        thread1.start();
        thread2.start();
    }
}
