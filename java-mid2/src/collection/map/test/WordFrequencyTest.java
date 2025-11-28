package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest {
    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        // 코드 작성
        Map<String, Integer> map = new HashMap<>();
        for (String fruit : text.split(" ")) {
            if (map.containsKey(fruit)) {
                map.put(fruit, map.get(fruit) + 1);
                continue;
            }
            map.put(fruit, 1);
        }

        System.out.println(map);
    }
}
