package poly.basic;

// 업캐스팅 vs 다운캐스팅
public class CastingMain3 {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent1 = (Parent) child; //업캐스팅은 캐스팅 괄호가 생략 권장함.
        Parent parent2 = child; //괄호 생략한 버전.

        parent1.parentMethod();
        parent2.parentMethod();

    }
}
