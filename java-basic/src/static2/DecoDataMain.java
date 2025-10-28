package static2;

public class DecoDataMain {
    public static void main(String[] args) {
        System.out.println("1. Static Call");
        DecoData.staticCall();

        System.out.println("2. Instance Call_1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. Instance Call_2");
        DecoData data2 = new DecoData();
        data2.instanceCall();

        // 추가
        // Access by Instance
        DecoData data3 = new DecoData();
        data3.staticCall(); // 인스턴스를 통한 정적 메서드 호출(인스턴스 메서드를 호출하는 것 같아 추천되지 않음)


        //Access by Class
        DecoData.staticCall(); // 따라서 이렇게 직접적으로 클래스를 통해 정적 메서드에 접근해야 함
    }
}
