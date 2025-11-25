package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest1 {
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 10, 10, 10};

        // TODO
        Set<Integer> set = new HashSet<>();
        set.addAll(List.of(inputArr));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
