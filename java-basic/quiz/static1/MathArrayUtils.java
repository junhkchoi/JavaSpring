package quiz.static1;

public class MathArrayUtils {
    
    private MathArrayUtils() {
        // private로 생성자 생성 제한!
    }
    
    static void sum(int[] array) {
        int i = 0;
        for (int n : array) {
            i += n;
        }
        System.out.println("배열의 합: " + i);
    }
    static void average(int[] array) {
        double i = 0;
        for (int n : array) {
            i += n;
        }
        System.out.println("배열의 평균: " + i / array.length);
    }
    static void min(int[] array) {
        int i = array[0];
        for (int n : array) {
            if (i >= n) {
                i = n;
            }
        }
        System.out.println("최솟값: " + i);
    }
    static void max(int[] array) {
        int i = array[0];
        for (int n : array) {
            if (i <= n) {
                i = n;
            }
        }
        System.out.println("최댓값: " + i);
    }
}
