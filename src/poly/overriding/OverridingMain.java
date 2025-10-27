package poly.overriding;

public class OverridingMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스를 참조
        Child child = new Child();
        System.out.println("Child -> Child");
        System.out.println("value = " + child.value);
        child.method();

        //부모 변수가 부모 인스턴스를 참조
        Parent parent = new Parent();
        System.out.println("Parent -> Parent");
        System.out.println("value = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스를 참조(다형적 참조)
        Parent parent2 = new Child();
        System.out.println("Parent -> Child");
        System.out.println("value = " + parent2.value); // 변수는 오버라이딩 X
        parent2.method(); //childMethod -> 부모메서드가 아닌 자식메서드에 다운캐스팅 없이 접근 가능 -- 메서드 오버라이딩 O
    }
}
