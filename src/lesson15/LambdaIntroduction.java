package lesson15;

import java.util.function.BiFunction;

public class LambdaIntroduction {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> compareToFunc = (a, b) -> {
            if (a > b) {
                return a;
            } else if (a < b) {
                return b;
            } else {
                return 0;
            }
        };
        System.out.println(compareToFunc.apply(4, 6));
    }
}
