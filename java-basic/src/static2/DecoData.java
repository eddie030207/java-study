package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    // static에서는 instance 변수, 메서드에 접근 못한다 (마치 붕어빵을 안만들었는데 붕어빵에 뭐 들어가는지 못 참조하는 것임)
    // instance에서는 instance / class 변수, 메서드 모두 접근 가능하다 (붕어빵을 만들었으니 뭐 들어갔는지, 그리고 붕어빵틀에 관련된 메서드도 불러오기 가능)
    public static void staticCall() {
        //instanceValue++; // Access by Instance Variable, Compile Error
        //instanceMethod(); // Access by Instance Method, Compile Error


        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        staticValue++;
        staticMethod();
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);;
    }

}
