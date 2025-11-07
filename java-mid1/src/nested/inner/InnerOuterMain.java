package nested.inner;

public class InnerOuterMain {
    public static void main(String[] args) {
        InnerOuter outer = new InnerOuter();
        InnerOuter.Inner inner = outer.new Inner(); // new 선언을 해줘야 Inner 클래스가 outer 인스턴스 안에 Inner 클래스를 사용한 인스턴스를 만들거라는 걸 알 수 있음.
        inner.print();

        System.out.println("inner.getClass() = " + inner.getClass());

        new InnerOuter().new Inner();

    }
}
