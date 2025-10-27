package extends1.super2;

public class ClassB extends ClassA {

    public ClassB(int a) {
        this(a, 0); // 내 클래스에 있는 다른 생성자를 호출하라는 뜻.
        //super(); // 기본 생성자 생략 가능
        System.out.println("ClassB() 생성자 a = " + a);
    }

    public ClassB(int a, int b) {
        super(); // 기본 생성자 생략 가능
        System.out.println("ClassB() 생성자 a = " + a + ", b = " + b);
    }

    // 생성자의 첫 줄에는 this()나 super() 둘 중 하나는 있어야한다. 동시엔 사용하지 못한다.
    // this()로 다른 생성자를 호출하더라도, 그 다른 생성자 안에서는 super()이 호출되어야한다.
}
