package lang.string.chaining;

public class MethodChainingMain3 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();

        //메서드 체이닝 기법 (메서드 호출의 결과로 자기 자신의 참조값을 반환하면, 반환된 참조값을 통해 메서드 호출을 계속 이어갈 수 있다.
        int result = adder.add(1).add(2).add(3).getValue();

        System.out.println("result = " + result);

    }
}
