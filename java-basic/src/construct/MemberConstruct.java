package construct;

public class MemberConstruct {
    
    String name;
    int age;
    int grade;
    MemberConstruct(String name) {
        this(name, 12);
    }

    MemberConstruct(String name, int age) { //생성자 오버로딩
        this(name, age, 50);
        //this()를 사용하면 생성자 내부에서 다른 생성자를 불러올 수 있다
        // 코드 첫줄에만 적을 수 있다

        // this.name = name;
        // this.age = age;
        // this.grade = 50;
    }


    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출");
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
