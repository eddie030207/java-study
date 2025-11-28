package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {
    // 코드 작성
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> dictionary = new HashMap<>();

        System.out.println("==단어 입력 단계==");
        while (true) {
            System.out.print("영어 단어를 입력하세요 (종료는 'q'): ");
            String word = sc.nextLine();
            if (word.equals("q")) {
                break;
            }
            System.out.print("한글 뜻을 입력하세요: ");
            String meaning = sc.nextLine();
            dictionary.put(word, meaning);
        }

        System.out.println("==단어 검색 단계==");
        while (true) {

            System.out.print("찾을 영어 단어를 입력하세요 (종료는 'q'): ");
            String searchWord = sc.nextLine();
            if (searchWord.equals("q")) {
                break;
            }

            if (dictionary.containsKey(searchWord)) {
                System.out.println(searchWord + "의 뜻: " + dictionary.get(searchWord));
            } else {
                System.out.println(searchWord + "은(는) 사전에 없는 단어입니다.");
            }
        }
    }
}
