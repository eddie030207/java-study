package extends1.super2;

public class ClassC extends ClassB {
    public ClassC() {
        super(10, 20); //기본 생성자가 아니므로 반드시 super()을 해줘야한다.
        System.out.println("ClassC() 생성자");
    }
}
