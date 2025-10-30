package lang.string.method;

public class StringUtilsMain2 {
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        String str = "Hello, Java!";

        //format 메서드
        String strFormat = String.format("num = %d, bool = %b, str = %s", num, bool, str);
        System.out.println(strFormat);

        String strFormat2 = String.format("숫자: %.2f", 10.1234);
        System.out.println("소수점 둘째 자리까지 출력 = " + strFormat2);

        //printf()
        System.out.printf("숫자: %.2f\n", 10.1234);

        //matches 메서드
        String regex = "Hello, (Java!|World)";
        System.out.println("'str'이 패턴과 일치하는가? " + str.matches(regex));
        System.out.println("Hello, World! : " + str.matches(regex));
    }
}
