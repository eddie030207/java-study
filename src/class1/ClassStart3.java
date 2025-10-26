package class1;

import java.sql.SQLOutput;

public class ClassStart3 {
    public static void main(String[] args) {
        Student student1; // Student 타입을 받을 수 있는 변수를 선언한다.
        student1 = new Student(); //student1 -> 이게 객체(인스턴스)
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("이름:" + student1.name + " 나이:" + student1.age + "성적:" + student1.grade);
        System.out.println("이름:" + student2.name + " 나이:" + student2.age + "성적:" + student2.grade);

        // 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요하다. 이 설계도가 바로 클래스이다.
        // 설계도인 클래스를 사용해서 실제 메모리에 만들어진 실체를 객체 또는 인스턴스라 한다.
    }
}
