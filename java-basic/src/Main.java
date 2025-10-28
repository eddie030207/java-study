//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       String[] students = {"학생1", "학생2"};
       int[] age = {15, 16};
       int[] grade = {90, 80};

       for (int i = 0; i < students.length; i++) {
           System.out.println("이름 : " + students[i] + " 나이 : " + age[i] + " 성적 : " + grade[i]);
       }

    }
}   