package lesson18.Counter.hometask;

public class AddToListTwoThread extends AddToListRunner {
    public void run() {
        System.out.println("The job is doing in the thread ");
    }

    public static double MaxArray(String stringInput) {
        double max = Double.MAX_VALUE;
        for (double element : Array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public static double MinArray(String stringInput) {
        double min = Double.MIN_VALUE;
        for (double element : Array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
