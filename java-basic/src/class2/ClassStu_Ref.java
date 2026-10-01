package class2;

public class ClassStu_Ref {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.studentName = "최준혁";
        student1.studentAge = 22;
        student1.studentGrade = 90;

        student2.studentName = "전호윤";
        student2.studentAge = 24;
        student2.studentGrade = 80;

        Student[] students = new Student[] {student1, student2};
        
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println(
                "이름: " + s.studentName +
                "\n나이: " + s.studentAge + 
                "\n점수: " + s.studentGrade + "\n"
            );
        }
        
        // for (Student student : students) {
        //     System.out.println(
        //         "이름: " + student.studentName +
        //         "\n나이: " + student.studentAge + 
        //         "\n점수: " + student.studentGrade + "\n"
        //     );
        // }
    }
}
