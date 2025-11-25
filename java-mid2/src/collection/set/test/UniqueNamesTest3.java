package collection.set.test;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class UniqueNamesTest3 {
    public static void main(String[] args) {
        // TODO
        Set<Integer> set = new TreeSet<>(List.of(30, 20, 10, 10, 10));
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
