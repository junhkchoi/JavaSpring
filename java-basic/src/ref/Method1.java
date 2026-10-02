package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student();
        initStudent(student1, "최준혁", 22, 90);
        // student1.name = "최준혁";
        // student1.age = 22;
        // student1.grade = 90;

        Student student2 = new Student();
        initStudent(student2, "임준호", 23, 100);
        // student2.name = "임준호";
        // student2.age = 23;
        // student2.grade = 100;
        
        // System.out.println("이름: " + student1.name);
        // System.out.println("이름: " + student2.name);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade) {
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student) {
        System.out.println(
            "이름: " + student.name +
            " 나이: " + student.age +
            " 성적: " + student.grade
        );
    } 
}
