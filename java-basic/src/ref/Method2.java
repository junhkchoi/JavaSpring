package ref;

public class Method2 {
    public static void main(String[] args) {
        Student student1 = createStudent("최준혁", 10, 20);
        // Student student1 = new Student();
        // initStudent(student1, "최준혁", 22, 90);
        
        Student student2 = createStudent("임준호", 20, 30);
        // Student student2 = new Student();
        // initStudent(student2, "임준호", 23, 100);

        printStudent(student1);
        printStudent(student2);
    }
    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;

        return student;
    }

    // static void initStudent(Student student, String name, int age, int grade) {
    //     student.name = name;
    //     student.age = age;
    //     student.grade = grade;
    // }

    static void printStudent(Student student) {
        System.out.println(
            "이름: " + student.name +
            " 나이: " + student.age +
            " 성적: " + student.grade
        );
    } 
}
