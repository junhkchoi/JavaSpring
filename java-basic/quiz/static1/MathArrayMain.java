package quiz.static1;

import static quiz.static1.MathArrayUtils.*;

public class MathArrayMain {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        sum(array);
        MathArrayUtils.average(array);
        MathArrayUtils.max(array);
        MathArrayUtils.min(array);


    }
}
