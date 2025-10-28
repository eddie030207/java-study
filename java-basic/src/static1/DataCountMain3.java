package static1;

public class DataCountMain3 {
    public static void main(String[] args) {
        Data3 data1 = new Data3("A");
        System.out.println("A count = " + Data3.count);

        Data3 data2 = new Data3("B");
        System.out.println("B count = " + Data3.count);

        Data3 data3 = new Data3("C");
        System.out.println("C count = " + Data3.count);

        // 추가
        // Access by Instance(data4) - NOT Recommended (코드를 읽을 때, 인스턴스 변수에 접근하는 것처럼 느낄 오해의 소지가 있어서)
        Data3 data4 = new Data3("D");
        System.out.println("D count = " + data4.count);

        // Access by Class(Data3) - Recommended (정적 변수에 접근할 때에는 Class를 통해 다이렉트로 접근하자)
        System.out.println("D count = " + Data3.count);
    }
}
