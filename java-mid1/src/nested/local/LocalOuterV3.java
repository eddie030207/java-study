package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {
    private int outInstanceVar = 3; // 인스턴스 변수

    public Printer process(int paramVar) {
        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다.

        //지역 클래스도 인터페이스를 상속 받을 수 있다.(LocalOuterV1 클래스와 기능은 같음)
        class LocalPrinter implements Printer {
            int value = 0; // LocalPrinter의 인스턴스 변수

            @Override
            public void print() {
                System.out.println("value = " + value);

                //인스턴스는 지역 변수보다 더 오래 살아남는다.
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        //printer.print(); 를 여기서 실행하지 않고 Printer 인스턴스만 반환한다.

        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);

        //printer.print()를 process() 메서드 내부가 아닌 main 메서드에서 실행해본다.(process()의 스택 프레임이 사라진 이후에 실행)
        printer.print();


        //추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("field = " + field);
        }

    }
}
