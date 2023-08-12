package lesson18.Counter.hometask;

//        Сортировка массива цифр в нескольких потоках различными алгоритмами:
//        сортировка вставками;
//        сортировка выбором;
//        сортировка пузырьком.
//        Каждый вид сортировки должен запускаться в отдельном потоке.
//        После вывести результат отсортированных массивов в консоль, указав вид сортировки.

public class SortArrayTwoThread {
    public static void main(String[] args) {
        SortArrayTwoThread myRunnable = new SortArrayTwoThread();

        Thread insertSort = new Thread(myRunnable);
        Thread selectSort = new Thread(myRunnable);
        Thread bubbleSort = new Thread(myRunnable);

        insertSort.start();
        selectSort.start();
        bubbleSort.start();
    }
}
