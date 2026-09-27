package array;

public class ArrayDi0 {
    public static void main(String[] args) {
        int[][] arr = new int[][] {
            {1, 2, 3},
            {4, 5, 6, 7, 10}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                System.out.println(arr[row][col]);
            }
        }
    }
}
