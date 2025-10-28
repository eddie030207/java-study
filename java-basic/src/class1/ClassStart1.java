package class1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;
        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;
        System.out.println("이름:" + student1Name + " 나이:" + student1Age + " 성적:" + student1Grade);
        System.out.println("이름:" + student2Name + " 나이:" + student2Age + " 성적:" + student2Grade);
    }
    // Array의 한계 : ex) 학생 2의 데이터를 제거하려면 각각의 배열마다 학생2의 요소를 정확하게 찾아서 제거해야함. 즉, 인덱스 순서를
    // 항상 정확하게 맞추어야하는데, 이렇게 하면 특정 학생의 데이터를 변경할 때 실수할 가능성이 높아진다. 사람이 관리하기에 좋은 코드가 아님.
    // 사람이 관리하기에 좋은 방식은 학생이라는 개념을 하나로 묶는 것이다.
}
