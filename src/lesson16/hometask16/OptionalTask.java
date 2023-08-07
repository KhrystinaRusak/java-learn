package lesson16.hometask16;

import java.util.Optional;
import java.util.Scanner;

public class OptionalTask {
    //    Создать метод, принимающий в качестве параметра String.
//    Если строка не null, вывести значение строки на консоль.
//    Если длина строки больше 4-х,вывести первые 4 символа строки,иначе вывести "JAVA".
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the string from the keyword: ");
        String inputString = sc.nextLine();
        OptionalString(inputString);
    }

    public static void OptionalString(String inputString) {
        OptionalTask optional = OptionalTask.ofNullable(null);
        if (optional.isPresent) {
            System.out.println(optional);
//            if(inputString.length() > 4) {
//                System.out.println();
//            } else {
//                System.out.println("JAVA");
//            }
            // optional.( name -> (inputString.length() > 4))::printf());
            boolean isMoreFour = inputString.filter(inputString -> inputString.length() > 4).isPresent();
            String elseLength = Optional.ofNullable(inputString).orElse("JAVA");
            System.out.println(elseLength);
        }
    }
}
