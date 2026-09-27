package array;

public class ArrayDi1 {
    public static void main(String[] args) {
        int[][] arr = new int[7][10];
        int i = 1;

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col < arr[row].length; col++) {
                arr[row][col] = i++;
            }
        }

        for(int row = 0; row < arr.length; row++) {
            System.out.println();
            for(int col = 0; col < arr[row].length; col++) {
                System.out.print(arr[row][col] + " ");
            }
        }
    }
}
