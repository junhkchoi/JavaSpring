package array;

public class Array2 {
    public static void main(String[] args) {
        //int[] student = {10, 20, 30, 100};

        /* 
        int[] student;
        student = new int[5];
        student[0] = 1;
        student[1] = 10;
        */

        int[] student = new int[] {10, 20, 30};

        for (int i = 0 ; i < student.length ; i++) {
            System.out.println("학생" + (i + 1) + " 점수: " + student[i]);
        }
    }
}
