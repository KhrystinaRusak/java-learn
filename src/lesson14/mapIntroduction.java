package lesson14;

import java.util.HashMap;
import java.util.Map;

public class mapIntroduction {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Monday");
        map.put(2, "Tuesday");

        System.out.println(map.get(2));
        System.out.println(map.get("Monday"));

        for (Object key : map.keySet()) {
            System.out.println("key = " + key + ", value= " + map.get(key));
        }
    }
}
