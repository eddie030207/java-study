package static2;

public class DecoMain2 {
    public static void main(String[] args) {
        String s = "Hello World";
        String deco = DecoUtil2.deco(s); // 인스턴스(객체) 생성 없이 바로 클래스명을 통해 직접 불러옴
        System.out.println("before : " + s);
        System.out.println("after : " + deco);
    }
}

