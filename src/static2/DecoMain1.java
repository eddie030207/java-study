package static2;

public class DecoMain1 {
    public static void main(String[] args) {
        String s = "Hello World";

        DecoUtil1 decoUtil1 = new DecoUtil1();

        String deco = decoUtil1.deco(s);
        System.out.println("before : " + s);

        System.out.println("after : " + deco);
    }
}

