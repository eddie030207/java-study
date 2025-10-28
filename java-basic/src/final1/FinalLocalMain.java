package final1;

public class FinalLocalMain {
    public static void main(String[] args) {
        // final local variable 1
        final int data1;
        data1 = 10; // 최초 한 번만 지정 가능
        //data1 = 20; // 컴파일 오류

        // final local variable 2
        final int data2 = 10;
        // data2 = 20; // 컴파일 오류

    }

    static void method(final int parameter){
        //parameter = 20; //컴파일 오류
    }
}
