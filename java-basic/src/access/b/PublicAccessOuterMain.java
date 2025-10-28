package access.b;

//import access.a.DefaultClass1;
//import access.a.DefaultClass2;

import access.a.PublicClass;

public class PublicAccessOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가(DefaultClass1, DefaultClass2의 접근 제한자가 default이기 때문)
//        DefaultClass1 class1 =  new DefaultClass1();
//        DefaultClass2 class2 =  new DefaultClass2();
    }
}
