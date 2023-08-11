package lesson14;

import java.util.*;

public class ArrayListIntroduction {
    public static void main(String[] args) {
        Object[] mass1;
        String[] strMass2;


        List list = new ArrayList();
        // List<String> list2 = new ArrayList<>();
        list.add(10);
        list.add("text");
        list.add(true);
        System.out.println("SIZE is " + list.size());
        System.out.println("SIZE is " + list.get(0));
        System.out.println("SIZE is " + list.contains(10));
        System.out.println(list.isEmpty());
        System.out.println(list.remove((Object) 10));
        for (Object el : list) {
            System.out.println(el + " ");
        }

        Set set = new HashSet(list);
        list.add(10);
        list.add("text");
        list.add(true);
        printCollection(set);

        System.out.println(list.containsAll(set));
        System.out.println(list.addAll(set));
    }

    private static void printCollection(Collection collection) {
        for (Object el : collection) {
            System.out.println(el + " ");
        }
        System.out.println();
    }
}
