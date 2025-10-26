package static2.ex;

public class MathArrayUtils {

    private MathArrayUtils() {
        // private 생성자를 사용하여 인스턴스 생성을 막는다. (이 클래스에는 static 메서드만 있기 때문)
    }

    public static int sum(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static int max(int[] values) {
        int result = values[0];
        for (int value : values) {
            if (result < value) {
                result = value;
            }
        }
        return result;
    }

    public static int min(int[] values) {
        int result = values[0];
        for (int value : values) {
            if (result > value) {
                result = value;
            }
        }
        return result;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

}