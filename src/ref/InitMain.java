package ref;

public class InitMain {
    public static void main(String[] args) {
        InitData data = new InitData();
        System.out.println("value1 = " + data.value1); // 직접 초기화를 하지 않았음에도 0으로 초기화되어 출력됨
        System.out.println("value2 = " + data.value2);
    }
}  