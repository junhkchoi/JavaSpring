package quiz.array;

public class ArrayEx1 {
    public static void main(String[] args) {
        int sum = 0;
        int[] students = new int[] {90, 80, 70, 60, 50};

        for (int student : students) {
            sum += student;
        }
        double average = (double) sum / students.length;
        System.out.println("총 점수: " + sum);
        System.out.println("평균: " + average);
    }
}
