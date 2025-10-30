package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("new String() == 비교 : " + (str1 == str2));
        System.out.println("new Strring() equals 비교 : " + str1.equals(str2));

        String str3 = "hello"; // 이렇게 선언하는 방식을 문자열 리터럴 이라고 한다.
        String str4 = "hello"; // String Pool에서 str3와 같은 참조값을 할당해준다. 따라서 논리적 동등성을 가지게 된다.
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + str3.equals(str4));
    }
}
