package class1;

public class ClassStart {
    public static void main(String[] args) {
        // String student1Name = "학생1";
        // int student1Age = 15;
        // int student1Grage = 80;

        // String student2Name = "학생1";
        // int student2Age = 15;
        // int student2Grage = 80;

        String[] studentNames = new String[] {"학생1", "학생2"};
        int[] studentAges = new int[] {15, 16};
        int[] studentGrages = new int[] {80, 90};

        for(int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i]);
            
        }
    }
}