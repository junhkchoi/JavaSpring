package array;

public class ForEach {
    public static void main(String[] args) {
        int[] numbers = new int[] {1, 2, 3, 4, 5};

        /*
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
         */

        // 향상된 for문 for-each
        // 그냥 배열을 첨부터 끝까지 탐색돌릴때 사용   
        for(int number : numbers) {
            System.out.println(number);
        }
    }
}
