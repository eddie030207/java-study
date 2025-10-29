package lang.immutable.address;

public class RefMain1_1 {
    public static void main(String[] args) {
        // 참조형 변수는 하나의 인스턴스를 공유할 수 있다.
        Address a = new Address("Seoul");
        Address b = a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("Busan"); // b의 값을 부산으로 변경해야 하는 경우를 가정
        System.out.println("a = " + a); //Side Effect 발생
        System.out.println("b = " + b);
    }
}
