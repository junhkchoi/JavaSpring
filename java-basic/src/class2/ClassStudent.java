package class2;

public class ClassStudent {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.studentName = "최준혁";
        student1.studentAge = 22;
        student1.studentGrade = 90;

        student2.studentName = "전호윤";
        student2.studentAge = 24;
        student2.studentGrade = 80;

        Student[] students = new Student[2];
        students[0] = student1;
        students[1] = student2;

        for (Student student : students) {
            System.out.println(
                "이름: " + student.studentName +
                "\n나이: " + student.studentAge + 
                "\n점수: " + student.studentGrade + "\n"
            );
        }
        
    }
}
