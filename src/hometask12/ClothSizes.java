package hometask12;

public class ClothSizes {
    // Создать перечисление, содержащее размеры одежды (XXS, XS, S, M, L).
    // Также перечисление должно содержать числовое значение euroSize(32, 34, 36, 38, 40), соответствующее каждому размеру.
    enum Sizes {
        L("40"),
        M("38"),
        S("36"),
        XS("34"),
        XXS("32");

        private String action;

        public String getAction() {
            return this.action;
        }

        private Sizes(String action) {
            this.action = action;
        }
    }

    public static void main(String[] args) {
        Sizes[] sizes = Sizes.values();

        for (Sizes size : sizes) {
            System.out.println("Size : " + size.name() + " action: " + size.getAction());
        }

    }
//        Перечисление содержит description и метод getDescription, возвращающий строку “Детский размер” для XXS и "Взрослый размер" для остальных.
//        Создать конструктор, принимающий на вход euroSize.
//        Создать конструктор, принимающий на вход description и euroSize.
//        Создать интерфейсы "Мужская Одежда" с методом "одетьМужчину" и "Женская Одежда" с методом "одетьЖенщину".
//        Создать абстрактный класс Одежда, содержащий переменные - размер одежды, стоимость, цвет.
//        Создать классы наследники Одежды
//        - Футболка (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
//        - Брюки (реализует интерфейсы "Мужская Одежда" и "Женская Одежда"),
//        - Юбка (реализует интерфейсы "Женская Одежда"), Галстук (реализует интерфейсы "Мужская Одежда").
//        Создать массив, содержащий все типы одежды.
//        Создать класс Ателье, содержащий методы одетьЖенщину, одетьМужчину, на вход которых будет поступать массив, содержащий все типы одежды.
//        Метод одетьЖенщину выводит на консоль всю информацию о женской одежде. То же самое для метода одетьМужчину.

}
