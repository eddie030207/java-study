package poly.overriding;

public class Child extends Parent {
    public String value = "child";

    @Override // 오버라이딩 된 메서드는 항상 우선권을 가진다.
    public void method() {
        System.out.println("Child.method");
    }
}
