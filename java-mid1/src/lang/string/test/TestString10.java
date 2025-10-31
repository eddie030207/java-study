package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";
        String[] fruitArray = fruits.split(",");



        for (String f : fruitArray) {
            System.out.println(f);

        }

        String joinedString = String.join("->", fruitArray);
        System.out.println("joinedString = " + joinedString);

    }
}
