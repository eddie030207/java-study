package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true) {
            int num = sc.nextInt();
            if (num == 0) {
                break;
            }
            list.add(num);
        }

        System.out.println("출력");
        System.out.println(Arrays.toString(list.toArray()).replace("[", "").replace("]", ""));
    }
}
